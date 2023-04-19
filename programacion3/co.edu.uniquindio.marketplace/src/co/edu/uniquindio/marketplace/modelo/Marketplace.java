package modelo;

import java.io.Serializable;

public class Marketplace implements Serializable {
    private static final long serialVersionUID = 1L;
    private Administrador administrador;

    public Marketplace() {
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }


}

