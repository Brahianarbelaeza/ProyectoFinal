package modelo;

import excepciones.AdministradorException;
import servicios.IAdministradorService;

import java.io.Serializable;
import java.util.ArrayList;

public class Administrador extends Persona implements IAdministradorService, Serializable {

    //Instancia unica de la clase
    /*private static final Administrador instanciaAdmin= new Administrador("Brahiam","Arbelaez","1234",new Cuenta("brahiana","1234")); //Quemé los datos  pero luego se le pone persistencia y se evalua si eso si se puede hacer usando un singleton*/
    private ArrayList<Vendedor> vendedores;
    private static final long serialVersionUID = 1L;
    public Administrador() {
    }


    public Administrador(String nombre, String apellidos, String cedula, Cuenta cuenta) {
        super(nombre, apellidos, cedula, cuenta);
        vendedores = new ArrayList<>();
        this.vendedores= vendedores;
    }


    public Vendedor crearVendedor(Vendedor vendedor) throws AdministradorException{
        if (compararCedula(vendedor)== false ) {

            if (vendedores.contains(vendedor)) {
                throw new AdministradorException(" El vendedor " + vendedor + " ya existe en la lista ");
            } else {
                vendedores.add(vendedor);
                System.out.println("Vendedor añadido correctamente  ");
                return vendedor;
            }
        }else {
            vendedor = null;
        }
     return vendedor;
    }

    private boolean compararCedula(Vendedor vendedor) {
        for (Vendedor vendedor1 : vendedores) {
            if (vendedor.getCedula().equals(vendedor1.getCedula())) {
                 return true;
            }
        }
        return false;
    }


    //Verifico que la lista de vendedores no este vacia antes de eliminar un vendedor
    public void eliminarVendedor(Vendedor vendedor) throws Exception {

        if(!vendedores.isEmpty()){
            vendedores.remove(vendedor);
        }

        else {
            throw  new AdministradorException ("La lista se encuentra vacia");
        }
    }

    //Como parametro ingreso el vendedor con los datos antiguos y el vendedor con los datos nuevos y editamos al antiguo
    // con los datos del nuevo
    /*public  void actualizarVendedor(Vendedor vendedorSeleccionado,  Vendedor vendedorNuevo){

        vendedorSeleccionado.setNombre(vendedorNuevo.getNombre());
        vendedorSeleccionado.setApellido(vendedorNuevo.getApellido());
        vendedorSeleccionado.setCedula(vendedorNuevo.getCedula());
        vendedorSeleccionado.setCuenta(vendedorNuevo.getCuenta());
        vendedorSeleccionado.setDireccion(vendedorNuevo.getDireccion());
        vendedorSeleccionado.setProductos(vendedorNuevo.getListaProductos());
    }*/

        //Con la cedula anterior que se busca en el arraylist se compara con la que se esta seleccionando
    // y si es igual cambio todos los datos
    public  void actualizarVendedor(Vendedor vendedor,String cedulaAnterior){
        for (int i = 0; i < vendedores.size(); i++) {
            Vendedor vendedor1 = vendedores.get(i);
            if(vendedor1.getCedula().equals(cedulaAnterior)){
                vendedores.set(i, vendedor);
            }
        }
    }

    public void obtenerVendedor(Vendedor vendedor){

    }



    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public Vendedor buscarVendedor(String cedula) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getCedula().equals(cedula)) {
                return vendedor;
            }
        }
        return null;
    }
}
