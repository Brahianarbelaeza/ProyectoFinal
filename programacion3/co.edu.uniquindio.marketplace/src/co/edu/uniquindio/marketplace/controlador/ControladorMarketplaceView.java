package controlador;

import aplicacion.Aplicacion;
import excepciones.VendedorException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.Vendedor;

import java.util.Optional;


public class ControladorMarketplaceView {
    Aplicacion aplicacion;
    ModelFactoryController modelFactoryController;
    ControllerAdminView controllerAdminView;
    Vendedor vendedorSeleccionado;
    ObservableList<Vendedor> listaVendedoresData = FXCollections.observableArrayList();


    @FXML
    private Button botonActualizarVendedor;

    @FXML
    private Button botonCrearVendedor;

    @FXML
    private Button botonEliminarVender;

    @FXML
    private TextField campoApellido;

    @FXML
    private TextField campoCedula;

    @FXML
    private TextField campoCuenta;

    @FXML
    private TextField campoDireccion;

    @FXML
    private TextField campoNombre;
    @FXML
    private TextField campoContrasena;

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
    private Label labelApellido;

    @FXML
    private Label labelCedula;

    @FXML
    private Label labelCuenta;

    @FXML
    private Label labelDireccion;

    @FXML
    private Label labelNombre;

    @FXML
    private Tab tabAdministrador;

    @FXML
    private TableView<Vendedor> tblVendedores;


    @FXML
    void initialize(){
         modelFactoryController = ModelFactoryController.getInstance();
            controllerAdminView = new ControllerAdminView(modelFactoryController);
            inicialzarAdminView();

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
        tblVendedores.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {

            vendedorSeleccionado = newSelection;

            //mostrarInformacionEmpleado(empleadoSeleccionado);

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
            Vendedor vendedor = null;
            vendedor = controllerAdminView.crearVendedor(nombre, apellido, cedula, direccion, cuenta, contrasena);
            if(vendedor != null){
               listaVendedoresData.add(vendedor);
                mostrarMensaje("Notificación vendedor", "Vendedor creado", "El vendedor se ha creado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposVendedor();
            }else{
                mostrarMensaje("Notificación vendedor", "Vendedor no creado", "El vendedor con cedula " + cedula + " ya existe", Alert.AlertType.INFORMATION);
            }
        }else{
            mostrarMensaje("Notificación vendedor", "Vendedor no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }


    }
    private void eliminarVendedor(){
        boolean empleadoEliminado = false;


        if(vendedorSeleccionado != null){


            if(mostrarMensajeConfirmacion("¿Estas seguro de elmininar al empleado?") == true){

                empleadoEliminado = controllerAdminView.eliminarVendedor(vendedorSeleccionado.getCedula());


                if(empleadoEliminado == true){
                    listaVendedoresData.remove(vendedorSeleccionado);
                    vendedorSeleccionado = null;

                    tblVendedores.getSelectionModel().clearSelection();
                    limpiarCamposVendedor();

                    mostrarMensaje("Notificación empleado", "Empleado eliminado", "El empleado se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                }else{
                    mostrarMensaje("Notificación empleado", "Empleado no eliminado", "El empleado no se puede eliminar", Alert.AlertType.ERROR);
                }
            }
        }else{
            mostrarMensaje("Notificación empleado", "Empleado no seleccionado", "Seleccionado un empleado de la lista", Alert.AlertType.WARNING);
        }

    }

    private void limpiarCamposVendedor() {
        campoNombre.setText("");
        campoApellido.setText("");
        campoCedula.setText("");
        campoDireccion.setText("");
        campoCuenta.setText("");
        campoContrasena.setText("");
    }


    @FXML
    void crearVendedorAction(ActionEvent event) {
            CrearVendedor();
    }

    @FXML
    void actualizarVendedoronAction(ActionEvent event) {
       // actualizarVendedor();

    }
    @FXML
    void eliminarVendedoronAction(ActionEvent event) {
        eliminarVendedor();
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
