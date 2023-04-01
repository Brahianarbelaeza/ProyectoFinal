package modelo;

public class Producto {
    private String nombre;
    private String imagen;

    private String categorio;

    private double precio;

    private Estado estado;

    public Producto(String nombre, String imagen, String categorio, double precio, Estado estado) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.categorio = categorio;
        this.precio = precio;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCategorio() {
        return categorio;
    }

    public void setCategorio(String categorio) {
        this.categorio = categorio;
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
