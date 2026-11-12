public class LectorTextoPlano extends LectorDocumento {

    @Override
    public void abrirArchivo(String ruta) {
        validarExtension(ruta, ".txt");
        rutaArchivo = ruta;
        System.out.println("Archivo de texto abierto correctamente: " + ruta);
    }

    @Override
    public String extraerTexto() {
        verificarArchivoAbierto();
        return "Texto extraído del archivo de texto plano: " + rutaArchivo;
    }
}