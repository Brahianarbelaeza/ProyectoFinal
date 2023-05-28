package controlador;

import excepciones.AdministradorException;
import excepciones.CrudProductoException;
import modelo.*;
import persistencia.Persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ModelFactoryController {
    Marketplace marketplace;
    int sesion;


    private static class SingletonHolder {
        private final static ModelFactoryController INSTANCE = new ModelFactoryController();
    }
    public static ModelFactoryController getInstance() {
        return SingletonHolder.INSTANCE;
    }
    public ModelFactoryController() {
        System.out.println("invoca clase singleton");
        //inicializarSalvarDatos();

        //2. Cargar los datos de los archivos
        //cargarDatosDesdeArchivos();


        //3. Guardar y Cargar el recurso serializable binario
        //guardarResourceBinario();
        //cargarResourceBinario();


        //4. Guardar y Cargar el recurso serializable XML
        //guardarResourceXML();
        cargarResourceXML();
        if(marketplace == null){
            respaldoXML();
            //inicializarDatos();
            guardarResourceXML();
        }

    }
    // Validar que el usuario y la contraseña sean correctos.
    public int iniciarSesion(String usuario, String contrasena) {
        if (marketplace.getAdministrador().getCuenta().getUsuario().equals(usuario) && marketplace.getAdministrador().getCuenta().getContrasena().equals(contrasena)) {
            registrarAccionesSistema("Inicio de sesión del usuario Admin", 1, "inicioSesión");
            sesion = 0;
            return sesion;
        } else {
            for (Vendedor vendedor : marketplace.getAdministrador().getVendedores()) {
                if (vendedor.getCuenta().getUsuario().equals(usuario) && vendedor.getCuenta().getContrasena().equals(contrasena)) {
                    registrarAccionesSistema("Inicio de sesión del usuario Vendedor " + vendedor.getNombre(), 1, "inicioSesión");
                    sesion = marketplace.getAdministrador().getVendedores().indexOf(vendedor) + 1;
                    return sesion;
                }
            }

            }
        return -1;
    }


    private void inicializarSalvarDatos(){
        inicializarDatos();

        try {
            Persistencia.guardarVendedores(getMarketplace().getAdministrador().getVendedores());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // cambiar el nombre de este metodo
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
    public Administrador crearAdministrador(String nombre, String apellidos, String cedula, String nombreUsuario, String contrasena) {
        Administrador admin = new Administrador(nombre, apellidos, cedula, new Cuenta(nombreUsuario, contrasena));

        return admin;
    }
    public Vendedor crearVendedor(Vendedor vendedor) {

        try {
            vendedor= marketplace.getAdministrador().crearVendedor(vendedor);
            if (vendedor !=  null) {
                registrarAccionesSistema("Vendedor creado con cedula " + vendedor.getCedula(), 1, "Crear vendedor");
                Persistencia.guardarVendedores(marketplace.getAdministrador().getVendedores());
                guardarResourceXML();
                respaldoXML();
            }
        } catch (AdministradorException e) {
            throw new RuntimeException("Error al crear al vendedor"+e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return vendedor;
    }

    //Es la misma logica de crear solo que se le envía la cc anterior
    public Vendedor actualizarVendedor(Vendedor vendedor, String cedulaAnterior) {

        marketplace.getAdministrador().actualizarVendedor(vendedor,cedulaAnterior);
        guardarResourceXML();
        registrarAccionesSistema("Vendedor actualizado con cedula "+vendedor.getCedula(),1 , "Actualizar vendedor");
        try {
            Persistencia.guardarVendedores(marketplace.getAdministrador().getVendedores());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return vendedor;
    }
    public boolean eliminarVendedor (String cedula) {
        Vendedor vendedor = marketplace.getAdministrador().buscarVendedor(cedula);
        registrarAccionesSistema("Vendedor eliminado con cedula "+vendedor.getCedula(),2, "Eliminar vendedor");
        try {
            marketplace.getAdministrador().eliminarVendedor(vendedor);
            guardarResourceXML();
            Persistencia.guardarVendedores(marketplace.getAdministrador().getVendedores());
            respaldoXML();
            return true;
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar al vendedor"+e);
        }
    }

    public Producto publicarProducto(Producto producto) {

        try {
            producto= ObtenerVendedor().crearProducto(producto);
            if (producto !=  null) {
                registrarAccionesSistema("El vendedor" + ObtenerVendedor().getNombre() + "producto creado con codigo " + producto.getCodigo(), 1, "Crear producto");
                guardarResourceXML();
                respaldoXML();
            }
        } catch (CrudProductoException e) {
            throw new RuntimeException("Error al crear el producto"+e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return producto;
    }

    //Es la misma logica de crear solo que se le envía la cc anterior
    public Producto actualizarProducto(Producto producto, String idAnterior) {
        ObtenerVendedor().actualizarProducto(producto,idAnterior);
        guardarResourceXML();
        registrarAccionesSistema("Producto actualizado con cedula "+producto.getCodigo(),1 , "Actualizar vendedor");
        return producto;
    }

    public boolean eliminarProducto (String codigo) {
        Producto producto = ObtenerVendedor().buscarProducto(codigo);
        registrarAccionesSistema("Producto eliminado con codigo " + producto.getCodigo(), 2, "Eliminar producto");
        try {
            ObtenerVendedor().eliminarProducto(producto);
            guardarResourceXML();
            return true;
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar al vendedor" + e);
        }
    }

    public ArrayList<Vendedor> llenarTablaSugerencias() {
        ArrayList<Vendedor> vendedoresSugeridos = new ArrayList<>();
        ArrayList<Vendedor> vendedores = obtenerVendedores();

        if (vendedores.size() == 0) {
            return vendedoresSugeridos;
        }

        for (int i = 0; i < vendedores.size(); i++) {
            int sugerenciaAleatoria = (int) (Math.random() * vendedores.size());
            vendedoresSugeridos.add(vendedores.get(sugerenciaAleatoria));
        }

        return vendedoresSugeridos;
    }


    public ArrayList<Solicitud> llenarTablaSolicitudesDeAmistad(){
        Vendedor receptor = ObtenerVendedor();
        Vendedor emisor = ObtenerVendedor();
        Solicitud solicitudRecibida = new Solicitud(emisor, receptor, Solicitud.EstadoSolicitud.RECIBIDA);

        receptor.getSolicitudesRecibidas().add(solicitudRecibida);
        return receptor.getSolicitudesRecibidas();
    }









    public ArrayList<Vendedor> obtenerVendedores() {
        return getMarketplace().getAdministrador().getVendedores();
    }

    public int getSesion() {
        return sesion;
    }

    public void setSesion(int sesion) {
        this.sesion = sesion;
    }

    public ArrayList<Producto> obtenerProductos() {


        return ObtenerVendedor().getListaProductos();
    }
    public Vendedor ObtenerVendedor (){
        for (Vendedor v: marketplace.getAdministrador().getVendedores()) {
            if (sesion-1 == marketplace.getAdministrador().getVendedores().indexOf(v) ){
                return v;
            }
        }
        return null;
    }
}