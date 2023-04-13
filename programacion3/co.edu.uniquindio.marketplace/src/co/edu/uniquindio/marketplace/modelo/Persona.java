package modelo;

public class Persona {

    private String nombre;
    private String apellido;
    private String cedula;
    private Cuenta cuenta;

    public Persona(String nombre, String apellido, String cedula, Cuenta cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.cuenta = cuenta;
    }

    public void agregarContactos(){

    }

    public void actualizarContactos(){

    }

    public void eliminarContactos(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
