package modelo;

import excepciones.AdministradorException;

import java.util.ArrayList;

public class Administrador extends Persona {

    //Instancia unica de la clase
    private static final Administrador instanciaAdmin= new Administrador("Brahiam","Arbelaez","1234",new Cuenta("brahiana","1234"),new ArrayList<>()); //Quemé los datos  pero luego se le pone persistencia y se evalua si eso si se puede hacer usando un singleton
    private ArrayList<Vendedor> vendedores = new ArrayList<>();


    private Administrador(String nombre, String apellidos, String cedula, Cuenta cuenta, ArrayList<Vendedor> vendedores) {
        super(nombre, apellidos, cedula, cuenta);
        this.vendedores= vendedores;
    }


    //private Administrador(){}
    public  static Administrador obtenerUnicaInstancia(){
        return instanciaAdmin;
    }


    //Verifico que el vendedor no exita dentro de laq lista antes de crearlo
    public void crearVendedor(Vendedor vendedor) throws Exception{

            if (vendedores.contains(vendedor)) {
                throw new AdministradorException(" El vendedor " + vendedor+ " ya existe en la lista ");
            }
            else {
                vendedores.add(vendedor);
                    System.out.println("Vendedor añadido correctamente  ");
            }
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
    public  void actualizarVendedor(Vendedor vendedorSeleccionado,  Vendedor vendedorNuevo){

        vendedorSeleccionado.setNombre(vendedorNuevo.getNombre());
        vendedorSeleccionado.setApellidos(vendedorNuevo.getApellidos());
        vendedorSeleccionado.setCedula(vendedorNuevo.getCedula());
        vendedorSeleccionado.setCuenta(vendedorNuevo.getCuenta());
        vendedorSeleccionado.setDireccion(vendedorNuevo.getDireccion());
        vendedorSeleccionado.setProductos(vendedorNuevo.getListaProductos());
    }



    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
}
