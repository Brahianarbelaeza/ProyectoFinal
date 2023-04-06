package servicios;

import modelo.Producto;

public interface IVendedorService {
    public void crearProducto(Producto producto) throws Exception;
    public void eliminarProducto(Producto producto);
    public void actualizarProducto(Producto productoSelected, Producto productoNuevo);
}
