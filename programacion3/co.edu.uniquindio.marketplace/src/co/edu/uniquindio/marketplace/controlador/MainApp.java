package controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.Administrador;
import modelo.Marketplace;

import java.io.IOException;

import static controlador.AppController.INSTANCE;

public class MainApp extends Application {

    Administrador administrador = INSTANCE.getModel();
    private Marketplace marketplace;


    @Override
    public void start(Stage stage) throws IOException {
        marketplace = new Marketplace(administrador);
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("MarketplaceView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();

    }

}
