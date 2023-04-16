package persistencia;

public class Persistencia {
    private static final String RUTA_ARCHIVO_VENDEDORES = "C://td//persistencia//archivos//archivoVendedores.txt";
    private static final String RUTA_ARCHIVO_MODELO_MARKETPLACE_XML = "src/co/edu/uniquindio/marketplace/recursos/modelo.xml";
    private static final String RUTA_ARCHIVO_LOG = "C://td//persistencia//log//marketplace_Log.txt";

    public static void guardaRegistroLog(String mensajeLog, int nivel, String accion)
    {

        ArchivoUtil.guardarRegistroLog(mensajeLog, nivel, accion, RUTA_ARCHIVO_LOG);
    }

}
