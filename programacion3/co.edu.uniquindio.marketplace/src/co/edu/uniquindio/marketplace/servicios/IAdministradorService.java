package servicios;

import modelo.Producto;
import modelo.Vendedor;

public interface IAdministradorService {

    public void crearVendedor(Vendedor vendedor) throws Exception;
    public void eliminarProducto(Vendedor vendedor) throws Exception;
    public void actualizarProducto(Vendedor vendedorSeleccionado, Vendedor vendedorNuevo);



}
