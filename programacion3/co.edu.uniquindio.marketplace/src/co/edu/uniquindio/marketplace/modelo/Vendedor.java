package modelo;
import servicios.IVendedorService;


import java.util.ArrayList;

public class Vendedor implements IVendedorService {

    private String direccion;
    ArrayList<Producto> listaProductos = new ArrayList();

    public Vendedor(String direccion, ArrayList<Producto> productos) {
        this.direccion = direccion;
        this.listaProductos = productos;
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
            } else {
                throw new Exception("Este producto" + producto.getNombre() + "ya se guardo");
            }

        }

    @Override
    public void eliminarProducto(Producto producto) {
        if (!listaProductos.isEmpty())
        listaProductos.remove(producto);
    }


    public void actualizarProducto(Producto productoSelected, Producto productoNuevo){
        productoSelected.setNombre(productoNuevo.getNombre());
        productoSelected.setImagen(productoNuevo.getImagen());
        productoSelected.setCategoria(productoNuevo.getCategoria());
        productoSelected.setPrecio(productoNuevo.getPrecio());
        productoSelected.setEstado(productoNuevo.getEstado());
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Producto> getProductos() {
        return listaProductos;
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
