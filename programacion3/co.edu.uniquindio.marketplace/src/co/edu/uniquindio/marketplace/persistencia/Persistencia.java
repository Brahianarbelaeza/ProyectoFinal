package persistencia;

import modelo.Cuenta;
import modelo.Marketplace;
import modelo.Vendedor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public class Persistencia {
    private static final String RUTA_ARCHIVO_VENDEDORES = "C://td//persistencia//archivos//archivoVendedores.txt";
    private static final String RUTA_ARCHIVO_MODELO_MARKETPLACE_BINARIO = "C://td//persistencia//modelo.dat";
    private static final String RUTA_ARCHIVO_MODELO_MARKETPLACE_XML = "C://td//persistencia//modelo.xml";
    private static final String RUTA_ARCHIVO_MODELO_MARKETPLACE_XML_RESPALDO = "C://td//persistencia//respaldo//modelorespaldo.xml";
    private static final String RUTA_ARCHIVO_LOG = "C://td//persistencia//log//marketplace_Log.txt";

    public static void guardaRegistroLog(String mensajeLog, int nivel, String accion)
    {

        ArchivoUtil.guardarRegistroLog(mensajeLog, nivel, accion, RUTA_ARCHIVO_LOG);
    }

    public static void guardarRecursoMarketplaceBinario(Marketplace marketplace) {
        try {
            ArchivoUtil.salvarRecursoSerializado(RUTA_ARCHIVO_MODELO_MARKETPLACE_BINARIO, marketplace);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static Marketplace cargarRecursoBancoBinario() {

        Marketplace marketplace = null;

        try {
            marketplace = (Marketplace) ArchivoUtil.cargarRecursoSerializado(RUTA_ARCHIVO_MODELO_MARKETPLACE_BINARIO);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return marketplace;
    }

    public static void guardarRecursoMarketplaceXML(Marketplace marketplace) {

        try {
            ArchivoUtil.salvarRecursoSerializadoXML(RUTA_ARCHIVO_MODELO_MARKETPLACE_XML, marketplace);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void respaldo()
            throws IOException {

        Path copied = Paths.get(RUTA_ARCHIVO_MODELO_MARKETPLACE_XML_RESPALDO);
        Path originalPath = Paths.get(RUTA_ARCHIVO_MODELO_MARKETPLACE_XML);
        Files.copy(originalPath, copied, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
        System.out.println("Respaldo realizado con exito");


    }

    public static Marketplace cargarRecursoMarketplaceXML() {

        Marketplace marketplace = null;

        try {
            marketplace = (Marketplace) ArchivoUtil.cargarRecursoSerializadoXML(RUTA_ARCHIVO_MODELO_MARKETPLACE_XML);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return marketplace;
    }

    //Guarda en un archivo de texto toda la información de las personas almacenadas en el ArrayList
    public static void  guardarVendedores (ArrayList<Vendedor> vendedores) throws IOException {

        String contenido = "";

        for (Vendedor vendedor:vendedores) {

            contenido += vendedor.getNombre()+"@@"+vendedor.getApellido()+"@@"+vendedor.getCedula()+"@@"+vendedor.getCuenta().getUsuario()+"@@"+vendedor.getDireccion()+"@@"+ vendedor.getCuenta().getContrasena()+ "\n";
        }

        ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_VENDEDORES, contenido, false);
    }
    // Retorna un Arraylist de personas con los datos obtenidos del archivo de texto indicado
    public static ArrayList<Vendedor> cargarVendedores() throws FileNotFoundException, IOException{
        ArrayList<Vendedor> vendedores =new ArrayList<Vendedor>();

        ArrayList<String> contenido = ArchivoUtil.leerArchivo(RUTA_ARCHIVO_VENDEDORES);
        String linea="";

        for (int i = 0; i < contenido.size(); i++)
        {
            linea = contenido.get(i);//
            Vendedor vendedor = new Vendedor();
            Cuenta cuenta = new Cuenta();
            vendedor.setNombre(linea.split("@@")[0]);
            vendedor.setApellido(linea.split("@@")[1]);
            vendedor.setCedula(linea.split("@@")[2]);
            cuenta.setUsuario(linea.split("@@")[3]);
            vendedor.setDireccion(linea.split("@@")[4]);
            cuenta.setContrasena(linea.split("@@")[5]);
            vendedor.setCuenta(cuenta);
            vendedores.add(vendedor);
        }
        return vendedores;
    }


}
