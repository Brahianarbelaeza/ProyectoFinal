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

    public ArrayList<Vendedor> obtenerVendedores() {
        return modelFactoryController.obtenerVendedores();
    }

    public void setAplicacion(Aplicacion aplicacion) {
    }
}
