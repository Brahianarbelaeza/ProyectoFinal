package controlador;

import aplicacion.Aplicacion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.Estado;
import modelo.Producto;
import modelo.Vendedor;

import java.util.ArrayList;
import java.util.Optional;


public class ControladorMarketplaceView {
    Aplicacion aplicacion;
    ModelFactoryController modelFactoryController;
    ControllerAdminView controllerAdminView;
    Vendedor vendedorSeleccionado;
    Producto productoSeleccionado=new Producto();
    ObservableList<Vendedor> listaVendedoresData = FXCollections.observableArrayList();
    ControllerLoginView controllerLoginView;

    ObservableList<Producto> listaProductosVis = FXCollections.observableArrayList();

    @FXML
    private Button botonActualizar;

    @FXML
    private Button botonActualizar1;

    @FXML
    private Button botonActualizar2;

    @FXML
    private Button botonActualizar3;

    @FXML
    private Button botonActualizar4;

    @FXML
    private Button botonActualizar5;

    @FXML
    private Button botonActualizar6;

    @FXML
    private Button botonActualizar7;

    @FXML
    private Button botonActualizar8;

    @FXML
    private Button botonActualizar9;

    @FXML
    private Button botonActualizarVendedor;

    @FXML
    private Button botonCrearVendedor;

    @FXML
    private Button botonEliminar;

    @FXML
    private Button botonEliminar1;

    @FXML
    private Button botonEliminar2;

    @FXML
    private Button botonEliminar3;

    @FXML
    private Button botonEliminar4;

    @FXML
    private Button botonEliminar5;

    @FXML
    private Button botonEliminar6;

    @FXML
    private Button botonEliminar7;

    @FXML
    private Button botonEliminar8;

    @FXML
    private Button botonEliminar9;

    @FXML
    private Button botonEliminarVender;

    @FXML
    private Button botonPublicar;

    @FXML
    private Button botonPublicar1;

    @FXML
    private Button botonPublicar2;

    @FXML
    private Button botonPublicar3;

    @FXML
    private Button botonPublicar4;

    @FXML
    private Button botonPublicar5;

    @FXML
    private Button botonPublicar6;

    @FXML
    private Button botonPublicar7;

    @FXML
    private Button botonPublicar8;

    @FXML
    private Button botonPublicar9;

    @FXML
    private Button botonSubirImagen;

    @FXML
    private Button botonSubirImagen1;

    @FXML
    private Button botonSubirImagen2;

    @FXML
    private Button botonSubirImagen3;

    @FXML
    private Button botonSubirImagen4;

    @FXML
    private Button botonSubirImagen5;

    @FXML
    private Button botonSubirImagen6;

    @FXML
    private Button botonSubirImagen7;

    @FXML
    private Button botonSubirImagen8;

    @FXML
    private Button botonSubirImagen9;

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
    private TableColumn<Vendedor, String > colNombreVendedor;

    @FXML
    private TableColumn<Producto,String> columnaCategoria;

    @FXML
    private TableColumn<Producto,String> columnaCategoria1;

    @FXML
    private TableColumn<Producto,String> columnaCategoria2;

    @FXML
    private TableColumn<Producto,String> columnaCategoria3;

    @FXML
    private TableColumn<Producto,String> columnaCategoria4;

    @FXML
    private TableColumn<Producto,String> columnaCategoria5;

    @FXML
    private TableColumn<Producto,String> columnaCategoria6;

    @FXML
    private TableColumn<Producto,String> columnaCategoria7;

    @FXML
    private TableColumn<Producto,String> columnaCategoria8;

    @FXML
    private TableColumn<Producto,String> columnaCategoria9;

    @FXML
    private TableColumn<Producto,String> columnaCodigo;

    @FXML
    private TableColumn<Producto,String> columnaCodigo1;

    @FXML
    private TableColumn<Producto,String> columnaCodigo2;

    @FXML
    private TableColumn<Producto,String> columnaCodigo3;

    @FXML
    private TableColumn<Producto,String> columnaCodigo4;

    @FXML
    private TableColumn<Producto,String> columnaCodigo5;

    @FXML
    private TableColumn<Producto,String> columnaCodigo6;

    @FXML
    private TableColumn<Producto,String> columnaCodigo7;

    @FXML
    private TableColumn<Producto,String> columnaCodigo8;

    @FXML
    private TableColumn<Producto,String> columnaCodigo9;

    @FXML
    private TableColumn<Producto,String> columnaEstado;

    @FXML
    private TableColumn<Producto,String> columnaEstado1;

