package modelo;

import java.util.ArrayList;

public class Muro {

    ArrayList<Publicacion> publicaciones = new ArrayList<>();

    public Muro(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public void crearPublicacion() {

    }

    public void editarPublicacion() {

    }

    public void eliminarPublicacion() {

    }

    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
}
