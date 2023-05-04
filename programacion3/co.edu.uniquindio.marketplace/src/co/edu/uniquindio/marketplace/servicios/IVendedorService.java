package servicios;

import modelo.Producto;
import modelo.Solitud;

public interface IVendedorService {
    public Producto crearProducto(Producto producto) throws Exception;
    public void eliminarProducto(Producto producto);
    public void actualizarProducto(Producto productoSelected, String id);
    public void agregarVendedorAliado(Solitud solitud);
}
