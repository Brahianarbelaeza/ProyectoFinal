package controlador;

import aplicacion.Aplicacion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modelo.Estado;
import modelo.Producto;

import modelo.Vendedor;

import java.util.Optional;


public class ControladorMarketplaceView  {
    Aplicacion aplicacion;
    ModelFactoryController modelFactoryController;
    ControllerAdminView controllerAdminView;

    ControllerVendedorView controllerVendedorView;
    Vendedor vendedorSeleccionado;
    Producto productoSeleccionado = new Producto();
    ObservableList<Vendedor> listaVendedoresData = FXCollections.observableArrayList();
    ObservableList<Producto> listaProductosVis = FXCollections.observableArrayList();

    ObservableList<Vendedor> listaSugerenciasAmistad = FXCollections.observableArrayList();
    ObservableList<Vendedor> listaSolicitudesAmistad = FXCollections.observableArrayList();
    ObservableList<Vendedor> listaContactos = FXCollections.observableArrayList();
    ObservableList<Producto> listaPublicaciones = FXCollections.observableArrayList();

    @FXML
    private TextField campoApellido;

    @FXML
    private TextField campoCategoria;

    @FXML
    private TextField campoCategoria1;

    @FXML
    private TextField campoCategoria2;

    @FXML
    private TextField campoCategoria3;

    @FXML
    private TextField campoCategoria4;

    @FXML
    private TextField campoCategoria5;

    @FXML
    private TextField campoCategoria6;

    @FXML
    private TextField campoCategoria7;

    @FXML
    private TextField campoCategoria8;

    @FXML
    private TextField campoCategoria9;

    @FXML
    private TextField campoCedula;

    @FXML
    private TextField campoCodigoProducto;

    @FXML
    private TextField campoCodigoProducto1;

    @FXML
    private TextField campoCodigoProducto2;

    @FXML
    private TextField campoCodigoProducto3;

    @FXML
    private TextField campoCodigoProducto4;

    @FXML
    private TextField campoCodigoProducto5;

    @FXML
    private TextField campoCodigoProducto6;

    @FXML
    private TextField campoCodigoProducto7;

    @FXML
    private TextField campoCodigoProducto8;

    @FXML
    private TextField campoCodigoProducto9;

    @FXML
    private TextField campoContrasena;

    @FXML
    private TextField campoCuenta;

    @FXML
    private TextField campoDireccion;

    @FXML
    private TextField campoNombre;

    @FXML
    private TextField campoNombreProducto;

    @FXML
    private TextField campoNombreProducto1;

    @FXML
    private TextField campoNombreProducto2;

    @FXML
    private TextField campoNombreProducto3;

    @FXML
    private TextField campoNombreProducto4;

    @FXML
    private TextField campoNombreProducto5;

    @FXML
    private TextField campoNombreProducto6;

    @FXML
    private TextField campoNombreProducto7;

    @FXML
    private TextField campoNombreProducto8;

    @FXML
    private TextField campoNombreProducto9;

    @FXML
    private TextField campoPrecio;

    @FXML
    private TextField campoPrecio1;

    @FXML
    private TextField campoPrecio2;

    @FXML
    private TextField campoPrecio3;

    @FXML
    private TextField campoPrecio4;

    @FXML
    private TextField campoPrecio5;

    @FXML
    private TextField campoPrecio6;

    @FXML
    private TextField campoPrecio7;

    @FXML
    private TextField campoPrecio8;

    @FXML
    private TextField campoPrecio9;

    @FXML
    private TextField campoUrlImagen;

    @FXML
    private TextField campoUrlImagen1;

    @FXML
    private TextField campoUrlImagen2;

    @FXML
    private TextField campoUrlImagen3;

    @FXML
    private TextField campoUrlImagen4;

    @FXML
    private TextField campoUrlImagen5;

    @FXML
    private TextField campoUrlImagen6;

    @FXML
    private TextField campoUrlImagen7;

    @FXML
    private TextField campoUrlImagen8;

    @FXML
    private TextField campoUrlImagen9;

    @FXML
    private TableColumn<Vendedor, String> colApellidoVendedor;

    @FXML
    private TableColumn<Vendedor, String> colCedulaVendedor;

    @FXML
    private TableColumn<Vendedor, String> colCuentaVendedor;

    @FXML
    private TableColumn<Vendedor, String> colDireccionVendedor;

    @FXML
    private TableColumn<Vendedor, String> colNombreVendedor;

    @FXML
    private TableColumn<Producto, String> columnaCategoria;

    @FXML
    private TableColumn<Producto, String> columnaCategoria1;

    @FXML
    private TableColumn<Producto, String> columnaCategoria2;

    @FXML
    private TableColumn<Producto, String> columnaCategoria3;

    @FXML
    private TableColumn<Producto, String> columnaCategoria4;

    @FXML
    private TableColumn<Producto, String> columnaCategoria5;

    @FXML
    private TableColumn<Producto, String> columnaCategoria6;

    @FXML
    private TableColumn<Producto, String> columnaCategoria7;

    @FXML
    private TableColumn<Producto, String> columnaCategoria8;

    @FXML
    private TableColumn<Producto, String> columnaCategoria9;

    @FXML
    private TableColumn<Producto, String> columnaCodigo;

    @FXML
    private TableColumn<Producto, String> columnaCodigo1;

    @FXML
    private TableColumn<Producto, String> columnaCodigo2;

    @FXML
    private TableColumn<Producto, String> columnaCodigo3;

    @FXML
    private TableColumn<Producto, String> columnaCodigo4;

    @FXML
    private TableColumn<Producto, String> columnaCodigo5;

    @FXML
    private TableColumn<Producto, String> columnaCodigo6;

    @FXML
    private TableColumn<Producto, String> columnaCodigo7;

    @FXML
    private TableColumn<Producto, String> columnaCodigo8;

    @FXML
    private TableColumn<Producto, String> columnaCodigo9;

    @FXML
    private TableColumn<Producto, String> columnaEstado;

    @FXML
    private TableColumn<Producto, String> columnaEstado1;

    @FXML
    private TableColumn<Producto, String> columnaEstado2;

    @FXML
    private TableColumn<Producto, String> columnaEstado3;

    @FXML
    private TableColumn<Producto, String> columnaEstado4;

    @FXML
    private TableColumn<Producto, String> columnaEstado5;

    @FXML
    private TableColumn<Producto, String> columnaEstado6;

    @FXML
    private TableColumn<Producto, String> columnaEstado7;

    @FXML
    private TableColumn<Producto, String> columnaEstado8;

    @FXML
    private TableColumn<Producto, String> columnaEstado9;

    @FXML
    private TableColumn<Producto, String> columnaNombreP;

    @FXML
    private TableColumn<Producto, String> columnaNombreP1;

    @FXML
    private TableColumn<Producto, String> columnaNombreP2;

    @FXML
    private TableColumn<Producto, String> columnaNombreP3;

    @FXML
    private TableColumn<Producto, String> columnaNombreP4;

    @FXML
    private TableColumn<Producto, String> columnaNombreP5;

    @FXML
    private TableColumn<Producto, String> columnaNombreP6;

    @FXML
    private TableColumn<Producto, String> columnaNombreP7;

    @FXML
    private TableColumn<Producto, String> columnaNombreP8;

    @FXML
    private TableColumn<Producto, String> columnaNombreP9;

    @FXML
    private TableColumn<Producto, String> colimagen;

    @FXML
    private TableColumn<Producto, String> colimagen1;
    @FXML
    private TableColumn<Producto, String> colimagen2;
    @FXML
    private TableColumn<Producto, String> colimagen3;
    @FXML
    private TableColumn<Producto, String> colimagen4;
    @FXML
    private TableColumn<Producto, String> colimagen5;
    @FXML
    private TableColumn<Producto, String> colimagen6;
    @FXML
    private TableColumn<Producto, String> colimagen7;
    @FXML
    private TableColumn<Producto, String> colimagen8;
    @FXML
    private TableColumn<Producto, String> colimagen9;

    @FXML
    private TableColumn<Producto, String> columnaPrecio;

    @FXML
    private TableColumn<Producto, String> columnaPrecio1;

    @FXML
    private TableColumn<Producto, String> columnaPrecio2;

    @FXML
    private TableColumn<Producto, String> columnaPrecio3;

    @FXML
    private TableColumn<Producto, String> columnaPrecio4;

    @FXML
    private TableColumn<Producto, String> columnaPrecio5;

    @FXML
    private TableColumn<Producto,String> columnaPrecio6;

    @FXML
    private TableColumn<Producto, String> columnaPrecio7;

    @FXML
    private TableColumn<Producto, String> columnaPrecio8;

    @FXML
    private TableColumn<Producto, String> columnaPrecio9;

    @FXML
    private ComboBox<Estado> comboEstadoProducto;

    @FXML
    private ComboBox<Estado> comboEstadoProducto1;

    @FXML
    private ComboBox<Estado> comboEstadoProducto2;

    @FXML
    private ComboBox<Estado> comboEstadoProducto3;

    @FXML
    private ComboBox<Estado> comboEstadoProducto4;

    @FXML
    private ComboBox<Estado> comboEstadoProducto5;

    @FXML
    private ComboBox<Estado> comboEstadoProducto6;

    @FXML
    private ComboBox<Estado> comboEstadoProducto7;

    @FXML
    private ComboBox<Estado> comboEstadoProducto8;

    @FXML
    private ComboBox<Estado> comboEstadoProducto9;

    @FXML
    private BarChart<String, Integer> graficodeEstadisticas;
    @FXML
    private TableView<Producto> tablaProductos;

    @FXML
    private TableView<Producto> tablaProductos1;

    @FXML
    private TableView<Producto> tablaProductos2;

    @FXML
    private TableView<Producto> tablaProductos3;

    @FXML
    private TableView<Producto> tablaProductos4;

    @FXML
    private TableView<Producto> tablaProductos5;

    @FXML
    private TableView<Producto> tablaProductos6;

    @FXML
    private TableView<Producto> tablaProductos7;

    @FXML
    private TableView<Producto> tablaProductos8;

    @FXML
    private TableView<Producto> tablaProductos9;
    @FXML
    private TableView<Producto> tablaMuro;
    @FXML
    private TableView<Producto> tablaMuro1;
    @FXML
    private TableColumn<Producto, String> colNombreMuro;
    @FXML
    private TableColumn<Producto, String> colPrecioMuro;
    @FXML
    private TableColumn<Producto, String> colEstadoMuro;
    @FXML
    private TableColumn<Producto, String> colImagenMuro;

    @FXML
    private TableView<Vendedor> tblVendedores;

    @FXML
    private TableView<Vendedor> tablaSugerencias;
    @FXML
    private TableView<Vendedor> tablaSugerencias1;
    @FXML
    private TableView<Vendedor> tablaSugerencias2;

    @FXML
    private TableView<Vendedor> tablaSugerencias3;
    @FXML
    private TableView<Vendedor> tablaSugerencias4;

    @FXML
    private TableView<Vendedor> tablaSugerencias5;

    @FXML
    private TableView<Vendedor> tablaSugerencias6;

    @FXML
    private TableView<Vendedor> tablaSugerencias7;

    @FXML
    private TableView<Vendedor> tablaSugerencias8;

    @FXML
    private TableView<Vendedor> tablaSugerencias9;
    @FXML
    private TableView<Vendedor> tablaSolicitudes;
    @FXML
    private TableView<Vendedor> tablaSolicitudes1;

    @FXML
    private TableView<Vendedor> tablaSolicitudes2;

    @FXML
    private TableView<Vendedor> tablaSolicitudes3;

    @FXML
    private TableView<Vendedor> tablaSolicitudes4;

    @FXML
    private TableView<Vendedor> tablaSolicitudes5;

    @FXML
    private TableView<Vendedor> tablaSolicitudes6;

