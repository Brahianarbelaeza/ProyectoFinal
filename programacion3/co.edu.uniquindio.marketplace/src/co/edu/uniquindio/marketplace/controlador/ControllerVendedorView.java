package controlador;

import aplicacion.Aplicacion;
import javafx.fxml.FXML;
import modelo.Estado;
import modelo.Marketplace;
import modelo.Producto;

import java.util.ArrayList;

public class ControllerVendedorView {

    Aplicacion aplicacion;
    ModelFactoryController modelFactoryController;
    Marketplace marketplace;


    public ControllerVendedorView(ModelFactoryController modelFactoryController) {
        this.modelFactoryController = modelFactoryController;
        marketplace = modelFactoryController.getMarketplace();
    }

    @FXML
    void initialize () {
        modelFactoryController = ModelFactoryController.getInstance();
    }
    public boolean eliminarProducto(String codigo) {
        return modelFactoryController.eliminarProducto(codigo);

    }


    public Producto publicarProducto(String codigo, String nombreProducto, String rutaImagen, String categoria, double precio, Estado estado)  {

        Producto producto = new Producto(codigo,nombreProducto,rutaImagen,categoria,precio,estado);
        return modelFactoryController.publicarProducto(producto);
    }

    public Producto actualizarProducto (String codigo, String nombreProducto, String rutaImagen, String categoria,  double precio, Estado estado, String idAnterior)   {

        Producto producto = new Producto(codigo,nombreProducto,rutaImagen,categoria,precio,estado);

        return modelFactoryController.actualizarProducto(producto, idAnterior);
    }
    public ArrayList<Producto> obtenerProductos() {
        return modelFactoryController.obtenerProductos();
    }

}
