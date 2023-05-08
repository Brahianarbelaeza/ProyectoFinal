package controlador;

import aplicacion.Aplicacion;
import modelo.*;

import java.util.ArrayList;


public class ControllerAdminView {

    Aplicacion aplicacion;
    ModelFactoryController modelFactoryController;
    Marketplace marketplace;

    public ControllerAdminView(ModelFactoryController modelFactoryController) {
        this.modelFactoryController = modelFactoryController;
        marketplace = modelFactoryController.getMarketplace();
    }

    public boolean eliminarVendedor(String cedula) {
        return modelFactoryController.eliminarVendedor(cedula);

    }




    public Vendedor crearVendedor(String nombre, String apellido, String cedula, String direccion, String cuenta, String contrasena)  {
        Cuenta cuentaV = new Cuenta(cuenta, contrasena);
        Vendedor vendedor = new Vendedor(nombre, apellido, cedula, cuentaV, direccion);
        return modelFactoryController.crearVendedor(vendedor);
    }

    public Vendedor actualizarVendedor(String nombre, String apellido, String cedula, String direccion, String cuenta, String contrasena, String cedulaAnterior)  {
        Cuenta cuentaV = new Cuenta(cuenta, contrasena);
        Vendedor vendedor = new Vendedor(nombre, apellido, cedula, cuentaV, direccion);
        return modelFactoryController.actualizarVendedor(vendedor, cedulaAnterior); //Se busca el vendedor con la cedula anterior
    }

    public boolean eliminarProducto(String codigo) {
        return modelFactoryController.eliminarProducto(codigo);

    }


    public Producto publicarProducto(String codigo, String nombreProducto, String rutaImagen, String categoria,  double precio, Estado estado)  {

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

    public ArrayList<Vendedor> obtenerVendedores() {
        return modelFactoryController.obtenerVendedores();
    }

    public void setAplicacion(Aplicacion aplicacion) {
    }
}
