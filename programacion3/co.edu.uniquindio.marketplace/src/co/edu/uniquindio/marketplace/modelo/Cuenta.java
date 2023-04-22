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
  // public boolean inicioSesion(String usuario, String contrasena){
        Cuenta cuenta = new Cuenta(usuario, contrasena);

     //   if (cuenta.getUsuario().equals(this.getCuenta().getUsuario()) && cuenta.getContrasena().equals(this.getCuenta().getContrasena())){
            //return true;
       // }
      //  return false;
   // }
    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(String usuario){
        this.usuario=usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
