package servicios;

import excepciones.AdministradorException;
import modelo.Producto;
import modelo.Vendedor;

public interface IAdministradorService {

    public Vendedor crearVendedor(Vendedor vendedor) throws AdministradorException;
    public void eliminarVendedor(Vendedor vendedor) throws AdministradorException;
    public void actualizarVendedor(Vendedor vendedor, String idAnterior);
    public Vendedor buscarVendedor(String cedula);
    public boolean compararCedula(Vendedor vendedor);






}
