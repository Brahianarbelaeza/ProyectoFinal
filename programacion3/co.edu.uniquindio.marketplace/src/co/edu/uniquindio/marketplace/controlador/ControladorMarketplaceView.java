package controlador;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ControladorMarketplaceView {

    @FXML
    private TableColumn<?, ?> colApellido;

    @FXML
    private TableColumn<?, ?> colCedula;

    @FXML
    private TableColumn<?, ?> colCuenta;

    @FXML
    private TableColumn<?, ?> colNombre;

    @FXML
    private TableColumn<?, ?> colPublicacionesVendedor;

    @FXML
    private TableView<?> tblVendedores;

}
