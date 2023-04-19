package controlador;

import excepciones.AdministradorException;
import modelo.Administrador;
import modelo.Cuenta;
import modelo.Marketplace;
import modelo.Vendedor;
import persistencia.Persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ModelFactoryController {
    Marketplace marketplace;



    private static class SingletonHolder {
        private final static ModelFactoryController INSTANCE = new ModelFactoryController();
    }
    public static ModelFactoryController getInstance() {
        return SingletonHolder.INSTANCE;
    }
    public ModelFactoryController() {
        System.out.println("invoca clase singleton");
       // inicializarSalvarDatos();

        //2. Cargar los datos de los archivos
       // cargarDatosDesdeArchivos();


        //3. Guardar y Cargar el recurso serializable binario
       // guardarResourceBinario();
        // cargarResourceBinario();


        //4. Guardar y Cargar el recurso serializable XML
		//guardarResourceXML();
		cargarResourceXML();
        if(marketplace == null){
            respaldoXML();
            inicializarDatos();
            guardarResourceXML();
        }

        registrarAccionesSistema("Inicio de sesión del usuario Admin", 1, "inicioSesión");
    }


    private void inicializarSalvarDatos(){
        inicializarDatos();

        try {
            Persistencia.guardarVendedores(getMarketplace().getAdministrador().getVendedores());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void cargarDatosDesdeArchivos() {
            this.marketplace=new Marketplace();
            Administrador admin = crearAdministrador("Brahian", "bar@", "123", "admin", "123");
            marketplace.setAdministrador(admin);

            try {
                ArrayList<Vendedor> vendedores =new ArrayList<Vendedor>();
                vendedores = Persistencia.cargarVendedores();
                getMarketplace().getAdministrador().getVendedores().addAll(vendedores);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    private void respaldoXML(){
        try {
            Persistencia.respaldo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarResourceXML() {
        marketplace = Persistencia.cargarRecursoMarketplaceXML();
    }

    private void guardarResourceXML() {Persistencia.guardarRecursoMarketplaceXML(marketplace);
    }

    private void cargarResourceBinario() {
        marketplace = Persistencia.cargarRecursoBancoBinario();
    }

    private void guardarResourceBinario() {
        Persistencia.guardarRecursoMarketplaceBinario(marketplace);
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
                guardarResourceXML();
                respaldoXML();
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
        registrarAccionesSistema("Vendedor eliminado con cedula "+vendedor.getCedula(),2, "Eliminar vendedor");
        try {
            marketplace.getAdministrador().eliminarVendedor(vendedor);
            guardarResourceXML();
            return true;
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar al vendedor"+e);
        }

    }
    public void actualizarVendedor(Vendedor vendedorSeleccionado, Vendedor vendedorNuevo){
        marketplace.getAdministrador().actualizarVendedor(vendedorSeleccionado, vendedorNuevo);
    }
    public ArrayList<Vendedor> obtenerVendedores() {
        return getMarketplace().getAdministrador().getVendedores();
    }
}