package modelo;

import java.io.Serializable;


public abstract class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellido;
    private String cedula;
    private Cuenta cuenta;

    private String cuentaDescripcion;
    private String cuentaContrasena;
    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula, Cuenta cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.cuenta = cuenta;
        this.cuentaDescripcion =  cuenta.getUsuario();
        this.cuentaContrasena = cuenta.getContrasena();
    }

    public String getCuentaContrasena() {
        return cuentaContrasena;
    }

    public void setCuentaContrasena(String cuentaContrasena) {
        this.cuentaContrasena = cuentaContrasena;
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

    public String getCuentaDescripcion() {
        return cuentaDescripcion;
    }

    public void setCuentaDescripcion(String cuentaDescripcion) {
        this.cuentaDescripcion = cuentaDescripcion;
    }
}
