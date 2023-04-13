package controlador;

import excepciones.VendedorException;
import modelo.Cuenta;
import modelo.Marketplace;
import modelo.Vendedor;

import java.util.ArrayList;


public class ControllerAdminView {
    ModelFactoryController modelFactoryController;
    Marketplace marketplace;

    public ControllerAdminView(ModelFactoryController modelFactoryController) {
        this.modelFactoryController = modelFactoryController;
        marketplace = modelFactoryController.getMarketplace();
    }



    public Vendedor crearVendedor(String nombre, String apellido, String cedula, String direccion, String cuenta, String contrasena) throws VendedorException {
        Vendedor vendedor = null;
        vendedor.setNombre(nombre);
        vendedor.setApellido(apellido);
        vendedor.setCedula(cedula);
        vendedor.setDireccion(direccion);
        vendedor.setCuenta(new Cuenta(cuenta, contrasena));
        return modelFactoryController.crearVendedor(vendedor);
    }

    public ArrayList<Vendedor> obtenerVendedores() {
        return modelFactoryController.obtenerVendedores();
    }
}
