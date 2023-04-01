package modelo;

import java.util.ArrayList;

public class Vendedor {

    private String direccion;
    ArrayList<Producto> productos = new ArrayList();

    public Vendedor(String direccion, ArrayList<Producto> productos) {
        this.direccion = direccion;
        this.productos = productos;
    }

    public void venderProducto(){

    }

    public void eliminarProducto(){

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
