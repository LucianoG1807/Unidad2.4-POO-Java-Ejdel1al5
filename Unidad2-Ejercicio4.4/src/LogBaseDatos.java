public class LogBaseDatos implements DestinoLog {

    @Override
    public void guardarRegistro(String nivel, String mensaje) {
        System.out.println("Conectando con la base de datos...");
        System.out.println("Nivel: " + nivel);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Registro guardado correctamente en base de datos.");
    }
}