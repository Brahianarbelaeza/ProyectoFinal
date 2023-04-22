package modelo;

import excepciones.MuroException;

import java.util.ArrayList;

public class Muro {

    ArrayList<Publicacion> publicaciones = new ArrayList<>();

    public Muro(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }


    public Publicacion  crearPublicacion(Publicacion publicacion) throws MuroException{

        if(publicaciones.contains(publicacion)){
            throw new MuroException("La publicación "+ publicacion.getNombrePublicacion()+ " ya existe en el muro");
        } else {
            publicaciones.add(publicacion);
            System.out.println("Publicación añadida al muro exitosamente");
            return publicacion;
        }
    }

        //Este metodo lo que hace es que cuando el usuario se posicione sobre el nombre en la lista
    //Que se muestra en la interfaz y estos datos son los mismos que se muestran en los campos de texto
    //Entonces ya se procede a editar cada campo
    public void editarPublicacion(Publicacion publicacion, int idPosicionAnterior) {

        for (int i = 0; i <publicaciones.size() ; i++) {

            Publicacion publicacion1 = publicaciones.get(i);
            if(publicacion1.getId()==idPosicionAnterior);
            publicaciones.set(i,publicacion);
        }



    }

    public void eliminarPublicacion(Publicacion publicacion) throws MuroException{

        if(!publicaciones.isEmpty()){
            publicaciones.remove(publicacion);
        }
        else{
            throw new MuroException("La lista se encuentra vacia");
        }
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
}
