package servicios;

import modelo.Producto;
import modelo.Solitud;
import modelo.Vendedor;

public interface IVendedorService {
    public void crearProducto(Producto producto) throws Exception;
    public void eliminarProducto(Producto producto);
    public void actualizarProducto(Producto productoSelected, Producto productoNuevo);
    public void agregarVendedorAliado(Solitud solitud);
}
