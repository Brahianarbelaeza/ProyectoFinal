package modelo;

import java.io.Serializable;

public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    private String usuario;
    private String contrasena;
    public Cuenta() {
    }

    public Cuenta (String usuario, String contrasena) {

        this.usuario=usuario;
        this.contrasena=contrasena;

    }
    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(String usuario){
        this.usuario=usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    @Override
    public String toString() {
        return usuario ;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
