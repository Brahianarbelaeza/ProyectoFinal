package modelo;

public class Publicacion {

    private Producto producto;

    public Publicacion(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
