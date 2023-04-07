package modelo;
import servicios.IVendedorService;


import java.util.ArrayList;

public class Vendedor extends Persona implements IVendedorService {


    private String direccion;
    ArrayList<Producto> listaProductos;
    ArrayList<Solitud> vendedoresAliados;

    public Vendedor(String nombre, String apellidos, String cedula, Cuenta usuario, String direccion) {
        super(nombre, apellidos, cedula, usuario);
        this.direccion = direccion;
        this.listaProductos = new ArrayList<Producto>();
        this.vendedoresAliados = new ArrayList<Solitud>();

    }



    public void crearProducto (Producto producto) throws Exception{
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
                throw new Exception("Este producto" + producto.getNombre() + "ya se guardo");
            }

        }

    @Override
    public void eliminarProducto(Producto producto) {

        if (!listaProductos.isEmpty()) listaProductos.remove(producto);
        else System.out.println("No hay productos para eliminar, aun no has publicado productos");

    }
    public void actualizarProducto(Producto productoSelected, Producto productoNuevo){
       listaProductos.remove(productoSelected);
         listaProductos.add(productoNuevo);
    }

    public void agregarVendedorAliado(Solitud solicitud) {

        //metodo para verificar que no se repita la solicitud
        if (!vendedoresAliados.contains(solicitud)) {
            vendedoresAliados.add(solicitud);
            System.out.println("Solicitud de amistad enviada");

        } else {
            System.out.println("Ya se ha enviado una solicitud de amistad a este usuario");
        }
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

    public void setVendedoresAliados(ArrayList<Solitud> vendedoresAliados) {
        this.vendedoresAliados = vendedoresAliados;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public ArrayList<Solitud> getVendedoresAliados() {
        return vendedoresAliados;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.listaProductos = productos;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "listaProductos=" + listaProductos +
                '}';
    }
}