    @FXML
    private TableView<Vendedor> tablaSolicitudes7;

    @FXML
    private TableView<Vendedor> tablaSolicitudes8;

    @FXML
    private TableView<Vendedor> tablaSolicitudes9;
    @FXML
    private TableView<Vendedor> tablaContactos;

    @FXML
    private TableView<Vendedor> tablaContactos1;

    @FXML
    private TableView<Vendedor> tablaContactos2;

    @FXML
    private TableView<Vendedor> tablaContactos3;

    @FXML
    private TableView<Vendedor> tablaContactos4;

    @FXML
    private TableView<Vendedor> tablaContactos5;

    @FXML
    private TableView<Vendedor> tablaContactos6;

    @FXML
    private TableView<Vendedor> tablaContactos7;

    @FXML
    private TableView<Vendedor> tablaContactos8;

    @FXML
    private TableView<Vendedor> tablaContactos9;

    @FXML
    private TabPane tabPrincipal;

    @FXML
    private TableColumn<Vendedor, String> contactos;

    @FXML
    private TableColumn<Vendedor, String> contactos1;

    @FXML
    private TableColumn<Vendedor, String > contactos2;

    @FXML
    private TableColumn<Vendedor, String> contactos3;

    @FXML
    private TableColumn<Vendedor, String> contactos4;

    @FXML
    private TableColumn<Vendedor, String> contactos5;

    @FXML
    private TableColumn<Vendedor, String> contactos6;

    @FXML
    private TableColumn<Vendedor, String> contactos7;

    @FXML
    private TableColumn<Vendedor, String> contactos8;

    @FXML
    private TableColumn<Vendedor, String> contactos9;

    @FXML
    private TableColumn<Vendedor, String> solicitudes1;

    @FXML
    private TableColumn<Vendedor, String> solicitudes2;

    @FXML
    private TableColumn<Vendedor, String> solicitudes3;

    @FXML
    private TableColumn<Vendedor, String> solicitudes4;

    @FXML
    private TableColumn<Vendedor, String> solicitudes5;

    @FXML
    private TableColumn<Vendedor, String> solicitudes6;

    @FXML
    private TableColumn<Vendedor, String> solicitudes7;

    @FXML
    private TableColumn<Vendedor, String> solicitudes8;

    @FXML
    private TableColumn<Vendedor, String> solicitudes9;

    @FXML
    private TableColumn<Vendedor, String> solicitudes;

    @FXML
    private TableColumn<Vendedor, String> sugerencias;

    @FXML
    private TableColumn<Vendedor, String> sugerencias1;

    @FXML
    private TableColumn<Vendedor, String> sugerencias2;

    @FXML
    private TableColumn<Vendedor, String> sugerencias3;

    @FXML
    private TableColumn<Vendedor, String> sugerencias4;

    @FXML
    private TableColumn<Vendedor, String> sugerencias5;

    @FXML
    private TableColumn<Vendedor, String> sugerencias6;

    @FXML
    private TableColumn<Vendedor, String> sugerencias7;

    @FXML
    private TableColumn<Vendedor, String> sugerencias8;

    @FXML
    private TableColumn<Vendedor, String> sugerencias9;

    private boolean datosValidos(String nombre, String apellido, String cedula, String direccion, String cuenta, String contrasena) {

        String mensaje = "";


        if (nombre == null || nombre.equals(""))
            mensaje += "El nombre es invalido \n";

        if (apellido == null || apellido.equals(""))
            mensaje += "El apellido es invalido \n";

        if (cedula == null || cedula.equals(""))
            mensaje += "El documento es invalido \n";

        if (direccion == null || direccion.equals(""))
            mensaje += "La direccion es invalida \n";
        if (cuenta == null || cuenta.equals(""))
            mensaje += "La direccion es invalida \n";
        if (contrasena == null || contrasena.equals(""))
            mensaje += "La direccion es invalida \n";


        if (mensaje.equals("")) {
            return true;
        } else {
            mostrarMensaje("Notificación cliente", "Datos invalidos", mensaje, Alert.AlertType.WARNING);
            return false;
        }
    }

