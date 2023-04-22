package modelo;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.Objects;

public class Producto implements Serializable {
    private final static long serialVersionUID = 1L;
    private String nombre;
    private BufferedImage imagen; //Con este tipo de dato se representa la imagen en memoria

    private String categoria;

    private double precio;

    private Estado estado;

    public Producto() {
    }
    public Producto(String nombre, BufferedImage imagen, String categoria, double precio, Estado estado) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.categoria = categoria;
        this.precio = precio;
        this.estado = estado;

    }

    //Metodo que devuelve un objeto Jlabel  con la imagen del producto
    //Este metodo crea un Jlabel utilizando un ImageIcon creado mediante el objeto BufferedImage que esta asociado al producto
    // De este modo los objetos creados a partir de la clase producto podrán mostrar sus imagenes en la interfaz grafica
    public JLabel getEtiquetaImagen(){
        return  new JLabel(new ImageIcon(imagen));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Double.compare(producto.precio, precio) == 0 && Objects.equals(nombre, producto.nombre) && Objects.equals(categoria, producto.categoria) && estado == producto.estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, categoria, precio, estado);
    }

    public boolean compararProducto(Producto producto) {

        return equals(producto);
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
