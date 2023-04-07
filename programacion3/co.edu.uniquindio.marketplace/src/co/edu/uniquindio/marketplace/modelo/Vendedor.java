package modelo;
import excepciones.VendedorException;
import servicios.IVendedorService;


import java.util.ArrayList;

public class Vendedor extends Persona implements IVendedorService {

    private String direccion;
    ArrayList<Producto> listaProductos;
    ArrayList<Vendedor> vendedoresAliados;

    public Vendedor(String nombre, String apellidos, String cedula, Cuenta cuenta, String direccion) {
        super(nombre, apellidos, cedula, cuenta);
        this.direccion = direccion;
        this.listaProductos = new ArrayList<Producto>();

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
        if (!listaProductos.isEmpty())
        listaProductos.remove(producto);
        else {
           System.out.println("No hay productos para eliminar, aun no has publicado productos");
        }
    }


    public void actualizarProducto(Producto productoSelected, Producto productoNuevo){
        productoSelected.setNombre(productoNuevo.getNombre());
        productoSelected.setImagen(productoNuevo.getImagen());
        productoSelected.setCategoria(productoNuevo.getCategoria());
        productoSelected.setPrecio(productoNuevo.getPrecio());
        productoSelected.setEstado(productoNuevo.getEstado());
    }

    public void agregarVendedorAliado(Vendedor vendedor) {

        Solitud solicitud = new Solitud(vendedor.getCuenta().getUsuario(), false);
        if (solicitud.getEstado()== true) {
            if (vendedoresAliados == null) {
                vendedoresAliados = new ArrayList<>();
            }
            //metodo para verificar que no se repita el vendedor
            if (!vendedoresAliados.contains(vendedor)) {
                vendedoresAliados.add(vendedor);
                System.out.println("Vendedor agregado");
            } else {
                System.out.println("El vendedor ya se encuentra en la lista");
            }
        } else {
            System.out.println("El vendedor no acepto la solicitud");
        }
    }
    public void eliminarVendedorAliado(Vendedor vendedor) {
        if (vendedoresAliados != null) {
            vendedoresAliados.remove(vendedor);
        }
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

    @Override
    public String toString() {
        return "Vendedor{" +
                "listaProductos=" + listaProductos +
                '}';
    }
}