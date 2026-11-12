public class RenderizadorDirectX implements MotorGrafico {

    private boolean contextoInicializado;

    @Override
    public void inicializarContexto() {
        contextoInicializado = true;
        System.out.println("Contexto DirectX inicializado.");
    }

    @Override
    public void dibujarMalla(String nombreMalla) {

        if (!contextoInicializado) {
            System.out.println("Error: el contexto DirectX no está inicializado.");
            return;
        }

        System.out.println("DirectX dibujando malla: " + nombreMalla);
    }

    @Override
    public void liberarRecursos() {

        if (!contextoInicializado) {
            System.out.println("No hay recursos de DirectX para liberar.");
            return;
        }

        contextoInicializado = false;
        System.out.println("Recursos de DirectX liberados.");
    }
}