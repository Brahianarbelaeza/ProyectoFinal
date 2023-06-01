package modelo;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Producto implements Serializable {
    private final static long serialVersionUID = 1L;

    private String codigo;
    private String nombre;
    private String rutaImagen;

    private String categoria;

    private double precio;

    private Estado estado;
    private int megustas;
    private ArrayList<String> comentarios;

    public Producto() {
    }
    public Producto(String codigo, String nombre, String rutaImagen, String categoria, double precio, Estado estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
        this.categoria = categoria;
        this.precio = precio;
        this.estado = estado;
        this.megustas = 0;
        this.comentarios = new ArrayList<>();

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

    public int getMegustas() {
        return megustas;
    }

    public void setMegustas(int megustas) {
        this.megustas = megustas;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public void anadirComentario(String comentario) {
        comentarios.add(comentario);
    }

    public void anadirMeGusta() {
        megustas++;
    }
}
