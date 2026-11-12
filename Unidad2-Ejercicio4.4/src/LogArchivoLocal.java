public class LogArchivoLocal implements DestinoLog {

    @Override
    public void guardarRegistro(String nivel, String mensaje) {
        System.out.println("Guardando registro en archivo local...");
        System.out.println("Nivel: " + nivel);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Registro guardado correctamente en archivo local.");
    }
}