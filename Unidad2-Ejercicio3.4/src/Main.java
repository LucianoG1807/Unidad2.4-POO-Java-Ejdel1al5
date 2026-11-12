public class Main {

    public static void main(String[] args) {

        MotorGrafico motor;

        System.out.println("--- USANDO OPENGL ---");

        motor = new RenderizadorOpenGL();

        motor.inicializarContexto();
        motor.dibujarMalla("Jugador");
        motor.dibujarMalla("Escenario");
        motor.liberarRecursos();


        System.out.println("\n--- USANDO DIRECTX ---");

        motor = new RenderizadorDirectX();

        motor.inicializarContexto();
        motor.dibujarMalla("Enemigo");
        motor.dibujarMalla("Arbol");
        motor.liberarRecursos();


        System.out.println("\n--- USANDO VULKAN ---");

        motor = new RenderizadorVulkan();

        motor.inicializarContexto();
        motor.dibujarMalla("Vehiculo");
        motor.dibujarMalla("Edificio");
        motor.liberarRecursos();
    }
}