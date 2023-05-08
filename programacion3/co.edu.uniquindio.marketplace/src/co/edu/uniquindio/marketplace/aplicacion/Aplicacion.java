package aplicacion;

import controlador.ControladorMarketplaceView;
import controlador.ControllerLoginView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Aplicacion extends Application {
    private Stage primaryStage;


    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage)  throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("MarketPlace");
        mostrarVentanaInicio();
    }

    private void mostrarVentanaInicio(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Aplicacion.class.getResource("../vista/LoginView.fxml"));
            AnchorPane pane = loader.load();
            ControllerLoginView loginController = loader.getController();
            loginController.setAplicacion(this);
            Scene scene = new Scene(pane);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

   /* public void mostrarVentanaProductos(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Aplicacion.class.getResource("../vista/VendedorView.fxml"));
            Pane pane = loader.load();
            ControllerVendedorView vendedorController = loader.getController();
            vendedorController.setAplicacion(this);
            Scene scene = new Scene(pane);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/

    public void mostrarVentanaPrincipal() {
        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Aplicacion.class.getResource("../vista/MarketPlaceView.fxml"));
            AnchorPane pane = loader.load();
            ControladorMarketplaceView controladorMarketplaceView = loader.getController();

            controladorMarketplaceView.setAplicacion(this);

            // Show the scene containing the root layout.
            Scene scene = new Scene(pane);
            //scene.getStylesheets().add(getClass().getResource("estilos.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