    @FXML
    private TableColumn<Producto,String> columnaEstado2;

    @FXML
    private TableColumn<Producto,String> columnaEstado3;

    @FXML
    private TableColumn<Producto,String> columnaEstado4;

    @FXML
    private TableColumn<Producto,String> columnaEstado5;

    @FXML
    private TableColumn<Producto,String> columnaEstado6;

    @FXML
    private TableColumn<Producto,String> columnaEstado7;

    @FXML
    private TableColumn<Producto,String> columnaEstado8;

    @FXML
    private TableColumn<Producto,String> columnaEstado9;

    @FXML
    private TableColumn<Producto,String> columnaNombreP;

    @FXML
    private TableColumn<Producto,String> columnaNombreP1;

    @FXML
    private TableColumn<Producto,String> columnaNombreP2;

    @FXML
    private TableColumn<Producto,String> columnaNombreP3;

    @FXML
    private TableColumn<Producto,String> columnaNombreP4;

    @FXML
    private TableColumn<Producto,String> columnaNombreP5;

    @FXML
    private TableColumn<Producto,String> columnaNombreP6;

    @FXML
    private TableColumn<Producto,String> columnaNombreP7;

    @FXML
    private TableColumn<Producto,String> columnaNombreP8;

    @FXML
    private TableColumn<Producto,String> columnaNombreP9;

    @FXML
    private TableColumn<Producto,String> columnaPrecio;

    @FXML
    private TableColumn<Producto,String> columnaPrecio1;

    @FXML
    private TableColumn<Producto,String> columnaPrecio2;

    @FXML
    private TableColumn<Producto,String> columnaPrecio3;

    @FXML
    private TableColumn<Producto,String> columnaPrecio4;

    @FXML
    private TableColumn<Producto,String> columnaPrecio5;

    @FXML
    private TableColumn<Producto,String> columnaPrecio6;

    @FXML
    private TableColumn<Producto,String> columnaPrecio7;

    @FXML
    private TableColumn<Producto,String> columnaPrecio8;

    @FXML
    private TableColumn<Producto,String> columnaPrecio9;

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
    private Label labelApellido;

    @FXML
    private Label labelCedula;

    @FXML
    private Label labelCuenta;

    @FXML
    private Label labelCuenta1;

    @FXML
    private Label labelDireccion;

    @FXML
    private Label labelNombre;

    @FXML
    private Tab tabAdministrador;

    @FXML
    private Tab tabVendedor;

    @FXML
    private Tab tabVendedor1;

    @FXML
    private Tab tabVendedor2;

    @FXML
    private Tab tabVendedor3;

    @FXML
    private Tab tabVendedor4;

    @FXML
    private Tab tabVendedor5;

    @FXML
    private Tab tabVendedor6;

    @FXML
    private Tab tabVendedor7;

    @FXML
    private Tab tabVendedor8;

    @FXML
    private Tab tabVendedor9;

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
    private TableView<Vendedor> tblVendedores;

