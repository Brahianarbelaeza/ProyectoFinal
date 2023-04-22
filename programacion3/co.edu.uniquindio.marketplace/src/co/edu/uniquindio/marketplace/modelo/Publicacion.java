package modelo;

import java.awt.image.BufferedImage;
import java.util.Date;

public class Publicacion {

    private String nombrePublicacion;
    private int id;
    private String descripcion;
    private Vendedor publicador;
    private String [] metodosDePago;
    private String [] medioDeEnvio;
    private Date fehcaPublicacio;
    private String nombreVendedor = publicador.getNombre();
    private String apellidoVendedor = publicador.getApellido();
    private String cedulaVendedor = publicador.getCedula();
    private String usuarioVendedor= publicador.getCuenta().getUsuario();
    private String ubicacionVendedor = publicador.getDireccion();
    private Producto producto;
    private String nombreProducto = producto.getNombre();
    private BufferedImage imagenDelProducto = producto.getImagen();
    private String categoriaProducto = producto.getCategoria();
    private double precioProductoi = producto.getPrecio();
    private Estado estadoProducto = producto.getEstado();


    public Publicacion(String nombrePublicacion, int id, String descripcion, String[] metodosDePago, String[] medioDeEnvio, Date fehcaPublicacio, String nombreVendedor, String apellidoVendedor, String ubicacionVendedor, String nombreProducto, BufferedImage imagenDelProducto, String categoriaProducto, double precioProductoi, Estado estadoProducto) {
        this.nombrePublicacion = nombrePublicacion;
        this.id = id;
        this.descripcion = descripcion;
        this.metodosDePago = metodosDePago;
        this.medioDeEnvio = medioDeEnvio;
        this.fehcaPublicacio = fehcaPublicacio;
        this.nombreVendedor = nombreVendedor;
        this.apellidoVendedor = apellidoVendedor;
        this.ubicacionVendedor = ubicacionVendedor;
        this.nombreProducto = nombreProducto;
        this.imagenDelProducto = imagenDelProducto;
        this.categoriaProducto = categoriaProducto;
        this.precioProductoi = precioProductoi;
        this.estadoProducto = estadoProducto;
    }

    public String getNombrePublicacion() {
        return nombrePublicacion;
    }

    public void setNombrePublicacion(String nombrePublicacion) {
        this.nombrePublicacion = nombrePublicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getMetodosDePago() {
        return metodosDePago;
    }

    public void setMetodosDePago(String[] metodosDePago) {
        this.metodosDePago = metodosDePago;
    }

    public String[] getMedioDeEnvio() {
        return medioDeEnvio;
    }

    public void setMedioDeEnvio(String[] medioDeEnvio) {
        this.medioDeEnvio = medioDeEnvio;
    }

    public Date getFehcaPublicacio() {
        return fehcaPublicacio;
    }

    public void setFehcaPublicacio(Date fehcaPublicacio) {
        this.fehcaPublicacio = fehcaPublicacio;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getApellidoVendedor() {
        return apellidoVendedor;
    }

    public void setApellidoVendedor(String apellidoVendedor) {
        this.apellidoVendedor = apellidoVendedor;
    }

    public String getCedulaVendedor() {
        return cedulaVendedor;
    }

    public void setCedulaVendedor(String cedulaVendedor) {
        this.cedulaVendedor = cedulaVendedor;
    }

    public String getUsuarioVendedor() {
        return usuarioVendedor;
    }

    public void setUsuarioVendedor(String usuarioVendedor) {
        this.usuarioVendedor = usuarioVendedor;
    }

    public String getUbicacionVendedor() {
        return ubicacionVendedor;
    }

    public void setUbicacionVendedor(String ubicacionVendedor) {
        this.ubicacionVendedor = ubicacionVendedor;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public BufferedImage getImagenDelProducto() {
        return imagenDelProducto;
    }

    public void setImagenDelProducto(BufferedImage imagenDelProducto) {
        this.imagenDelProducto = imagenDelProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public double getPrecioProductoi() {
        return precioProductoi;
    }

    public void setPrecioProductoi(double precioProductoi) {
        this.precioProductoi = precioProductoi;
    }

    public Estado getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(Estado estadoProducto) {
        this.estadoProducto = estadoProducto;
    }
}
