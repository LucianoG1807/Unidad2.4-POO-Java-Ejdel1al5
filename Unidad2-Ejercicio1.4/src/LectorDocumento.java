public abstract class LectorDocumento {

    protected String rutaArchivo;

    public abstract void abrirArchivo(String ruta);

    public abstract String extraerTexto();

    protected void validarExtension(String ruta, String... extensiones) {

        if (ruta == null || ruta.isBlank()) {
            throw new IllegalArgumentException("La ruta del archivo no puede estar vacía.");
        }

        String rutaMinuscula = ruta.toLowerCase();

        boolean compatible = false;

        for (String extension : extensiones) {
            if (rutaMinuscula.endsWith(extension)) {
                compatible = true;
                break;
            }
        }

        if (!compatible) {
            throw new IllegalArgumentException("Extensión de archivo no compatible: " + ruta);
        }
    }

    protected void verificarArchivoAbierto() {
        if (rutaArchivo == null) {
            throw new IllegalStateException("Primero debe abrir un archivo.");
        }
    }
}