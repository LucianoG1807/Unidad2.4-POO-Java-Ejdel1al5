public class LectorWord extends LectorDocumento {

    @Override
    public void abrirArchivo(String ruta) {
        validarExtension(ruta, ".doc", ".docx");
        rutaArchivo = ruta;
        System.out.println("Archivo Word abierto correctamente: " + ruta);
    }

    @Override
    public String extraerTexto() {
        verificarArchivoAbierto();
        return "Texto extraído del archivo Word: " + rutaArchivo;
    }
}