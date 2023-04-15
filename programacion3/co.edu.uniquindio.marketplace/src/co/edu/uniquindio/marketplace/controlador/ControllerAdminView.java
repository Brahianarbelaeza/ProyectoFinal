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



    public Vendedor crearVendedor(String nombre, String apellido, String cedula, String direccion, String cuenta, String contrasena)  {
        Cuenta cuentaV = new Cuenta(cuenta, contrasena);
        Vendedor vendedor = new Vendedor(nombre, apellido, cedula, cuentaV, direccion);
        return modelFactoryController.crearVendedor(vendedor);
    }

    public ArrayList<Vendedor> obtenerVendedores() {
        return modelFactoryController.obtenerVendedores();
    }
}
