package modelo;

import javax.swing.*;
import java.io.Serializable;
import java.util.Objects;

public class Producto implements Serializable {
    private final static long serialVersionUID = 1L;

    private String codigo;
    private String nombre;
    private String rutaImagen;

    private String categoria;

    private double precio;

    private Estado estado;

    public Producto() {
    }
    public Producto(String codigo, String nombre, String rutaImagen, String categoria, double precio, Estado estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
        this.categoria = categoria;
        this.precio = precio;
        this.estado = estado;

    }

    //Metodo que devuelve un objeto Jlabel  con la imagen del producto
    //Este metodo crea un Jlabel utilizando un ImageIcon creado mediante el objeto BufferedImage que esta asociado al producto
    // De este modo los objetos creados a partir de la clase producto podrán mostrar sus imagenes en la interfaz grafica
    public JLabel getEtiquetaImagen(){
        return  new JLabel(new ImageIcon(rutaImagen));
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
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