    @FXML
    private TabPane tabPrincipal;



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
                limpiarCamposProducto();
            }else{
                mostrarMensaje("Notificación producto", "Producto no creado", "El producto con codigo " + codigo + " ya existe", Alert.AlertType.INFORMATION);
            }
        }else{
            mostrarMensaje("Notificación vendedor", "Vendedor no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }


    }

    @FXML
    void eventoComboBox(ActionEvent event) {

    }

    @FXML
    void subirImagenAction(ActionEvent event) {

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
                limpiarCamposProducto();
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
                    limpiarCamposProducto();

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

        listaProductosVis.addAll(controllerAdminView.obtenerProductos());
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
        comboEstadoProducto.getItems().addAll(Estado.values());
        modelFactoryController = ModelFactoryController.getInstance();

        inicialzarAdminView();
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
    public void inicialzarAdminView(){
        //1. Inicializar la tabla
        this.colNombreVendedor.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.colApellidoVendedor.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        this.colCedulaVendedor.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        this.colDireccionVendedor.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        this.colCuentaVendedor.setCellValueFactory(new PropertyValueFactory<>("cuenta"));

        tblVendedores.getItems().clear();
        tblVendedores.setItems(getListaVendedoresData());


// Cada vez que se le da clic setea los campos de la tabla hacia los campos de texto
        tblVendedores.getSelectionModel().selectedItemProperty().addListener((obs, oldSelecction, newSelecction) ->{
            this.vendedorSeleccionado = newSelecction;
            this.setearCamposVendedor(this.vendedorSeleccionado);
        });
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
                mostrarMensaje("Notificación vendedor", "Vendedor creado", "El vendedor se ha creado con éxito", Alert.AlertType.INFORMATION);
                refresh();
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
        if(datosValidos(nombre, apellido, cedula, direccion, cuenta, contrasena)== true){
            Vendedor vendedor= null;
            vendedor = controllerAdminView.actualizarVendedor(nombre, apellido, cedula, direccion, cuenta, contrasena, vendedorSeleccionado.getCedula());
            if(vendedor != null){
                refresh();
                mostrarMensaje("Notificación vendedor", "Vendedor actualizado", "El vendedor se ha actualizado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposVendedor();
            }else{
                mostrarMensaje("Notificación vendedor", "Vendedor no actualizado", "El vendedor no se ha actualizado", Alert.AlertType.INFORMATION);
            }
        }else{
            mostrarMensaje("Notificación vendedor", "Vendedor no actualizado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }


    }
    private void eliminarVendedor(){
        boolean empleadoEliminado = false;


        if(vendedorSeleccionado != null){


            if(mostrarMensajeConfirmacion("¿Estas seguro de elimininar al empleado?") == true){

                empleadoEliminado = controllerAdminView.eliminarVendedor(vendedorSeleccionado.getCedula());


                if(empleadoEliminado == true){
                    listaVendedoresData.remove(vendedorSeleccionado);
                    vendedorSeleccionado = null;

                    tblVendedores.getSelectionModel().clearSelection();
                    limpiarCamposVendedor();

                    mostrarMensaje("Notificación vendedor", "Vendedor eliminado", "El vendedor se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                }else{
                    mostrarMensaje("Notificación vendedor", "Vendedor no eliminado", "El vendedor no se puede eliminar", Alert.AlertType.ERROR);
                }
            }
        }else{
            mostrarMensaje("Notificación vendedor", "Vendedor no seleccionado", "Seleccionado un vendedor de la lista", Alert.AlertType.WARNING);
        }

    }
    //Actualiza la lista de vehndedores dee la tabla obtener vendedores del singleton contra la de la interfaz
    void refresh(){
        tblVendedores.getItems().clear();
        tblVendedores.setItems(getListaVendedoresData());
    }


    private void limpiarCamposProducto() {
        campoCodigoProducto.setText("");
        campoApellido.setText("");
        campoUrlImagen.setText("");
        campoCategoria.setText("");
        campoPrecio.setText("");
        comboEstadoProducto.setItems(null);
    }

    //Setea los campos de la tabla hacia los de texto
    private void setearCamposVendedor(Vendedor vendedor) {

        if(vendedor !=  null){
            campoNombre.setText(vendedor.getNombre());
            campoApellido.setText(vendedor.getApellido());
            campoCedula.setText(vendedor.getCedula());
            campoDireccion.setText(vendedor.getDireccion());
            campoCuenta.setText(vendedor.getCuenta().getUsuario());
            campoContrasena.setText(vendedor.getCuenta().getContrasena());
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


    @FXML
    void gestionarProductosAction(ActionEvent event) {

        aplicacion.mostrarVentanaPrincipal();

    private boolean mostrarMensajeConfirmacion(String mensaje) {





    private boolean datosValidos(String nombre, String apellido, String cedula,  String direccion, String cuenta, String contrasena) {

        String mensaje = "";


        if(nombre == null || nombre.equals(""))
            mensaje += "El nombre es invalido \n" ;

        if(apellido == null || apellido.equals(""))
            mensaje += "El apellido es invalido \n" ;

        if(cedula == null || cedula.equals(""))
            mensaje += "El documento es invalido \n" ;

        if(direccion == null || direccion.equals(""))
            mensaje += "La direccion es invalida \n" ;
        if(cuenta == null || cuenta.equals(""))
            mensaje += "La direccion es invalida \n" ;
        if(contrasena == null || contrasena.equals(""))
            mensaje += "La direccion es invalida \n" ;


        if(mensaje.equals("")){
            return true;
        }else{
            mostrarMensaje("Notificación cliente","Datos invalidos",mensaje, Alert.AlertType.WARNING);
            return false;
        }
    }
    private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType) {

        Alert aler = new Alert(alertType);
        aler.setTitle(titulo);
        aler.setHeaderText(header);
        aler.setContentText(contenido);
        aler.showAndWait();
    }
    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }

    public ObservableList<Vendedor> getListaVendedoresData() {
        listaVendedoresData.addAll(controllerAdminView.obtenerVendedores());
        return listaVendedoresData;
    }

}