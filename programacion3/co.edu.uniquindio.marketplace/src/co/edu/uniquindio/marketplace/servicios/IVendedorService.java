package servicios;

import excepciones.VendedorException;
import modelo.Producto;


import modelo.Vendedor;

public interface IVendedorService {
    public Producto crearProducto(Producto producto) throws Exception;
    public void eliminarProducto(Producto producto) throws VendedorException;
    public void actualizarProducto(Producto productoSelected, String id);
    public Producto buscarProducto(String id);
    public void eliminarVendedorAliado(Vendedor vendedor);

}
