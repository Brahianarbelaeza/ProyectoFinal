package aplicacion;
import java.io.IOException;

import controlador.ControladorMarketplaceView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Aplicacion extends Application {
    private Stage primaryStage;


    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage)  throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("MarketPlace");
        mostrarVentanaPrincipal();
    }

    private void mostrarVentanaPrincipal() {
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

