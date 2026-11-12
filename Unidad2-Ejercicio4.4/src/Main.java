public class Main {

    public static void main(String[] args) {

        GestorAuditoria gestor = new GestorAuditoria();

        DestinoLog archivo = new LogArchivoLocal();
        DestinoLog baseDatos = new LogBaseDatos();
        DestinoLog nube = new LogServicioNube();

        gestor.agregarDestino(archivo);
        gestor.agregarDestino(baseDatos);
        gestor.agregarDestino(nube);

        System.out.println("=== SISTEMA DE AUDITORÍA ===");

        gestor.difundirRegistro(
                "CRÍTICO",
                "Se detectó un acceso no autorizado al servidor."
        );
    }
}