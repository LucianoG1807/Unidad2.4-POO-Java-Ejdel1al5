import java.util.ArrayList;
import java.util.List;

public class GestorAuditoria {

    private List<DestinoLog> destinos;

    public GestorAuditoria() {
        destinos = new ArrayList<>();
    }

    public void agregarDestino(DestinoLog destino) {
        if (destino != null) {
            destinos.add(destino);
        }
    }

    public void difundirRegistro(String nivel, String mensaje) {

        if (nivel == null || nivel.isBlank() ||
                mensaje == null || mensaje.isBlank()) {
            System.out.println("Error: el nivel y el mensaje no pueden estar vacíos.");
            return;
        }

        if (destinos.isEmpty()) {
            System.out.println("No hay destinos de almacenamiento registrados.");
            return;
        }

        for (DestinoLog destino : destinos) {
            destino.guardarRegistro(nivel, mensaje);
            System.out.println("-----------------------------");
        }
    }
}