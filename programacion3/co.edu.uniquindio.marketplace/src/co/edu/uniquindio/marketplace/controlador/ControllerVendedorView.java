package controlador;

import aplicacion.Aplicacion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import modelo.Estado;
import modelo.Producto;

import java.util.Optional;

public class ControllerVendedorView {

        Aplicacion aplicacion;

        ModelFactoryController modelFactoryController;

        Producto productoSeleccionado;
        ControllerAdminView controllerAdminView;
        ObservableList<Producto> listaProductosVis = FXCollections.observableArrayList();
        @FXML
        private Button botonActualizar;

        @FXML
        private Button botonCargarImagen;

        @FXML
        private Button botonEliminar;

        @FXML
        private Button botonPublicar;

        @FXML
        private TextField campoCodigoProducto;

        @FXML
        private TextField campoCategoria;

        @FXML
        private TextField campoNombreProducto;

        @FXML
        private TextField campoPrecio;

        @FXML
        private TextField campoUrlImagen;

        @FXML
        private ComboBox<Estado> comboEstadoProducto;

        @FXML
        private TableColumn<Producto, String> columnaCategoria;

        @FXML
        private TableColumn<Producto, String> columnaCodigo;

        @FXML
        private TableColumn<Producto, String> columnaEstado;

        @FXML
        private TableColumn<Producto, String> columnaNombreP;

        @FXML
        private TableColumn<Producto, String> columnaPrecio;

        @FXML
        private TableView<Producto> tablaProductos;

        @FXML
        void eventoComboBox(ActionEvent event) {



        }

        @FXML
        void initialize () {
                modelFactoryController = ModelFactoryController.getInstance();
        }

        private void publicarProducto(){
            String codigo = campoCodigoProducto.getText();
            String nombreProducto = campoNombreProducto.getText();
            String rutaImagen= campoUrlImagen.getText();
            String categoria = campoCategoria.getText();
            double precio = Double.parseDouble(campoPrecio.getText());
            String estadoProducto = String.valueOf(comboEstadoProducto.getValue());

                if(datosValidosProducto(codigo,nombreProducto, rutaImagen, categoria, precio, estadoProducto)== true){
                        Producto producto= null;
                        producto = controllerAdminView.publicarProducto(codigo, nombreProducto, rutaImagen, categoria, precio, Estado.valueOf(estadoProducto));
                        if(producto != null){
                                listaProductosVis.add(producto);
                                mostrarMensaje("Notificación producto", "Producto creado", "El producto se ha creado con éxito", Alert.AlertType.INFORMATION);
                                refresh();
                                limpiarCamposVendedor();
                        }else{
                                mostrarMensaje("Notificación producto", "Producto no creado", "El producto con codigo " + codigo + " ya existe", Alert.AlertType.INFORMATION);
                        }
                }else{
                        mostrarMensaje("Notificación vendedor", "Vendedor no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
                }

        }

        @FXML

        void publicarProductoAction(ActionEvent event){publicarProducto();}

        @FXML
        void actualizarProductoAction(ActionEvent event){actualizarProducto();}

        @FXML
        void eliminarProductoAction(ActionEvent event){eliminarProducto();}



        private void actualizarProducto(){

                String codigo = campoCodigoProducto.getText();
                String nombreProducto = campoNombreProducto.getText();
                String rutaImagen= campoUrlImagen.getText();
                String categoria = campoCategoria.getText();
                double precio = Double.parseDouble(campoPrecio.getText());
                String estadoProducto = String.valueOf(comboEstadoProducto.getValue());

                //2. Validar la información
                if(datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto)== true){
                        Producto producto= null;
                        producto = controllerAdminView.actualizarProducto(codigo, nombreProducto, rutaImagen, categoria, precio, Estado.valueOf(estadoProducto),productoSeleccionado.getCodigo() );
                        if(producto != null){
                                refresh();
                                mostrarMensaje("Notificación producto", "Producto actualizado", "El producto se ha actualizado con éxito", Alert.AlertType.INFORMATION);
                                limpiarCamposVendedor();
                        }else{
                                mostrarMensaje("Notificación producto", "Producto no actualizado", "El producto no se ha actualizado", Alert.AlertType.INFORMATION);
                        }
                }else{
                        mostrarMensaje("Notificación producto", "Producto no actualizado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
                }


        }
        private void eliminarProducto(){
                boolean productoEliminado = false;


                if(productoSeleccionado != null){


                        if(mostrarMensajeConfirmacion("¿Estas seguro de elimininar al empleado?") == true){

                                productoEliminado = controllerAdminView.eliminarVendedor(productoSeleccionado.getCodigo());


                                if(productoEliminado == true){
                                        listaProductosVis.remove(productoSeleccionado);
                                        productoSeleccionado = null;

                                        tablaProductos.getSelectionModel().clearSelection();
                                        limpiarCamposVendedor();

                                        mostrarMensaje("Notificación producto", "Producto eliminado", "El producto se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                                }else{
                                        mostrarMensaje("Notificación producto", "Producto no eliminado", "El producto no se puede eliminar", Alert.AlertType.ERROR);
                                }
                        }
                }else{
                        mostrarMensaje("Notificación producto", "Producto no seleccionado", "Seleccionado un producto de la lista", Alert.AlertType.WARNING);
                }

        }




        private void limpiarCamposVendedor() {
                campoCodigoProducto.setText("");
                campoNombreProducto.setText("");
                campoUrlImagen.setText("");
                campoCategoria.setText("");
                campoPrecio.setText("");
                comboEstadoProducto.setItems(null);
        }

        private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType) {

                Alert aler = new Alert(alertType);
                aler.setTitle(titulo);
                aler.setHeaderText(header);
                aler.setContentText(contenido);
                aler.showAndWait();
        }

        private boolean mostrarMensajeConfirmacion(String mensaje) {

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setHeaderText(null);
                alert.setTitle("Confirmación");
                alert.setContentText(mensaje);
                Optional<ButtonType> action = alert.showAndWait();

                if (action.get() == ButtonType.OK) {
                        return true;
                } else {
                        return false;
                }
        }

        void refresh(){
                tablaProductos.getItems().clear();
                tablaProductos.setItems(getListaProductosVis());
        }

        private boolean datosValidosProducto(String codigo,String nombreProducto, String rutaImagen, String categoria,  double precio, String estadoProducto) {

                String mensaje = "";

                if(codigo == null || codigo.equals(""))
                        mensaje += "El codigo del producto es invalido \n" ;

                if(nombreProducto == null || nombreProducto.equals(""))
                        mensaje += "El nombre del producto es invalido \n" ;

                if(rutaImagen == null || rutaImagen.equals(""))
                        mensaje += "La ruta de la imagen es invalida \n" ;

                if(categoria == null || categoria.equals(""))
                        mensaje += "La categoría del producto es invalida \n" ;

                if(precio<=0)
                        mensaje += "El precio del producto es invalido \n" ;
                if(estadoProducto == null || estadoProducto.equals(""))
                        mensaje += "La direccion es invalida \n" ;



                if(mensaje.equals("")){
                        return true;
                }else{
                        mostrarMensaje("Notificación cliente","Datos invalidos",mensaje, Alert.AlertType.WARNING);
                        return false;
                }
        }

        public ObservableList<Producto> getListaProductosVis() {
                return listaProductosVis;
        }

        public void setListaProductosVis(ObservableList<Producto> listaProductosVis) {
                this.listaProductosVis = listaProductosVis;
        }

        public Aplicacion getAplicacion() {
                return aplicacion;
        }

        public void setAplicacion(Aplicacion aplicacion) {
                this.aplicacion = aplicacion;
        }
}




