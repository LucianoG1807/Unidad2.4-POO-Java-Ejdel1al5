import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<EstrategiaEnvio> envios = new ArrayList<>();

        envios.add(new EnvioEstandar(500));
        envios.add(new EnvioExpresoAereo(1000));
        envios.add(new EnvioMaritimo(300));

        double pesoKg = 10;
        double distanciaKm = 500;

        System.out.println("=== SISTEMA DE COSTOS DE ENVÍOS ===");

        for (EstrategiaEnvio envio : envios) {

            try {
                double costo = envio.calcularCosto(pesoKg, distanciaKm);

                System.out.println("Tipo de envío: " +
                        envio.getClass().getSimpleName());

                System.out.println("Peso: " + pesoKg + " kg");
                System.out.println("Distancia: " + distanciaKm + " km");
                System.out.println("Costo total: $" + costo);

                System.out.println("-----------------------------");

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}