    private void publicarProducto() {
        String codigo = campoCodigoProducto.getText();
        String nombreProducto = campoNombreProducto.getText();
        String rutaImagen = campoUrlImagen.getText();
        String categoria = campoCategoria.getText();
        double precio = Double.parseDouble(campoPrecio.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto.getValue());

        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto)) {
            Estado estado = Estado.valueOf(estadoProducto);
            crearProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 1);
        } else {
            mostrarMensaje("Notificación producto", "Producto no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }
    }

    private void publicarProducto1() {
        String codigo = campoCodigoProducto1.getText();
        String nombreProducto = campoNombreProducto1.getText();
        String rutaImagen = campoUrlImagen1.getText();
        String categoria = campoCategoria1.getText();
        double precio = Double.parseDouble(campoPrecio1.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto1.getValue());

        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            crearProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 2);
        } else {
            mostrarMensaje("Notificación producto", "Producto no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }
    }

    @FXML
    void eventoComboBox(ActionEvent event) {
    }



    @FXML
    void publicarProductoAction(ActionEvent event) {
        publicarProducto();
    }

    @FXML
    void publicarProductoAction1(ActionEvent event) {
        publicarProducto1();
    }


    @FXML
    void actualizarProductoAction(ActionEvent event) {
        actualizarProducto();
    }

    @FXML
    void eliminarProductoAction(ActionEvent event) {
        eliminarProducto();
    }

    @FXML
    void actualizarProductoAction1(ActionEvent event) {
        actualizarProducto1();
    }

    @FXML
    void eliminarProductoAction1(ActionEvent event) {
        eliminarProducto1();
    }


    private void actualizarProducto() {

        String codigo = campoCodigoProducto.getText();
        String nombreProducto = campoNombreProducto.getText();
        String rutaImagen = campoUrlImagen.getText();
        String categoria = campoCategoria.getText();
        double precio = Double.parseDouble(campoPrecio.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto.getValue());

        //2. Validar la información
        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            actualizarProductos(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 1);
        } else {
            mostrarMensaje("Notificación producto", "Producto no actualizado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }


    }

    private void actualizarProducto1() {

        String codigo = campoCodigoProducto1.getText();
        String nombreProducto = campoNombreProducto1.getText();
        String rutaImagen = campoUrlImagen1.getText();
        String categoria = campoCategoria1.getText();
        double precio = Double.parseDouble(campoPrecio1.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto1.getValue());

        //2. Validar la información
        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            actualizarProductos(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 2);
        } else {
            mostrarMensaje("Notificación producto", "Producto no actualizado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }


    }

    private void eliminarProducto() {
        boolean productoEliminado = false;


        if (productoSeleccionado != null) {


            if (mostrarMensajeConfirmacion("¿Estas seguro de elimininar el producto?") == true) {

                productoEliminado = controllerVendedorView.eliminarProducto(productoSeleccionado.getCodigo());


                if (productoEliminado == true) {
                    listaProductosVis.remove(productoSeleccionado);
                    productoSeleccionado = null;

                    tablaProductos.getSelectionModel().clearSelection();
                    limpiarCamposProducto();

                    mostrarMensaje("Notificación producto", "Producto eliminado", "El producto se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                } else {
                    mostrarMensaje("Notificación producto", "Producto no eliminado", "El producto no se puede eliminar", Alert.AlertType.ERROR);
                }
            }
        } else {
            mostrarMensaje("Notificación producto", "Producto no seleccionado", "Seleccionado un producto de la lista", Alert.AlertType.WARNING);
        }

    }

    private void eliminarProducto1() {
        boolean productoEliminado = false;


        if (productoSeleccionado != null) {


            if (mostrarMensajeConfirmacion("¿Estas seguro de elimininar el producto?") == true) {

                productoEliminado = controllerVendedorView.eliminarProducto(productoSeleccionado.getCodigo());


                if (productoEliminado == true) {
                    listaProductosVis.remove(productoSeleccionado);
                    productoSeleccionado = null;

                    tablaProductos1.getSelectionModel().clearSelection();
                    limpiarCamposProducto1();

                    mostrarMensaje("Notificación producto", "Producto eliminado", "El producto se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                } else {
                    mostrarMensaje("Notificación producto", "Producto no eliminado", "El producto no se puede eliminar", Alert.AlertType.ERROR);
                }
            }
        } else {
            mostrarMensaje("Notificación producto", "Producto no seleccionado", "Seleccionado un producto de la lista", Alert.AlertType.WARNING);
        }

    }




    private void setearCamposProductos2(Producto producto) {

        if (producto != null) {
            campoCodigoProducto2.setText(producto.getCodigo());
            campoNombreProducto2.setText(producto.getNombre());
            campoCategoria2.setText(producto.getCategoria());
            campoPrecio2.setText(String.valueOf(producto.getPrecio()));
            comboEstadoProducto2.setValue(producto.getEstado());

            if (producto.getEstado() != null && producto.getEstado() != Estado.NULL) {
                comboEstadoProducto2.setValue(producto.getEstado());
            } else {
                comboEstadoProducto2.setValue(null);
            }
        } else {
            campoCodigoProducto2.setText("");
            campoNombreProducto2.setText("");
            campoCategoria2.setText("");
            campoPrecio2.setText("");
            comboEstadoProducto2.setValue(null);
        }
    }

    private void limpiarCamposProducto2() {
        campoCodigoProducto2.setText("");
        campoNombreProducto2.setText("");
        campoUrlImagen2.setText("");
        campoCategoria2.setText("");
        campoPrecio2.setText("");
        comboEstadoProducto2.setValue(null);
    }

    private void publicarProducto2() {
        String codigo = campoCodigoProducto2.getText();
        String nombreProducto = campoNombreProducto2.getText();
        String rutaImagen = campoUrlImagen2.getText();
        String categoria = campoCategoria2.getText();
        double precio = Double.parseDouble(campoPrecio2.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto2.getValue());

        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            crearProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 3);
        } else {
            mostrarMensaje("Notificación producto", "Producto no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }
    }

    private void actualizarProducto2() {

        String codigo = campoCodigoProducto2.getText();
        String nombreProducto = campoNombreProducto2.getText();
        String rutaImagen = campoUrlImagen2.getText();
        String categoria = campoCategoria2.getText();
        double precio = Double.parseDouble(campoPrecio2.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto2.getValue());

        //2. Validar la información
        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            actualizarProductos(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 3);
        } else {
            mostrarMensaje("Notificación producto", "Producto no actualizado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }


    }

    private void eliminarProducto2() {
        boolean productoEliminado = false;


        if (productoSeleccionado != null) {


            if (mostrarMensajeConfirmacion("¿Estas seguro de elimininar el producto?") == true) {

                productoEliminado = controllerVendedorView.eliminarProducto(productoSeleccionado.getCodigo());


                if (productoEliminado == true) {
                    listaProductosVis.remove(productoSeleccionado);
                    productoSeleccionado = null;

                    tablaProductos2.getSelectionModel().clearSelection();
                    limpiarCamposProducto2();

                    mostrarMensaje("Notificación producto", "Producto eliminado", "El producto se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                } else {
                    mostrarMensaje("Notificación producto", "Producto no eliminado", "El producto no se puede eliminar", Alert.AlertType.ERROR);
                }
            }
        } else {
            mostrarMensaje("Notificación producto", "Producto no seleccionado", "Seleccionado un producto de la lista", Alert.AlertType.WARNING);
        }

    }

    @FXML
    void publicarProductoAction2(ActionEvent event) {
        publicarProducto2();
    }


    @FXML
    void actualizarProductoAction2(ActionEvent event) {
        actualizarProducto2();
    }

    @FXML
    void eliminarProductoAction2(ActionEvent event) {
        eliminarProducto2();
    }


    public ObservableList<Vendedor> getListaVendedoresData() {
        listaVendedoresData.addAll(controllerAdminView.obtenerVendedores());
        return listaVendedoresData;
    }


    private void limpiarCamposVendedor() {
        campoNombre.setText("");
        campoApellido.setText("");
        campoCedula.setText("");
        campoCuenta.setText("");
        campoDireccion.setText("");
        campoContrasena.setText("");
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

    private boolean datosValidosProducto(String codigo, String nombreProducto, String rutaImagen, String categoria, double precio, String estadoProducto) {

        String mensaje = "";

        if (codigo == null || codigo.equals(""))
            mensaje += "El codigo del producto es invalido \n";

        if (nombreProducto == null || nombreProducto.equals(""))
            mensaje += "El nombre del producto es invalido \n";

        if (rutaImagen == null || rutaImagen.equals(""))
            mensaje += "La ruta de la imagen es invalida \n";

        if (categoria == null || categoria.equals(""))
            mensaje += "La categoría del producto es invalida \n";

        if (precio <= 0)
            mensaje += "El precio del producto es invalido \n";
        if (estadoProducto == null || estadoProducto.equals(""))
            mensaje += "La direccion es invalida \n";


        if (mensaje.equals("")) {
            return true;
        } else {
            mostrarMensaje("Notificación producto", "Datos invalidos", mensaje, Alert.AlertType.WARNING);
            return false;
        }
    }

    public ObservableList<Producto> getListaProductosVis()  {

        listaProductosVis.addAll(controllerVendedorView.obtenerProductos());
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

    @FXML
    void initialize(){

        modelFactoryController = ModelFactoryController.getInstance();
        controllerAdminView = new ControllerAdminView(modelFactoryController);
        controllerVendedorView = new ControllerVendedorView(modelFactoryController);
        comboEstadoProducto.getItems().setAll(Estado.values());
        comboEstadoProducto1.getItems().setAll(Estado.values());
        comboEstadoProducto2.getItems().setAll(Estado.values());
        comboEstadoProducto3.getItems().setAll(Estado.values());
        comboEstadoProducto4.getItems().setAll(Estado.values());
        comboEstadoProducto5.getItems().setAll(Estado.values());
        comboEstadoProducto6.getItems().setAll(Estado.values());
        comboEstadoProducto7.getItems().setAll(Estado.values());
        comboEstadoProducto8.getItems().setAll(Estado.values());
        comboEstadoProducto9.getItems().setAll(Estado.values());

        modelFactoryController = ModelFactoryController.getInstance();
        switch (modelFactoryController.getSesion()) {
            case 0:
                inicialzarAdminView();
                break;
            case 1:
                inicialzarVendedorView();
                break;
            case 2:
                inicialzarVendedorView1();
                break;
            case 3:
                inicialzarVendedorView2();
                break;
            case 4:
                inicialzarVendedorView3();
                break;
            case 5:
                inicialzarVendedorView4();
                break;
            case 6:
                inicialzarVendedorView5();
                break;
            case 7:
                inicialzarVendedorView6();
                break;
            case 8:
                inicialzarVendedorView7();
                break;
            case 9:
                inicialzarVendedorView8();
                break;
            case 10:
                inicialzarVendedorView9();
                break;
        }

        // metodo para deshabilitar los tabs y dejar solo el de inicio de sesion
        for (int i = 0; i < tabPrincipal.getTabs().size(); i++) {
            Tab tab = tabPrincipal.getTabs().get(i);
            if ((tabPrincipal.getTabs().indexOf(tab) == (modelFactoryController.getSesion()))) {
                tabPrincipal.getSelectionModel().select(i);
                tab.setDisable(false);
            } else {
                tab.setDisable(true);
            }

        }
    }


    public void inicialzarAdminView() {
        //1. Inicializar la tabla
        this.colNombreVendedor.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.colApellidoVendedor.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        this.colCedulaVendedor.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        this.colDireccionVendedor.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        this.colCuentaVendedor.setCellValueFactory(new PropertyValueFactory<>("cuenta"));

        tblVendedores.getItems().clear();
        tblVendedores.setItems(getListaVendedoresData());


// Cada vez que se le da clic setea los campos de la tabla hacia los campos de texto
        tblVendedores.getSelectionModel().selectedItemProperty().addListener((obs, oldSelecction, newSelecction) -> {
            this.vendedorSeleccionado = newSelecction;
            this.setearCamposVendedor(this.vendedorSeleccionado);
        });
        iniciarGrafica();
    }

    private void iniciarGrafica() {
        XYChart.Series<String, Integer> series = new XYChart.Series<>();
        for (Vendedor vendedor : modelFactoryController.marketplace.getAdministrador().getVendedores()) {
            series.getData().add(new XYChart.Data<>(vendedor.getNombre(), vendedor.getListaProductos().size()));
        }
        graficodeEstadisticas.getData().add(series);
    }

    private void CrearVendedor() {
        //1. Capturar los datos
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String cedula = campoCedula.getText();
        String direccion = campoDireccion.getText();
        String cuenta = campoCuenta.getText();
        String contrasena = campoContrasena.getText();

        //2. Validar la información
        if(datosValidos(nombre, apellido, cedula, direccion, cuenta, contrasena)== true){
            Vendedor vendedor= null;
            vendedor = controllerAdminView.crearVendedor(nombre, apellido, cedula, direccion, cuenta, contrasena);
            if(vendedor != null){
                listaVendedoresData.add(vendedor);
                graficodeEstadisticas.getData().clear();
                iniciarGrafica();
                mostrarMensaje("Notificación vendedor", "Vendedor creado", "El vendedor se ha creado con éxito", Alert.AlertType.INFORMATION);
                refresh(0);
                limpiarCamposVendedor();
            }else{
                mostrarMensaje("Notificación vendedor", "Vendedor no creado", "El vendedor con cedula " + cedula + " ya existe", Alert.AlertType.INFORMATION);
            }
        }else{
            mostrarMensaje("Notificación vendedor", "Vendedor no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }


    }
    private void actualizarVendedor(){

        //1. Capturar los datos
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String cedula = campoCedula.getText();
        String direccion = campoDireccion.getText();
        String cuenta = campoCuenta.getText();
        String contrasena = campoContrasena.getText();

        //2. Validar la información
        if (datosValidos(nombre, apellido, cedula, direccion, cuenta, contrasena) == true) {
            Vendedor vendedor = null;
            vendedor = controllerAdminView.actualizarVendedor(nombre, apellido, cedula, direccion, cuenta, contrasena, vendedorSeleccionado.getCedula());
            if (vendedor != null) {
                refresh(0);
                mostrarMensaje("Notificación vendedor", "Vendedor actualizado", "El vendedor se ha actualizado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposVendedor();
            } else {
                mostrarMensaje("Notificación vendedor", "Vendedor no actualizado", "El vendedor no se ha actualizado", Alert.AlertType.INFORMATION);
            }
        } else {
            mostrarMensaje("Notificación vendedor", "Vendedor no actualizado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }


    }

    private void eliminarVendedor() {
        boolean empleadoEliminado = false;


        if (vendedorSeleccionado != null) {


            if (mostrarMensajeConfirmacion("¿Estas seguro de elimininar al empleado?") == true) {

                empleadoEliminado = controllerAdminView.eliminarVendedor(vendedorSeleccionado.getCedula());


                if (empleadoEliminado == true) {
                    listaVendedoresData.remove(vendedorSeleccionado);
                    vendedorSeleccionado = null;
                    graficodeEstadisticas.getData().clear();
                    iniciarGrafica();

                    tblVendedores.getSelectionModel().clearSelection();
                    limpiarCamposVendedor();

                    mostrarMensaje("Notificación vendedor", "Vendedor eliminado", "El vendedor se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                } else {
                    mostrarMensaje("Notificación vendedor", "Vendedor no eliminado", "El vendedor no se puede eliminar", Alert.AlertType.ERROR);
                }
            }
        } else {
            mostrarMensaje("Notificación vendedor", "Vendedor no seleccionado", "Seleccionado un vendedor de la lista", Alert.AlertType.WARNING);
        }

    }

    //Actualiza la lista de vehndedores dee la tabla obtener vendedores del singleton contra la de la interfaz
    void refresh(int indicador) {
        switch (indicador) {
            case 0:
                tblVendedores.getItems().clear();
                tblVendedores.setItems(getListaVendedoresData());
                break;
            case 1:
                tablaProductos.getItems().clear();
                tablaProductos.setItems(getListaProductosVis());
                break;
            case 2:
                tablaProductos1.getItems().clear();
                tablaProductos1.setItems(getListaProductosVis());
                break;
            case 3:
                tablaProductos2.getItems().clear();
                tablaProductos2.setItems(getListaProductosVis());
                break;
            case 4:
                tablaProductos3.getItems().clear();
                tablaProductos3.setItems(getListaProductosVis());
                break;
            case 5:
                tablaProductos4.getItems().clear();
                tablaProductos4.setItems(getListaProductosVis());
                break;
            case 6:
                tablaProductos5.getItems().clear();
                tablaProductos5.setItems(getListaProductosVis());
                break;
            case 7:
                tablaProductos6.getItems().clear();
                tablaProductos6.setItems(getListaProductosVis());
                break;
            case 8:
                tablaProductos7.getItems().clear();
                tablaProductos7.setItems(getListaProductosVis());
                break;
            case 9:
                tablaProductos8.getItems().clear();
                tablaProductos8.setItems(getListaProductosVis());
                break;
            case 10:
                tablaProductos9.getItems().clear();
                tablaProductos9.setItems(getListaProductosVis());
                break;
        }

    }


    private void limpiarCamposProducto() {
        campoCodigoProducto.setText("");
        campoNombreProducto.setText("");
        campoUrlImagen.setText("");
        campoCategoria.setText("");
        campoPrecio.setText("");
        comboEstadoProducto.setValue(null);
    }

    private void limpiarCamposProducto1() {
        campoCodigoProducto1.setText("");
        campoNombreProducto1.setText("");
        campoUrlImagen1.setText("");
        campoCategoria1.setText("");
        campoPrecio1.setText("");
        comboEstadoProducto1.setValue(null);
    }

    //Setea los campos de la tabla hacia los de texto
    private void setearCamposVendedor(Vendedor vendedor) {

        if (vendedor != null) {
            campoNombre.setText(vendedor.getNombre());
            campoApellido.setText(vendedor.getApellido());
            campoCedula.setText(vendedor.getCedula());
            campoDireccion.setText(vendedor.getDireccion());
            campoCuenta.setText(vendedor.getCuenta().getUsuario());
            campoContrasena.setText(vendedor.getCuenta().getContrasena());
        }

    }

    private void setearCamposProductos(Producto producto) {

        if (producto != null) {
            campoCodigoProducto.setText(producto.getCodigo());
            campoNombreProducto.setText(producto.getNombre());
            campoCategoria.setText(producto.getCategoria());
            campoPrecio.setText(String.valueOf(producto.getPrecio()));
            comboEstadoProducto.setValue(producto.getEstado());

            if (producto.getEstado() != null && producto.getEstado() != Estado.NULL) {
                comboEstadoProducto.setValue(producto.getEstado());
            } else {
                comboEstadoProducto.setValue(null);
            }
        } else {
            campoCodigoProducto.setText("");
            campoNombreProducto.setText("");
            campoCategoria.setText("");
            campoPrecio.setText("");
            comboEstadoProducto.setValue(null);
        }
    }

    private void setearCamposProductos1(Producto producto) {

        if (producto != null) {
            campoCodigoProducto1.setText(producto.getCodigo());
            campoNombreProducto1.setText(producto.getNombre());
            campoCategoria1.setText(producto.getCategoria());
            campoPrecio1.setText(String.valueOf(producto.getPrecio()));
            comboEstadoProducto1.setValue(producto.getEstado());

            if (producto.getEstado() != null && producto.getEstado() != Estado.NULL) {
                comboEstadoProducto1.setValue(producto.getEstado());
            } else {
                comboEstadoProducto1.setValue(null);
            }
        } else {
            campoCodigoProducto1.setText("");
            campoNombreProducto1.setText("");
            campoCategoria1.setText("");
            campoPrecio1.setText("");
            comboEstadoProducto1.setValue(null);
        }
    }

    @FXML
    void crearVendedorAction(ActionEvent event) {
        CrearVendedor();
    }

    @FXML
    void actualizarVendedorAction(ActionEvent event) {
        actualizarVendedor();
    }


    @FXML
    void eliminarVendedoronAction(ActionEvent event) {
        eliminarVendedor();
    }

    public void inicialzarVendedorView() {
        //1. Inicializar la tabla
        this.columnaNombreP.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnaCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        this.columnaPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
        this.columnaEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
        this.columnaCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.colimagen.setCellValueFactory(new PropertyValueFactory<>("rutaImagen"));
        this.colimagen.setCellFactory(column -> {
            TableCell<Producto, String> cell = new TableCell<>() {
                private final ImageView imageView = new ImageView();

                @Override
                protected void updateItem(String rutaImagen, boolean empty) {
                    super.updateItem(rutaImagen, empty);

                    if (empty || rutaImagen == null) {
                        setGraphic(null);
                    } else {
                        Image image = new Image("file:" + rutaImagen);
                        imageView.setImage(image);
                        imageView.setFitWidth(150);
                        imageView.setFitHeight(150);
                        imageView.setPreserveRatio(true);
                        imageView.setSmooth(true);
                        setGraphic(imageView);
                    }
                }
            };
            return cell;
        });

        this.colNombreMuro.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.colPrecioMuro.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        this.colEstadoMuro.setCellValueFactory(new PropertyValueFactory<>("precio"));
        this.colImagenMuro.setCellValueFactory(new PropertyValueFactory<>("rutaImagen"));
        this.colImagenMuro.setCellFactory(column -> {
            TableCell<Producto, String> cell = new TableCell<>() {
                private final ImageView imageView = new ImageView();

                @Override
                protected void updateItem(String rutaImagen, boolean empty) {
                    super.updateItem(rutaImagen, empty);

                    if (empty || rutaImagen == null) {
                        setGraphic(null);
                    } else {
                        Image image = new Image("file:" + rutaImagen);
                        imageView.setImage(image);
                        imageView.setFitWidth(150);
                        imageView.setFitHeight(150);
                        imageView.setPreserveRatio(true);
                        imageView.setSmooth(true);
                        setGraphic(imageView);
                    }
                }
            };
            return cell;
        });
        this.sugerencias.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.solicitudes.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.contactos.setCellValueFactory(new PropertyValueFactory<>("nombre"));


        tablaProductos.getItems().clear();
        tablaProductos.setItems(getListaProductosVis());
        tablaMuro.getItems().clear();
        tablaMuro.setItems(getListaPublicaciones());
        tablaSugerencias.getItems().clear();
        tablaSugerencias.setItems(getListaSugerenciasAmistad());
        tablaSolicitudes.getItems().clear();
        tablaSolicitudes.setItems(getListaSolicitudesAmistad());
        tablaContactos.getItems().clear();
        tablaContactos.setItems(getListaContactosAmistad());

        // llenarTablaSugerencias(getListaSugerenciasAmistad());



// Cada vez que se le da clic setea los campos de la tabla hacia los campos de texto
        tablaProductos.getSelectionModel().selectedItemProperty().addListener((obs, oldSelecction, newSelecction) -> {
            this.productoSeleccionado = newSelecction;
            this.setearCamposProductos(this.productoSeleccionado);

        });
    }


    public void inicialzarVendedorView1() {
        //1. Inicializar la tabla
        int id = 0;
        this.columnaNombreP1.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnaCategoria1.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        this.columnaPrecio1.setCellValueFactory(new PropertyValueFactory<>("precio"));
        this.columnaEstado1.setCellValueFactory(new PropertyValueFactory<>("estado"));
        this.columnaCodigo1.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.colimagen1.setCellValueFactory(new PropertyValueFactory<>("rutaImagen"));
        this.colimagen1.setCellFactory(column -> {
            TableCell<Producto, String> cell = new TableCell<>() {
                private final ImageView imageView = new ImageView();

                @Override
                protected void updateItem(String rutaImagen, boolean empty) {
                    super.updateItem(rutaImagen, empty);

                    if (empty || rutaImagen == null) {
                        setGraphic(null);
                    } else {
                        Image image = new Image("file:" + rutaImagen);
                        imageView.setImage(image);
                        imageView.setFitWidth(150);
                        imageView.setFitHeight(150);
                        imageView.setPreserveRatio(true);
                        imageView.setSmooth(true);
                        setGraphic(imageView);
                    }
                }
            };
            return cell;
        });


        this.sugerencias1.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.solicitudes1.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.contactos1.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        tablaProductos1.getItems().clear();
        tablaProductos1.setItems(getListaProductosVis());
        tablaSugerencias1.getItems().clear();
        tablaSugerencias1.setItems(getListaSugerenciasAmistad());
        tablaSolicitudes1.getItems().clear();
        tablaSolicitudes1.setItems(getListaSolicitudesAmistad());
        tablaContactos1.getItems().clear();
        tablaContactos1.setItems(getListaContactosAmistad());

// Cada vez que se le da clic setea los campos de la tabla hacia los campos de texto
        tablaProductos1.getSelectionModel().selectedItemProperty().addListener((obs, oldSelecction, newSelecction) -> {
            this.productoSeleccionado = newSelecction;
            this.setearCamposProductos1(this.productoSeleccionado);
        });
    }
    public void inicialzarVendedorView2() {
        //1. Inicializar la tabla
        this.columnaNombreP2.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnaCategoria2.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        this.columnaPrecio2.setCellValueFactory(new PropertyValueFactory<>("precio"));
        this.columnaEstado2.setCellValueFactory(new PropertyValueFactory<>("estado"));
        this.columnaCodigo2.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.colimagen2.setCellValueFactory(new PropertyValueFactory<>("rutaImagen"));
        this.colimagen2.setCellFactory(column -> {
            TableCell<Producto, String> cell = new TableCell<>() {
                private final ImageView imageView = new ImageView();

                @Override
                protected void updateItem(String rutaImagen, boolean empty) {
                    super.updateItem(rutaImagen, empty);

                    if (empty || rutaImagen == null) {
                        setGraphic(null);
                    } else {
                        Image image = new Image("file:" + rutaImagen);
                        imageView.setImage(image);
                        imageView.setFitWidth(150);
                        imageView.setFitHeight(150);
                        imageView.setPreserveRatio(true);
                        imageView.setSmooth(true);
                        setGraphic(imageView);
                    }
                }
            };
            return cell;
        });
        this.sugerencias2.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.solicitudes2.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.contactos2.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        tablaProductos2.getItems().clear();
        tablaProductos2.setItems(getListaProductosVis());
        tablaSugerencias2.getItems().clear();
        tablaSugerencias2.setItems(getListaSugerenciasAmistad());
        tablaSolicitudes2.getItems().clear();
        tablaSolicitudes2.setItems(getListaSolicitudesAmistad());
        tablaContactos2.getItems().clear();
        tablaContactos2.setItems(getListaContactosAmistad());

// Cada vez que se le da clic setea los campos de la tabla hacia los campos de texto
        tablaProductos2.getSelectionModel().selectedItemProperty().addListener((obs, oldSelecction, newSelecction) -> {
            this.productoSeleccionado = newSelecction;
            this.setearCamposProductos2(this.productoSeleccionado);

        });
    }



    public void inicialzarVendedorView3() {
        //1. Inicializar la tabla
        this.columnaNombreP3.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnaCategoria3.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        this.columnaPrecio3.setCellValueFactory(new PropertyValueFactory<>("precio"));
        this.columnaEstado3.setCellValueFactory(new PropertyValueFactory<>("estado"));
        this.columnaCodigo3.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.colimagen3.setCellValueFactory(new PropertyValueFactory<>("rutaImagen"));
        this.colimagen3.setCellFactory(column -> {
            TableCell<Producto, String> cell = new TableCell<>() {
                private final ImageView imageView = new ImageView();

                @Override
                protected void updateItem(String rutaImagen, boolean empty) {
                    super.updateItem(rutaImagen, empty);

                    if (empty || rutaImagen == null) {
                        setGraphic(null);
                    } else {
                        Image image = new Image("file:" + rutaImagen);
                        imageView.setImage(image);
                        imageView.setFitWidth(150);
                        imageView.setFitHeight(150);
                        imageView.setPreserveRatio(true);
                        imageView.setSmooth(true);
                        setGraphic(imageView);
                    }
                }
            };
            return cell;
        });
        this.sugerencias3.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.solicitudes3.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.contactos3.setCellValueFactory(new PropertyValueFactory<>("nombre"));


        tablaProductos3.getItems().clear();
        tablaProductos3.setItems(getListaProductosVis());
        tablaSugerencias3.getItems().clear();
        tablaSugerencias3.setItems(getListaSugerenciasAmistad());
        tablaSolicitudes3.getItems().clear();
        tablaSolicitudes3.setItems(getListaSolicitudesAmistad());
        tablaContactos3.getItems().clear();
        tablaContactos3.setItems(getListaContactosAmistad());

// Cada vez que se le da clic setea los campos de la tabla hacia los campos de texto
        tablaProductos3.getSelectionModel().selectedItemProperty().addListener((obs, oldSelecction, newSelecction) -> {
            this.productoSeleccionado = newSelecction;
            this.setearCamposProductos3(this.productoSeleccionado);
        });
    }

    private void setearCamposProductos3(Producto producto) {

        if (producto != null) {
            campoCodigoProducto3.setText(producto.getCodigo());
            campoNombreProducto3.setText(producto.getNombre());
            campoCategoria3.setText(producto.getCategoria());
            campoPrecio3.setText(String.valueOf(producto.getPrecio()));
            comboEstadoProducto3.setValue(producto.getEstado());

            if (producto.getEstado() != null && producto.getEstado() != Estado.NULL) {
                comboEstadoProducto3.setValue(producto.getEstado());
            } else {
                comboEstadoProducto3.setValue(null);
            }
        } else {
            campoCodigoProducto3.setText("");
            campoNombreProducto3.setText("");
            campoCategoria3.setText("");
            campoPrecio3.setText("");
            comboEstadoProducto3.setValue(null);
        }
    }

    private void limpiarCamposProducto3() {
        campoCodigoProducto3.setText("");
        campoNombreProducto3.setText("");
        campoUrlImagen3.setText("");
        campoCategoria3.setText("");
        campoPrecio3.setText("");
        comboEstadoProducto3.setValue(null);
    }

    private void publicarProducto3() {
        String codigo = campoCodigoProducto3.getText();
        String nombreProducto = campoNombreProducto3.getText();
        String rutaImagen = campoUrlImagen3.getText();
        String categoria = campoCategoria3.getText();
        double precio = Double.parseDouble(campoPrecio3.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto3.getValue());

        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            crearProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 4);
        } else {
            mostrarMensaje("Notificación producto", "Producto no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }
    }

    private void actualizarProducto3() {

        String codigo = campoCodigoProducto3.getText();
        String nombreProducto = campoNombreProducto3.getText();
        String rutaImagen = campoUrlImagen3.getText();
        String categoria = campoCategoria3.getText();
        double precio = Double.parseDouble(campoPrecio3.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto3.getValue());

        //3. Validar la información
        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            actualizarProductos(codigo, nombreProducto, rutaImagen, categoria, precio, estado,4);
        } else {
            mostrarMensaje("Notificación producto", "Producto no actualizado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }


    }

    private void eliminarProducto3() {
        boolean productoEliminado = false;


        if (productoSeleccionado != null) {


            if (mostrarMensajeConfirmacion("¿Estas seguro de elimininar el producto?") == true) {

                productoEliminado = controllerVendedorView.eliminarProducto(productoSeleccionado.getCodigo());


                if (productoEliminado == true) {
                    listaProductosVis.remove(productoSeleccionado);
                    productoSeleccionado = null;

                    tablaProductos3.getSelectionModel().clearSelection();
                    limpiarCamposProducto3();

                    mostrarMensaje("Notificación producto", "Producto eliminado", "El producto se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                } else {
                    mostrarMensaje("Notificación producto", "Producto no eliminado", "El producto no se puede eliminar", Alert.AlertType.ERROR);
                }
            }
        } else {
            mostrarMensaje("Notificación producto", "Producto no seleccionado", "Seleccionado un producto de la lista", Alert.AlertType.WARNING);
        }

    }


    @FXML
    void publicarProductoAction3(ActionEvent event) {
        publicarProducto3();
    }


    @FXML
    void actualizarProductoAction3(ActionEvent event) {
        actualizarProducto3();
    }

    @FXML
    void eliminarProductoAction3(ActionEvent event) {
        eliminarProducto3();
    }


    public void inicialzarVendedorView4() {
        //1. Inicializar la tabla
        this.columnaNombreP4.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnaCategoria4.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        this.columnaPrecio4.setCellValueFactory(new PropertyValueFactory<>("precio"));
        this.columnaEstado4.setCellValueFactory(new PropertyValueFactory<>("estado"));
        this.columnaCodigo4.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.colimagen4.setCellValueFactory(new PropertyValueFactory<>("rutaImagen"));
        this.colimagen4.setCellFactory(column -> {
            TableCell<Producto, String> cell = new TableCell<>() {
                private final ImageView imageView = new ImageView();

                @Override
                protected void updateItem(String rutaImagen, boolean empty) {
                    super.updateItem(rutaImagen, empty);

                    if (empty || rutaImagen == null) {
                        setGraphic(null);
                    } else {
                        Image image = new Image("file:" + rutaImagen);
                        imageView.setImage(image);
                        imageView.setFitWidth(150);
                        imageView.setFitHeight(150);
                        imageView.setPreserveRatio(true);
                        imageView.setSmooth(true);
                        setGraphic(imageView);
                    }
                }
            };
            return cell;
        });
        this.sugerencias4.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.solicitudes4.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.contactos4.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        tablaProductos4.getItems().clear();
        tablaProductos4.setItems(getListaProductosVis());
        tablaSugerencias4.getItems().clear();
        tablaSugerencias4.setItems(getListaSugerenciasAmistad());
        tablaSolicitudes4.getItems().clear();
        tablaSolicitudes4.setItems(getListaSolicitudesAmistad());
        tablaContactos4.getItems().clear();
        tablaContactos4.setItems(getListaContactosAmistad());

// Cada vez que se le da clic setea los campos de la tabla hacia los campos de texto
        tablaProductos4.getSelectionModel().selectedItemProperty().addListener((obs, oldSelecction, newSelecction) -> {
            this.productoSeleccionado = newSelecction;
            this.setearCamposProductos4(this.productoSeleccionado);
        });
    }

    private void setearCamposProductos4(Producto producto) {

        if (producto != null) {
            campoCodigoProducto4.setText(producto.getCodigo());
            campoNombreProducto4.setText(producto.getNombre());
            campoCategoria4.setText(producto.getCategoria());
            campoPrecio4.setText(String.valueOf(producto.getPrecio()));
            comboEstadoProducto4.setValue(producto.getEstado());

            if (producto.getEstado() != null && producto.getEstado() != Estado.NULL) {
                comboEstadoProducto4.setValue(producto.getEstado());
            } else {
                comboEstadoProducto4.setValue(null);
            }
        } else {
            campoCodigoProducto4.setText("");
            campoNombreProducto4.setText("");
            campoCategoria4.setText("");
            campoPrecio4.setText("");
            comboEstadoProducto4.setValue(null);
        }
    }

    private void limpiarCamposProducto4() {
        campoCodigoProducto4.setText("");
        campoNombreProducto4.setText("");
        campoUrlImagen4.setText("");
        campoCategoria4.setText("");
        campoPrecio4.setText("");
        comboEstadoProducto4.setValue(null);
    }

    private void publicarProducto4() {
        String codigo = campoCodigoProducto4.getText();
        String nombreProducto = campoNombreProducto4.getText();
        String rutaImagen = campoUrlImagen4.getText();
        String categoria = campoCategoria4.getText();
        double precio = Double.parseDouble(campoPrecio4.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto4.getValue());

        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            crearProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 5);
        } else {
            mostrarMensaje("Notificación producto", "Producto no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }
    }

    private void actualizarProducto4() {

        String codigo = campoCodigoProducto4.getText();
        String nombreProducto = campoNombreProducto4.getText();
        String rutaImagen = campoUrlImagen4.getText();
        String categoria = campoCategoria4.getText();
        double precio = Double.parseDouble(campoPrecio4.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto4.getValue());

        //4. Validar la información
        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            actualizarProductos(codigo, nombreProducto, rutaImagen, categoria, precio, estado,5);
        } else {
            mostrarMensaje("Notificación producto", "Producto no actualizado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }


    }

    private void eliminarProducto4() {
        boolean productoEliminado = false;


        if (productoSeleccionado != null) {


            if (mostrarMensajeConfirmacion("¿Estas seguro de elimininar el producto?") == true) {

                productoEliminado = controllerVendedorView.eliminarProducto(productoSeleccionado.getCodigo());


                if (productoEliminado == true) {
                    listaProductosVis.remove(productoSeleccionado);
                    productoSeleccionado = null;

                    tablaProductos4.getSelectionModel().clearSelection();
                    limpiarCamposProducto4();

                    mostrarMensaje("Notificación producto", "Producto eliminado", "El producto se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                } else {
                    mostrarMensaje("Notificación producto", "Producto no eliminado", "El producto no se puede eliminar", Alert.AlertType.ERROR);
                }
            }
        } else {
            mostrarMensaje("Notificación producto", "Producto no seleccionado", "Seleccionado un producto de la lista", Alert.AlertType.WARNING);
        }

    }


    @FXML
    void publicarProductoAction4(ActionEvent event) {
        publicarProducto4();
    }


    @FXML
    void actualizarProductoAction4(ActionEvent event) {
        actualizarProducto4();
    }

    @FXML
    void eliminarProductoAction4(ActionEvent event) {
        eliminarProducto4();
    }


    public void inicialzarVendedorView5() {
        //1. Inicializar la tabla
        this.columnaNombreP5.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnaCategoria5.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        this.columnaPrecio5.setCellValueFactory(new PropertyValueFactory<>("precio"));
        this.columnaEstado5.setCellValueFactory(new PropertyValueFactory<>("estado"));
        this.columnaCodigo5.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.colimagen5.setCellValueFactory(new PropertyValueFactory<>("rutaImagen"));
        this.colimagen5.setCellFactory(column -> {
            TableCell<Producto, String> cell = new TableCell<>() {
                private final ImageView imageView = new ImageView();

                @Override
                protected void updateItem(String rutaImagen, boolean empty) {
                    super.updateItem(rutaImagen, empty);

                    if (empty || rutaImagen == null) {
                        setGraphic(null);
                    } else {
                        Image image = new Image("file:" + rutaImagen);
                        imageView.setImage(image);
                        imageView.setFitWidth(150);
                        imageView.setFitHeight(150);
                        imageView.setPreserveRatio(true);
                        imageView.setSmooth(true);
                        setGraphic(imageView);
                    }
                }
            };
            return cell;
        });
        this.sugerencias5.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.solicitudes5.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.contactos5.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        tablaProductos5.getItems().clear();
        tablaProductos5.setItems(getListaProductosVis());
        tablaSugerencias5.getItems().clear();
        tablaSugerencias5.setItems(getListaSugerenciasAmistad());
        tablaSolicitudes5.getItems().clear();
        tablaSolicitudes5.setItems(getListaSolicitudesAmistad());
        tablaContactos5.getItems().clear();
        tablaContactos5.setItems(getListaContactosAmistad());


// Cada vez que se le da clic setea los campos de la tabla hacia los campos de texto
        tablaProductos5.getSelectionModel().selectedItemProperty().addListener((obs, oldSelecction, newSelecction) -> {
            this.productoSeleccionado = newSelecction;
            this.setearCamposProductos5(this.productoSeleccionado);
        });
    }

    private void setearCamposProductos5(Producto producto) {

        if (producto != null) {
            campoCodigoProducto5.setText(producto.getCodigo());
            campoNombreProducto5.setText(producto.getNombre());
            campoCategoria5.setText(producto.getCategoria());
            campoPrecio5.setText(String.valueOf(producto.getPrecio()));
            comboEstadoProducto5.setValue(producto.getEstado());

            if (producto.getEstado() != null && producto.getEstado() != Estado.NULL) {
                comboEstadoProducto5.setValue(producto.getEstado());
            } else {
                comboEstadoProducto5.setValue(null);
            }
        } else {
            campoCodigoProducto5.setText("");
            campoNombreProducto5.setText("");
            campoCategoria5.setText("");
            campoPrecio5.setText("");
            comboEstadoProducto5.setValue(null);
        }
    }

    private void limpiarCamposProducto5() {
        campoCodigoProducto5.setText("");
        campoNombreProducto5.setText("");
        campoUrlImagen5.setText("");
        campoCategoria5.setText("");
        campoPrecio5.setText("");
        comboEstadoProducto5.setValue(null);
    }

    private void publicarProducto5() {
        String codigo = campoCodigoProducto5.getText();
        String nombreProducto = campoNombreProducto5.getText();
        String rutaImagen = campoUrlImagen5.getText();
        String categoria = campoCategoria5.getText();
        double precio = Double.parseDouble(campoPrecio5.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto5.getValue());

        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            crearProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 6);
        } else {
            mostrarMensaje("Notificación producto", "Producto no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }
    }

    private void actualizarProducto5() {

        String codigo = campoCodigoProducto5.getText();
        String nombreProducto = campoNombreProducto5.getText();
        String rutaImagen = campoUrlImagen5.getText();
        String categoria = campoCategoria5.getText();
        double precio = Double.parseDouble(campoPrecio5.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto5.getValue());

        //5. Validar la información
        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            actualizarProductos(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 6);
        } else {
            mostrarMensaje("Notificación producto", "Producto no actualizado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }


    }

    private void eliminarProducto5() {
        boolean productoEliminado = false;


        if (productoSeleccionado != null) {


            if (mostrarMensajeConfirmacion("¿Estas seguro de elimininar el producto?") == true) {

                productoEliminado = controllerVendedorView.eliminarProducto(productoSeleccionado.getCodigo());


                if (productoEliminado == true) {
                    listaProductosVis.remove(productoSeleccionado);
                    productoSeleccionado = null;

                    tablaProductos5.getSelectionModel().clearSelection();
                    limpiarCamposProducto5();

                    mostrarMensaje("Notificación producto", "Producto eliminado", "El producto se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                } else {
                    mostrarMensaje("Notificación producto", "Producto no eliminado", "El producto no se puede eliminar", Alert.AlertType.ERROR);
                }
            }
        } else {
            mostrarMensaje("Notificación producto", "Producto no seleccionado", "Seleccionado un producto de la lista", Alert.AlertType.WARNING);
        }

    }


    @FXML
    void publicarProductoAction5(ActionEvent event) {
        publicarProducto5();
    }


    @FXML
    void actualizarProductoAction5(ActionEvent event) {
        actualizarProducto5();
    }

    @FXML
    void eliminarProductoAction5(ActionEvent event) {
        eliminarProducto5();
    }


    public void inicialzarVendedorView6() {
        //1. Inicializar la tabla

        this.columnaNombreP6.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnaCategoria6.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        this.columnaPrecio6.setCellValueFactory(new PropertyValueFactory<>("precio"));
        this.columnaEstado6.setCellValueFactory(new PropertyValueFactory<>("estado"));
        this.columnaCodigo6.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.colimagen6.setCellValueFactory(new PropertyValueFactory<>("rutaImagen"));
        this.colimagen6.setCellFactory(column -> {
            TableCell<Producto, String> cell = new TableCell<>() {
                private final ImageView imageView = new ImageView();

                @Override
                protected void updateItem(String rutaImagen, boolean empty) {
                    super.updateItem(rutaImagen, empty);

                    if (empty || rutaImagen == null) {
                        setGraphic(null);
                    } else {
                        Image image = new Image("file:" +rutaImagen);
                        imageView.setImage(image);
                        imageView.setFitWidth(150);
                        imageView.setFitHeight(150);
                        imageView.setPreserveRatio(true);
                        imageView.setSmooth(true);
                        setGraphic(imageView);
                    }
                }
            };
            return cell;
        });
        this.sugerencias6.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.solicitudes6.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.contactos6.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        tablaProductos6.getItems().clear();
        tablaProductos6.setItems(getListaProductosVis());
        tablaSugerencias6.getItems().clear();
        tablaSugerencias6.setItems(getListaSugerenciasAmistad());
        tablaSolicitudes6.getItems().clear();
        tablaSolicitudes6.setItems(getListaSolicitudesAmistad());
        tablaContactos6.getItems().clear();
        tablaContactos6.setItems(getListaContactosAmistad());


// Cada vez que se le da clic setea los campos de la tabla hacia los campos de texto
        tablaProductos6.getSelectionModel().selectedItemProperty().addListener((obs, oldSelecction, newSelecction) -> {
            this.productoSeleccionado = newSelecction;
            this.setearCamposProductos6(this.productoSeleccionado);
        });
    }

    private void setearCamposProductos6(Producto producto) {

        if (producto != null) {
            campoCodigoProducto6.setText(producto.getCodigo());
            campoNombreProducto6.setText(producto.getNombre());
            campoCategoria6.setText(producto.getCategoria());
            campoPrecio6.setText(String.valueOf(producto.getPrecio()));
            comboEstadoProducto6.setValue(producto.getEstado());

            if (producto.getEstado() != null && producto.getEstado() != Estado.NULL) {
                comboEstadoProducto6.setValue(producto.getEstado());
            } else {
                comboEstadoProducto6.setValue(null);
            }
        } else {
            campoCodigoProducto6.setText("");
            campoNombreProducto6.setText("");
            campoCategoria6.setText("");
            campoPrecio6.setText("");
            comboEstadoProducto6.setValue(null);
        }
    }

    private void limpiarCamposProducto6() {
        campoCodigoProducto6.setText("");
        campoNombreProducto6.setText("");
        campoUrlImagen6.setText("");
        campoCategoria6.setText("");
        campoPrecio6.setText("");
        comboEstadoProducto6.setValue(null);
    }

    private void publicarProducto6() {
        String codigo = campoCodigoProducto6.getText();
        String nombreProducto = campoNombreProducto6.getText();
        String rutaImagen = campoUrlImagen6.getText();
        String categoria = campoCategoria6.getText();
        double precio = Double.parseDouble(campoPrecio6.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto6.getValue());

        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            crearProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 7);
        } else {
            mostrarMensaje("Notificación producto", "Producto no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }
    }

    private void actualizarProducto6() {

        String codigo = campoCodigoProducto6.getText();
        String nombreProducto = campoNombreProducto6.getText();
        String rutaImagen = campoUrlImagen6.getText();
        String categoria = campoCategoria6.getText();
        double precio = Double.parseDouble(campoPrecio6.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto6.getValue());

        //6. Validar la información
        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            actualizarProductos(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 7);
        } else {
            mostrarMensaje("Notificación producto", "Producto no actualizado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }


    }

    private void eliminarProducto6() {
        boolean productoEliminado = false;


        if (productoSeleccionado != null) {


            if (mostrarMensajeConfirmacion("¿Estas seguro de elimininar el producto?") == true) {

                productoEliminado = controllerVendedorView.eliminarProducto(productoSeleccionado.getCodigo());


                if (productoEliminado == true) {
                    listaProductosVis.remove(productoSeleccionado);
                    productoSeleccionado = null;

                    tablaProductos6.getSelectionModel().clearSelection();
                    limpiarCamposProducto6();

                    mostrarMensaje("Notificación producto", "Producto eliminado", "El producto se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                } else {
                    mostrarMensaje("Notificación producto", "Producto no eliminado", "El producto no se puede eliminar", Alert.AlertType.ERROR);
                }
            }
        } else {
            mostrarMensaje("Notificación producto", "Producto no seleccionado", "Seleccionado un producto de la lista", Alert.AlertType.WARNING);
        }

    }


    @FXML
    void publicarProductoAction6(ActionEvent event) {
        publicarProducto6();
    }


    @FXML
    void actualizarProductoAction6(ActionEvent event) {
        actualizarProducto6();
    }

    @FXML
    void eliminarProductoAction6(ActionEvent event) {
        eliminarProducto6();
    }


    public void inicialzarVendedorView7() {
        //1. Inicializar la tabla

        this.columnaNombreP7.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnaCategoria7.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        this.columnaPrecio7.setCellValueFactory(new PropertyValueFactory<>("precio"));
        this.columnaEstado7.setCellValueFactory(new PropertyValueFactory<>("estado"));
        this.columnaCodigo7.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.colimagen7.setCellValueFactory(new PropertyValueFactory<>("rutaImagen"));
        this.colimagen7.setCellFactory(column -> {
            TableCell<Producto, String> cell = new TableCell<>() {
                private final ImageView imageView = new ImageView();

                @Override
                protected void updateItem(String rutaImagen, boolean empty) {
                    super.updateItem(rutaImagen, empty);

                    if (empty || rutaImagen == null) {
                        setGraphic(null);
                    } else {
                        Image image = new Image("file:" + rutaImagen);
                        imageView.setImage(image);
                        imageView.setFitWidth(150);
                        imageView.setFitHeight(150);
                        imageView.setPreserveRatio(true);
                        imageView.setSmooth(true);
                        setGraphic(imageView);
                    }
                }
            };
            return cell;
        });
        this.sugerencias7.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.solicitudes7.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.contactos7.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        tablaProductos7.getItems().clear();
        tablaProductos7.setItems(getListaProductosVis());
        tablaSugerencias7.getItems().clear();
        tablaSugerencias7.setItems(getListaSugerenciasAmistad());
        tablaSolicitudes7.getItems().clear();
        tablaSolicitudes7.setItems(getListaSolicitudesAmistad());
        tablaContactos7.getItems().clear();
        tablaContactos7.setItems(getListaContactosAmistad());


// Cada vez que se le da clic setea los campos de la tabla hacia los campos de texto
        tablaProductos7.getSelectionModel().selectedItemProperty().addListener((obs, oldSelecction, newSelecction) -> {
            this.productoSeleccionado = newSelecction;
            this.setearCamposProductos7(this.productoSeleccionado);
        });
    }

    private void setearCamposProductos7(Producto producto) {

        if (producto != null) {
            campoCodigoProducto7.setText(producto.getCodigo());
            campoNombreProducto7.setText(producto.getNombre());
            campoCategoria7.setText(producto.getCategoria());
            campoPrecio7.setText(String.valueOf(producto.getPrecio()));
            comboEstadoProducto7.setValue(producto.getEstado());

            if (producto.getEstado() != null && producto.getEstado() != Estado.NULL) {
                comboEstadoProducto7.setValue(producto.getEstado());
            } else {
                comboEstadoProducto7.setValue(null);
            }
        } else {
            campoCodigoProducto7.setText("");
            campoNombreProducto7.setText("");
            campoCategoria7.setText("");
            campoPrecio7.setText("");
            comboEstadoProducto7.setValue(null);
        }
    }

    private void limpiarCamposProducto7() {
        campoCodigoProducto7.setText("");
        campoNombreProducto7.setText("");
        campoUrlImagen7.setText("");
        campoCategoria7.setText("");
        campoPrecio7.setText("");
        comboEstadoProducto7.setValue(null);
    }

    private void publicarProducto7() {
        String codigo = campoCodigoProducto7.getText();
        String nombreProducto = campoNombreProducto7.getText();
        String rutaImagen = campoUrlImagen7.getText();
        String categoria = campoCategoria7.getText();
        double precio = Double.parseDouble(campoPrecio7.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto7.getValue());

        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            crearProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 8);
        } else {
            mostrarMensaje("Notificación producto", "Producto no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }
    }

    private void actualizarProducto7() {

        String codigo = campoCodigoProducto7.getText();
        String nombreProducto = campoNombreProducto7.getText();
        String rutaImagen = campoUrlImagen7.getText();
        String categoria = campoCategoria7.getText();
        double precio = Double.parseDouble(campoPrecio7.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto7.getValue());

        //7. Validar la información
        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            actualizarProductos(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 8);
        } else {
            mostrarMensaje("Notificación producto", "Producto no actualizado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }


    }

    private void eliminarProducto7() {
        boolean productoEliminado = false;


        if (productoSeleccionado != null) {


            if (mostrarMensajeConfirmacion("¿Estas seguro de elimininar el producto?") == true) {

                productoEliminado = controllerVendedorView.eliminarProducto(productoSeleccionado.getCodigo());


                if (productoEliminado == true) {
                    listaProductosVis.remove(productoSeleccionado);
                    productoSeleccionado = null;

                    tablaProductos7.getSelectionModel().clearSelection();
                    limpiarCamposProducto7();

                    mostrarMensaje("Notificación producto", "Producto eliminado", "El producto se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                } else {
                    mostrarMensaje("Notificación producto", "Producto no eliminado", "El producto no se puede eliminar", Alert.AlertType.ERROR);
                }
            }
        } else {
            mostrarMensaje("Notificación producto", "Producto no seleccionado", "Seleccionado un producto de la lista", Alert.AlertType.WARNING);
        }

    }


    @FXML
    void publicarProductoAction7(ActionEvent event) {
        publicarProducto7();
    }


    @FXML
    void actualizarProductoAction7(ActionEvent event) {
        actualizarProducto7();
    }

    @FXML
    void eliminarProductoAction7(ActionEvent event) {
        eliminarProducto7();
    }


    public void inicialzarVendedorView8() {
        //1. Inicializar la tabla
        this.columnaNombreP8.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnaCategoria8.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        this.columnaPrecio8.setCellValueFactory(new PropertyValueFactory<>("precio"));
        this.columnaEstado8.setCellValueFactory(new PropertyValueFactory<>("estado"));
        this.columnaCodigo8.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.colimagen8.setCellValueFactory(new PropertyValueFactory<>("rutaImagen"));
        this.colimagen8.setCellFactory(column -> {
            TableCell<Producto, String> cell = new TableCell<>() {
                private final ImageView imageView = new ImageView();

                @Override
                protected void updateItem(String rutaImagen, boolean empty) {
                    super.updateItem(rutaImagen, empty);

                    if (empty || rutaImagen == null) {
                        setGraphic(null);
                    } else {
                        Image image = new Image("file:" + rutaImagen);
                        imageView.setImage(image);
                        imageView.setFitWidth(150);
                        imageView.setFitHeight(150);
                        imageView.setPreserveRatio(true);
                        imageView.setSmooth(true);
                        setGraphic(imageView);
                    }
                }
            };
            return cell;
        });
        this.sugerencias8.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.solicitudes8.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.contactos8.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        tablaProductos8.getItems().clear();
        tablaProductos8.setItems(getListaProductosVis());
        tablaSugerencias8.getItems().clear();
        tablaSugerencias8.setItems(getListaSugerenciasAmistad());
        tablaSolicitudes8.getItems().clear();
        tablaSolicitudes8.setItems(getListaSolicitudesAmistad());
        tablaContactos8.getItems().clear();
        tablaContactos8.setItems(getListaContactosAmistad());


// Cada vez que se le da clic setea los campos de la tabla hacia los campos de texto
        tablaProductos8.getSelectionModel().selectedItemProperty().addListener((obs, oldSelecction, newSelecction) -> {
            this.productoSeleccionado = newSelecction;
            this.setearCamposProductos8(this.productoSeleccionado);
        });
    }

    private void setearCamposProductos8(Producto producto) {

        if (producto != null) {
            campoCodigoProducto8.setText(producto.getCodigo());
            campoNombreProducto8.setText(producto.getNombre());
            campoCategoria8.setText(producto.getCategoria());
            campoPrecio8.setText(String.valueOf(producto.getPrecio()));
            comboEstadoProducto8.setValue(producto.getEstado());

            if (producto.getEstado() != null && producto.getEstado() != Estado.NULL) {
                comboEstadoProducto8.setValue(producto.getEstado());
            } else {
                comboEstadoProducto8.setValue(null);
            }
        } else {
            campoCodigoProducto8.setText("");
            campoNombreProducto8.setText("");
            campoCategoria8.setText("");
            campoPrecio8.setText("");
            comboEstadoProducto8.setValue(null);
        }
    }

    private void limpiarCamposProducto8() {
        campoCodigoProducto8.setText("");
        campoNombreProducto8.setText("");
        campoUrlImagen8.setText("");
        campoCategoria8.setText("");
        campoPrecio8.setText("");
        comboEstadoProducto8.setValue(null);
    }

    private void publicarProducto8() {
        String codigo = campoCodigoProducto8.getText();
        String nombreProducto = campoNombreProducto8.getText();
        String rutaImagen = campoUrlImagen8.getText();
        String categoria = campoCategoria8.getText();
        double precio = Double.parseDouble(campoPrecio8.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto8.getValue());

        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            crearProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 9);
        } else {
            mostrarMensaje("Notificación producto", "Producto no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }
    }

    private void actualizarProducto8() {

        String codigo = campoCodigoProducto8.getText();
        String nombreProducto = campoNombreProducto8.getText();
        String rutaImagen = campoUrlImagen8.getText();
        String categoria = campoCategoria8.getText();
        double precio = Double.parseDouble(campoPrecio8.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto8.getValue());

        //8. Validar la información
        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            actualizarProductos(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 9);
        } else {
            mostrarMensaje("Notificación producto", "Producto no actualizado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }


    }

    private void eliminarProducto8() {
        boolean productoEliminado = false;


        if (productoSeleccionado != null) {


            if (mostrarMensajeConfirmacion("¿Estas seguro de elimininar el producto?") == true) {

                productoEliminado = controllerVendedorView.eliminarProducto(productoSeleccionado.getCodigo());


                if (productoEliminado == true) {
                    listaProductosVis.remove(productoSeleccionado);
                    productoSeleccionado = null;

                    tablaProductos8.getSelectionModel().clearSelection();
                    limpiarCamposProducto8();

                    mostrarMensaje("Notificación producto", "Producto eliminado", "El producto se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                } else {
                    mostrarMensaje("Notificación producto", "Producto no eliminado", "El producto no se puede eliminar", Alert.AlertType.ERROR);
                }
            }
        } else {
            mostrarMensaje("Notificación producto", "Producto no seleccionado", "Seleccionado un producto de la lista", Alert.AlertType.WARNING);
        }

    }


    @FXML
    void publicarProductoAction8(ActionEvent event) {
        publicarProducto8();
    }


    @FXML
    void actualizarProductoAction8(ActionEvent event) {
        actualizarProducto8();
    }

    @FXML
    void eliminarProductoAction8(ActionEvent event) {
        eliminarProducto8();
    }


    public void inicialzarVendedorView9() {
        //1. Inicializar la tabla
        this.columnaNombreP9.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnaCategoria9.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        this.columnaPrecio9.setCellValueFactory(new PropertyValueFactory<>("precio"));
        this.columnaEstado9.setCellValueFactory(new PropertyValueFactory<>("estado"));
        this.columnaCodigo9.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.colimagen9.setCellValueFactory(new PropertyValueFactory<>("rutaImagen"));
        this.colimagen9.setCellFactory(column -> {
            TableCell<Producto, String> cell = new TableCell<>() {
                private final ImageView imageView = new ImageView();

                @Override
                protected void updateItem(String rutaImagen, boolean empty) {
                    super.updateItem(rutaImagen, empty);

                    if (empty || rutaImagen == null) {
                        setGraphic(null);
                    } else {
                        Image image = new Image("file:" + rutaImagen);
                        imageView.setImage(image);
                        imageView.setFitWidth(150);
                        imageView.setFitHeight(150);
                        imageView.setPreserveRatio(true);
                        imageView.setSmooth(true);
                        setGraphic(imageView);
                    }
                }
            };
            return cell;
        });
        this.sugerencias9.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.solicitudes9.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.contactos9.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        tablaProductos9.getItems().clear();
        tablaProductos9.setItems(getListaProductosVis());
        tablaSugerencias9.getItems().clear();
        tablaSugerencias9.setItems(getListaSugerenciasAmistad());
        tablaSolicitudes9.getItems().clear();
        tablaSolicitudes9.setItems(getListaSolicitudesAmistad());
        tablaContactos9.getItems().clear();
        tablaContactos9.setItems(getListaContactosAmistad());


// Cada vez que se le da clic setea los campos de la tabla hacia los campos de texto
        tablaProductos9.getSelectionModel().selectedItemProperty().addListener((obs, oldSelecction, newSelecction) -> {
            this.productoSeleccionado = newSelecction;
            this.setearCamposProductos9(this.productoSeleccionado);
        });
    }

    private void setearCamposProductos9(Producto producto) {

        if (producto != null) {
            campoCodigoProducto9.setText(producto.getCodigo());
            campoNombreProducto9.setText(producto.getNombre());
            campoCategoria9.setText(producto.getCategoria());
            campoPrecio9.setText(String.valueOf(producto.getPrecio()));
            comboEstadoProducto9.setValue(producto.getEstado());

            if (producto.getEstado() != null && producto.getEstado() != Estado.NULL) {
                comboEstadoProducto9.setValue(producto.getEstado());
            } else {
                comboEstadoProducto9.setValue(null);
            }
        } else {
            campoCodigoProducto9.setText("");
            campoNombreProducto9.setText("");
            campoCategoria9.setText("");
            campoPrecio9.setText("");
            comboEstadoProducto9.setValue(null);
        }
    }

    private void limpiarCamposProducto9() {
        campoCodigoProducto9.setText("");
        campoNombreProducto9.setText("");
        campoUrlImagen9.setText("");
        campoCategoria9.setText("");
        campoPrecio9.setText("");
        comboEstadoProducto9.setValue(null);
    }

    private void publicarProducto9() {
        String codigo = campoCodigoProducto9.getText();
        String nombreProducto = campoNombreProducto9.getText();
        String rutaImagen = campoUrlImagen9.getText();
        String categoria = campoCategoria9.getText();
        double precio = Double.parseDouble(campoPrecio9.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto9.getValue());

        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            crearProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 10);
        } else {
            mostrarMensaje("Notificación producto", "Producto no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }
    }

    private void actualizarProducto9() {

        String codigo = campoCodigoProducto9.getText();
        String nombreProducto = campoNombreProducto9.getText();
        String rutaImagen = campoUrlImagen9.getText();
        String categoria = campoCategoria9.getText();
        double precio = Double.parseDouble(campoPrecio9.getText());
        String estadoProducto = String.valueOf(comboEstadoProducto9.getValue());

        //9. Validar la información
        if (datosValidosProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto) == true) {
            Estado estado = Estado.valueOf(estadoProducto);
            actualizarProductos(codigo, nombreProducto, rutaImagen, categoria, precio, estado, 10);
        } else {
            mostrarMensaje("Notificación producto", "Producto no actualizado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }


    }

    private void eliminarProducto9() {
        boolean productoEliminado = false;


        if (productoSeleccionado != null) {

            if (mostrarMensajeConfirmacion("¿Estas seguro de elimininar el producto?") == true) {

                productoEliminado = controllerVendedorView.eliminarProducto(productoSeleccionado.getCodigo());


                if (productoEliminado == true) {
                    listaProductosVis.remove(productoSeleccionado);
                    productoSeleccionado = null;

                    tablaProductos9.getSelectionModel().clearSelection();
                    limpiarCamposProducto9();

                    mostrarMensaje("Notificación producto", "Producto eliminado", "El producto se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                } else {
                    mostrarMensaje("Notificación producto", "Producto no eliminado", "El producto no se puede eliminar", Alert.AlertType.ERROR);
                }
            }
        } else {
            mostrarMensaje("Notificación producto", "Producto no seleccionado", "Seleccionado un producto de la lista", Alert.AlertType.WARNING);
        }

    }

    public ObservableList<Vendedor> getListaSugerenciasAmistad() {

        listaSugerenciasAmistad.addAll(modelFactoryController.llenarTablaSugerencias());
        return listaSugerenciasAmistad;
    }
    private ObservableList<Vendedor> getListaContactosAmistad() {
        listaContactos.addAll(modelFactoryController.obtenerContactos());
        return listaContactos;
    }

    public ObservableList<Vendedor> getListaSolicitudesAmistad() {

        listaSolicitudesAmistad.addAll(modelFactoryController.obtenerSolicitudes());
        return listaSolicitudesAmistad;
    }

    public ObservableList<Producto> getListaPublicaciones() {
        listaPublicaciones.addAll(controllerVendedorView.obtenerPublicaciones());
        return listaPublicaciones;
    }

    public void setListaSugerenciasAmistad(ObservableList<Vendedor> listaSugerenciasAmistad) {
        this.listaSugerenciasAmistad = listaSugerenciasAmistad;
    }



    private void llenarTablaContactos(){


    }


    @FXML
    void publicarProductoAction9(ActionEvent event) {
        publicarProducto9();
    }


    @FXML
    void actualizarProductoAction9(ActionEvent event) {
        actualizarProducto9();
    }

    @FXML
    void eliminarProductoAction9(ActionEvent event) {
        eliminarProducto9();
    }

    @FXML
    void cerrarSesionAction(ActionEvent event) {
        aplicacion.mostrarVentanaInicio();
    }

    private void crearProducto (String codigo, String nombreProducto, String rutaImagen, String categoria, double precio, Estado estadoProducto, int indicador){
        Producto producto = null;
        producto = controllerVendedorView.publicarProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto);
        if (producto != null) {
            listaProductosVis.add(producto);
            mostrarMensaje("Notificación producto", "Producto creado", "El producto se ha creado con éxito", Alert.AlertType.INFORMATION);
            refresh(indicador);
            limpiarCamposProducto9();
        } else {
            mostrarMensaje("Notificación producto", "Producto no creado", "El producto con codigo " + codigo + " ya existe", Alert.AlertType.INFORMATION);
        }
    }

    private void actualizarProductos(String codigo, String nombreProducto, String rutaImagen, String categoria, double precio, Estado estadoProducto, int indicador) {
        Producto producto = null;
        producto = controllerVendedorView.actualizarProducto(codigo, nombreProducto, rutaImagen, categoria, precio, estadoProducto, productoSeleccionado.getCodigo());
        if (producto != null) {
            refresh(indicador);
            mostrarMensaje("Notificación producto", "Producto actualizado", "El producto se ha actualizado con éxito", Alert.AlertType.INFORMATION);
            limpiarCamposProducto9();
        } else {
            mostrarMensaje("Notificación producto", "Producto no actualizado", "El producto no se ha actualizado", Alert.AlertType.INFORMATION);
        }
    }

    @FXML
    void crearSolicitudAction(ActionEvent event) {
        vendedorSeleccionado = tablaSugerencias.getSelectionModel().getSelectedItem();
        crearSolicitud(vendedorSeleccionado,0);
    }

    @FXML
    void crearSolicitudAction1(ActionEvent event) {
        vendedorSeleccionado = tablaSugerencias1.getSelectionModel().getSelectedItem();
        crearSolicitud(vendedorSeleccionado,1);
    }
    @FXML
    void crearSolicitudAction2(ActionEvent event) {
        vendedorSeleccionado = tablaSugerencias2.getSelectionModel().getSelectedItem();
        crearSolicitud(vendedorSeleccionado,2);
    }
    @FXML
    void crearSolicitudAction3(ActionEvent event) {
        vendedorSeleccionado = tablaSugerencias3.getSelectionModel().getSelectedItem();
        crearSolicitud(vendedorSeleccionado,3);
    }
    @FXML
    void crearSolicitudAction4(ActionEvent event) {
        vendedorSeleccionado = tablaSugerencias4.getSelectionModel().getSelectedItem();
        crearSolicitud(vendedorSeleccionado,4);
    }
    @FXML
    void crearSolicitudAction5(ActionEvent event) {
        vendedorSeleccionado = tablaSugerencias5.getSelectionModel().getSelectedItem();
        crearSolicitud(vendedorSeleccionado,5);
    }
    @FXML
    void crearSolicitudAction6(ActionEvent event) {
        vendedorSeleccionado = tablaSugerencias6.getSelectionModel().getSelectedItem();
        crearSolicitud(vendedorSeleccionado,6);
    }
    @FXML
    void crearSolicitudAction7(ActionEvent event) {
        vendedorSeleccionado = tablaSugerencias7.getSelectionModel().getSelectedItem();
        crearSolicitud(vendedorSeleccionado,7);
    }
    @FXML
    void crearSolicitudAction8(ActionEvent event) {
        vendedorSeleccionado = tablaSugerencias8.getSelectionModel().getSelectedItem();
        crearSolicitud(vendedorSeleccionado,8);
    }
    @FXML
    void crearSolicitudAction9(ActionEvent event) {
        vendedorSeleccionado = tablaSugerencias9.getSelectionModel().getSelectedItem();
        crearSolicitud(vendedorSeleccionado,9);
    }

    private void crearSolicitud(Vendedor vendedor, int indicador) {
        if (vendedor != null) {
            if (mostrarMensajeConfirmacion("¿Estas seguro de enviar la solicitud de amistad?") == true) {
                boolean solicitudEnviada = controllerVendedorView.crearSolicitudAmistad(vendedor);
                if (solicitudEnviada == true) {
                    mostrarMensaje("Notificación solicitud", "Solicitud enviada", "La solicitud se ha enviado con éxito", Alert.AlertType.INFORMATION);
                    refreshTablasSocial(indicador);
                } else {
                    mostrarMensaje("Notificación solicitud", "Solicitud no enviada", "La solicitud no se ha enviado, ya la has enviado antes", Alert.AlertType.ERROR);
                }
            }
        } else {
            mostrarMensaje("Notificación solicitud", "Solicitud no enviada", "Selecciona un vendedor de la lista", Alert.AlertType.WARNING);
        }
    }

    @FXML
    void confirmarSolicitudAction(ActionEvent event) {
        vendedorSeleccionado = tablaSolicitudes.getSelectionModel().getSelectedItem();
        confirmarSolicitud(vendedorSeleccionado, 0);
    }
    @FXML
    void confirmarSolicitudAction1(ActionEvent event) {
        vendedorSeleccionado = tablaSolicitudes1.getSelectionModel().getSelectedItem();
        confirmarSolicitud(vendedorSeleccionado, 1);
    }
    @FXML
    void confirmarSolicitudAction2(ActionEvent event) {
        vendedorSeleccionado = tablaSolicitudes2.getSelectionModel().getSelectedItem();
        confirmarSolicitud(vendedorSeleccionado, 2);
    }
    @FXML
    void confirmarSolicitudAction3(ActionEvent event) {
        vendedorSeleccionado = tablaSolicitudes3.getSelectionModel().getSelectedItem();
        confirmarSolicitud(vendedorSeleccionado, 3);
    }
    @FXML
    void confirmarSolicitudAction4(ActionEvent event) {
        vendedorSeleccionado = tablaSolicitudes4.getSelectionModel().getSelectedItem();
        confirmarSolicitud(vendedorSeleccionado, 4);
    }
    @FXML
    void confirmarSolicitudAction5(ActionEvent event) {
        vendedorSeleccionado = tablaSolicitudes5.getSelectionModel().getSelectedItem();
        confirmarSolicitud(vendedorSeleccionado, 5);
    }
    @FXML
    void confirmarSolicitudAction6(ActionEvent event) {
        vendedorSeleccionado = tablaSolicitudes6.getSelectionModel().getSelectedItem();
        confirmarSolicitud(vendedorSeleccionado, 6);
    }
    @FXML
    void confirmarSolicitudAction7(ActionEvent event) {
        vendedorSeleccionado = tablaSolicitudes7.getSelectionModel().getSelectedItem();
        confirmarSolicitud(vendedorSeleccionado,7);
    }
    @FXML
    void confirmarSolicitudAction8(ActionEvent event) {
        vendedorSeleccionado = tablaSolicitudes8.getSelectionModel().getSelectedItem();
        confirmarSolicitud(vendedorSeleccionado, 8);
    }
    @FXML
    void confirmarSolicitudAction9(ActionEvent event) {
        vendedorSeleccionado = tablaSolicitudes9.getSelectionModel().getSelectedItem();
        confirmarSolicitud(vendedorSeleccionado, 9);
    }


    private void confirmarSolicitud(Vendedor vendedor, int indicador) {
        if (vendedor != null) {
            if (mostrarMensajeConfirmacion("¿Estas seguro de confirmar la solicitud de amistad?") == true) {
                boolean solicitudConfirmada = controllerVendedorView.confirmarSolicitudAmistad(vendedor);
                if (solicitudConfirmada == true) {
                    mostrarMensaje("Notificación solicitud", "Solicitud confirmada", "La solicitud se ha confirmado con éxito", Alert.AlertType.INFORMATION);
                    refreshTablasSocial(indicador);
                } else {
                    mostrarMensaje("Notificación solicitud", "Solicitud no confirmada", "La solicitud no se ha confirmado, ya la has confirmado antes", Alert.AlertType.ERROR);
                }
            }
        }
    }

    private void refreshTablasSocial(int indicador) {
        switch (indicador){
            case 0:
                tablaSolicitudes.getItems().clear();
                tablaSolicitudes.setItems(getListaSolicitudesAmistad());
                tablaSolicitudes.getSelectionModel().clearSelection();
                tablaSugerencias.getItems().clear();
                tablaSugerencias.setItems(getListaSugerenciasAmistad());
                tablaSugerencias.getSelectionModel().clearSelection();
                tablaContactos.getItems().clear();
                tablaContactos.setItems(getListaContactosAmistad());
                break;
            case 1:
                tablaSolicitudes1.getItems().clear();
                tablaSolicitudes1.setItems(getListaSolicitudesAmistad());
                tablaSolicitudes1.getSelectionModel().clearSelection();
                tablaSugerencias1.getItems().clear();
                tablaSugerencias1.setItems(getListaSugerenciasAmistad());
                tablaSugerencias1.getSelectionModel().clearSelection();
                tablaContactos1.getItems().clear();
                tablaContactos1.setItems(getListaContactosAmistad());
                break;
            case 2:
                tablaSolicitudes2.getItems().clear();
                tablaSolicitudes2.setItems(getListaSolicitudesAmistad());
                tablaSolicitudes2.getSelectionModel().clearSelection();
                tablaSugerencias2.getItems().clear();
                tablaSugerencias2.setItems(getListaSugerenciasAmistad());
                tablaSugerencias2.getSelectionModel().clearSelection();
                tablaContactos2.getItems().clear();
                tablaContactos2.setItems(getListaContactosAmistad());
                break;
            case 3:
                tablaSolicitudes3.getItems().clear();
                tablaSolicitudes3.setItems(getListaSolicitudesAmistad());
                tablaSolicitudes3.getSelectionModel().clearSelection();
                tablaSugerencias3.getItems().clear();
                tablaSugerencias3.setItems(getListaSugerenciasAmistad());
                tablaSugerencias3.getSelectionModel().clearSelection();
                tablaContactos3.getItems().clear();
                tablaContactos3.setItems(getListaContactosAmistad());
                break;
            case 4:
                tablaSolicitudes4.getItems().clear();
                tablaSolicitudes4.setItems(getListaSolicitudesAmistad());
                tablaSolicitudes4.getSelectionModel().clearSelection();
                tablaSugerencias4.getItems().clear();
                tablaSugerencias4.setItems(getListaSugerenciasAmistad());
                tablaSugerencias4.getSelectionModel().clearSelection();
                tablaContactos4.getItems().clear();
                tablaContactos4.setItems(getListaContactosAmistad());
                break;
            case 5:
                tablaSolicitudes5.getItems().clear();
                tablaSolicitudes5.setItems(getListaSolicitudesAmistad());
                tablaSolicitudes5.getSelectionModel().clearSelection();
                tablaSugerencias5.getItems().clear();
                tablaSugerencias5.setItems(getListaSugerenciasAmistad());
                tablaSugerencias5.getSelectionModel().clearSelection();
                tablaContactos5.getItems().clear();
                tablaContactos5.setItems(getListaContactosAmistad());
                break;
            case 6:
                tablaSolicitudes6.getItems().clear();
                tablaSolicitudes6.setItems(getListaSolicitudesAmistad());
                tablaSolicitudes6.getSelectionModel().clearSelection();
                tablaSugerencias6.getItems().clear();
                tablaSugerencias6.setItems(getListaSugerenciasAmistad());
                tablaSugerencias6.getSelectionModel().clearSelection();
                tablaContactos6.getItems().clear();
                tablaContactos6.setItems(getListaContactosAmistad());
                break;
            case 7:
                tablaSolicitudes7.getItems().clear();
                tablaSolicitudes7.setItems(getListaSolicitudesAmistad());
                tablaSolicitudes7.getSelectionModel().clearSelection();
                tablaSugerencias7.getItems().clear();
                tablaSugerencias7.setItems(getListaSugerenciasAmistad());
                tablaSugerencias7.getSelectionModel().clearSelection();
                tablaContactos7.getItems().clear();
                tablaContactos7.setItems(getListaContactosAmistad());
                break;
            case 8:
                tablaSolicitudes8.getItems().clear();
                tablaSolicitudes8.setItems(getListaSolicitudesAmistad());
                tablaSolicitudes8.getSelectionModel().clearSelection();
                tablaSugerencias8.getItems().clear();
                tablaSugerencias8.setItems(getListaSugerenciasAmistad());
                tablaSugerencias8.getSelectionModel().clearSelection();
                tablaContactos8.getItems().clear();
                tablaContactos8.setItems(getListaContactosAmistad());
                break;
            case 9:
                tablaSolicitudes9.getItems().clear();
                tablaSolicitudes9.setItems(getListaSolicitudesAmistad());
                tablaSolicitudes9.getSelectionModel().clearSelection();
                tablaSugerencias9.getItems().clear();
                tablaSugerencias9.setItems(getListaSugerenciasAmistad());
                tablaSugerencias9.getSelectionModel().clearSelection();
                tablaContactos9.getItems().clear();
                tablaContactos9.setItems(getListaContactosAmistad());
                break;
        }
    }

}
