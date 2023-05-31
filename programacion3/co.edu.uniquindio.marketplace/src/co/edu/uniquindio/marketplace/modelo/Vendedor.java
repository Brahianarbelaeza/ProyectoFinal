package modelo;

import excepciones.ConfirmarSolicitudException;
import excepciones.EnviarSolicitudException;
import excepciones.VendedorException;
import servicios.IVendedorService;

import java.io.Serializable;
import java.util.ArrayList;

public class Vendedor extends Persona implements IVendedorService, Serializable {

    private static final long serialVersionUID = 1L;
    private String direccion;
    ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    ArrayList<Vendedor> vendedoresAliados;
    ArrayList<Vendedor> solicitudesRecibidas;
    ArrayList<Vendedor> sugerenciasVendedores;

    public Vendedor() {
    }

    public Vendedor(String nombre, String apellidos, String cedula, Cuenta cuenta, String direccion) {
        super(nombre, apellidos, cedula, cuenta);
        this.direccion = direccion;
        this.listaProductos = new ArrayList<Producto>();
        this.vendedoresAliados = new ArrayList<Vendedor>();
        this.solicitudesRecibidas = new ArrayList<Vendedor>();
        this.sugerenciasVendedores = new ArrayList<Vendedor>();
        
    }
    public Producto crearProducto (Producto producto) throws Exception{
        boolean flag = false;
            for (int i = 0; i < listaProductos.size(); i++) {
                if (producto.compararProducto(listaProductos.get(i))) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                listaProductos.add(producto);
                producto.setEstado(Estado.PUBLICADO);
            } else {
                throw new VendedorException("Este producto" + producto.getNombre() + "ya se guardo");
            }
            return producto;

        }

    @Override
    public void eliminarProducto(Producto producto) throws VendedorException {

        if (!listaProductos.isEmpty()) {
            listaProductos.remove(producto);
        }else {
            throw new VendedorException("No hay productos para eliminar");
        }

    }

    public void actualizarProducto(Producto producto, String idAnterior){
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto producto1 = listaProductos.get(i);
            if(producto1.getCodigo().equals(idAnterior)){
                listaProductos.set(i, producto);
            }
        }


    }


    public Producto buscarProducto(String codigo) {
        for (Producto producto:listaProductos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public void eliminarVendedorAliado(Vendedor vendedor) {

        vendedoresAliados.remove(vendedor);

    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void setVendedoresAliados(ArrayList<Vendedor> vendedoresAliados) {
        this.vendedoresAliados = vendedoresAliados;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public ArrayList<Vendedor> getVendedoresAliados() {
        return vendedoresAliados;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.listaProductos = productos;
    }

    public ArrayList<Vendedor> getSugerenciasVendedores() {
        return sugerenciasVendedores;
    }

    public void setSugerenciasVendedores(ArrayList<Vendedor> sugerenciasVendedores) {
        this.sugerenciasVendedores = sugerenciasVendedores;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "listaProductos=" + listaProductos +
                '}';
    }


    public ArrayList<Vendedor> getSolicitudesRecibidas() {
        return solicitudesRecibidas;
    }

    public void setSolicitudesRecibidas(ArrayList<Vendedor> solicitudesRecibidas) {
        this.solicitudesRecibidas = solicitudesRecibidas;
    }


    public void agregarSolicitudAmistad(Vendedor emisor) throws EnviarSolicitudException {
        if (!solicitudesRecibidas.contains(emisor)) {
            solicitudesRecibidas.add(emisor);
            System.out.println("Solicitud de amistad enviada");
        } else {
            throw new EnviarSolicitudException("Ya se ha enviado una solicitud de amistad a este usuario");
        }

    }

    public void confirmarSolicitudAmistad(Vendedor vendedor) throws ConfirmarSolicitudException {
        if(!vendedoresAliados.contains(vendedor)){
            vendedoresAliados.add(vendedor);
            solicitudesRecibidas.remove(vendedor);
            System.out.println("Solicitud de amistad confirmada");
        }else{
            throw new ConfirmarSolicitudException("Ya se ha confirmado la solicitud de amistad de este usuario.");
        }
    }
}