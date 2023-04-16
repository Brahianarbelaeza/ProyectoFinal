package controlador;

import excepciones.AdministradorException;
import modelo.Administrador;
import modelo.Cuenta;
import modelo.Marketplace;
import modelo.Vendedor;
import persistencia.Persistencia;

import java.util.ArrayList;

public class ModelFactoryController {
    Marketplace marketplace;



    private static class SingletonHolder {
        private final static ModelFactoryController INSTANCE = new ModelFactoryController();
    }
    public static ModelFactoryController getInstance() {
        return SingletonHolder.INSTANCE;
    }
    private ModelFactoryController() {
        System.out.println("invoca clase singleton");
        if(marketplace == null){
            inicializarDatos();
          //  guardarResourceXML();
        }

        registrarAccionesSistema("Inicio de sesión del usuario Admin", 1, "inicioSesión");
    }
    private void inicializarDatos() {
        marketplace = new Marketplace();
        Administrador admin = crearAdministrador("Brahian", "bar@", "123", "admin", "123");
        marketplace.setAdministrador(admin);
        Vendedor vendedor = new Vendedor("aleja", "Guzman", "123", new Cuenta("aleja@gmail.com", "123"), "calle 2") ;
        admin.getVendedores().add(vendedor);


    }
    public void registrarAccionesSistema(String mensaje, int nivel, String accion) {
        Persistencia.guardaRegistroLog(mensaje, nivel, accion);
    }

    public Marketplace getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    public Administrador crearAdministrador(String nombre, String email, String password, String nombreUsuario, String contrasena) {
        Administrador admin = new Administrador(nombre, email, password, new Cuenta(nombreUsuario, contrasena));
//        marketplace.setAdministrador(admin);
//        if (marketplace.getAdministrador() == null) {
//            throw new AdministradorException("No se pudo crear el administrador");
//        }
        return admin;
    }
    public Vendedor crearVendedor(Vendedor vendedor) {

        try {
            vendedor= marketplace.getAdministrador().crearVendedor(vendedor);
            if (vendedor !=  null) {
                registrarAccionesSistema("Vendedor creado con cedula " + vendedor.getCedula(), 1, "Crear vendedor");
            }
        } catch (AdministradorException e) {
            throw new RuntimeException("Error al crear al vendedor"+e);
        }
        return vendedor;
    }

        //Es la misma logica de crear solo que se le envía la cc anterior
    public Vendedor actualizarVendedor(Vendedor vendedor, String cedulaAnterior) {
        marketplace.getAdministrador().actualizarVendedor(vendedor,cedulaAnterior);
        registrarAccionesSistema("Vendedor actualizado con cedula "+vendedor.getCedula(),1 , "Actualizar vendedor");
        return vendedor;
    }

    public boolean eliminarVendedor (String cedula) {
        Vendedor vendedor = marketplace.getAdministrador().buscarVendedor(cedula);
        try {
            marketplace.getAdministrador().eliminarVendedor(vendedor);
            return true;
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar al vendedor"+e);
        }

    }

    public ArrayList<Vendedor> obtenerVendedores() {
        return getMarketplace().getAdministrador().getVendedores();
    }
}