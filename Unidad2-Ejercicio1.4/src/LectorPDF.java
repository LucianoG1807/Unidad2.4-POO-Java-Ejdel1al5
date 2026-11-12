public class LectorPDF extends LectorDocumento {

    @Override
    public void abrirArchivo(String ruta) {
        validarExtension(ruta, ".pdf");
        rutaArchivo = ruta;
        System.out.println("Archivo PDF abierto correctamente: " + ruta);
    }

    @Override
    public String extraerTexto() {
        verificarArchivoAbierto();
        return "Texto extraído del archivo PDF: " + rutaArchivo;
    }
}