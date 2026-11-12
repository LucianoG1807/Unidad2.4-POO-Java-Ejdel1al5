public class RenderizadorVulkan implements MotorGrafico {

    private boolean contextoInicializado;

    @Override
    public void inicializarContexto() {
        contextoInicializado = true;
        System.out.println("Contexto Vulkan inicializado.");
    }

    @Override
    public void dibujarMalla(String nombreMalla) {

        if (!contextoInicializado) {
            System.out.println("Error: el contexto Vulkan no está inicializado.");
            return;
        }

        System.out.println("Vulkan dibujando malla: " + nombreMalla);
    }

    @Override
    public void liberarRecursos() {

        if (!contextoInicializado) {
            System.out.println("No hay recursos de Vulkan para liberar.");
            return;
        }

        contextoInicializado = false;
        System.out.println("Recursos de Vulkan liberados.");
    }
}