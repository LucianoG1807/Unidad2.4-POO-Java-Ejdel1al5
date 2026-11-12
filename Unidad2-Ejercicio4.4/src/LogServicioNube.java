public class LogServicioNube implements DestinoLog {

    @Override
    public void guardarRegistro(String nivel, String mensaje) {
        System.out.println("Conectando con el servicio de nube...");
        System.out.println("Nivel: " + nivel);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Registro enviado correctamente a la nube.");
    }
}