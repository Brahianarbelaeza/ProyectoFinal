package modelo;

import java.util.ArrayList;

public class Marketplace {

    private Administrador administrador;

    ArrayList<Vendedor>vendedores=new ArrayList();


    public Marketplace(Administrador administrador, ArrayList<Vendedor> vendedores) {
        this.administrador = administrador;
        this.vendedores = vendedores;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
}
