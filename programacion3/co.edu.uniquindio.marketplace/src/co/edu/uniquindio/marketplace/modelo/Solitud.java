package modelo;

public class Solitud {
    private String codigo;
    boolean estado; //true aceptado, false rechazado

    public Solitud(String codigo, boolean estado) {
        this.codigo = codigo;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
