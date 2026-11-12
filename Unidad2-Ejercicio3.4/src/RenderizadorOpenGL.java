public class RenderizadorOpenGL implements MotorGrafico {

    private boolean contextoInicializado;

    @Override
    public void inicializarContexto() {
        contextoInicializado = true;
        System.out.println("Contexto OpenGL inicializado.");
    }

    @Override
    public void dibujarMalla(String nombreMalla) {

        if (!contextoInicializado) {
            System.out.println("Error: el contexto OpenGL no está inicializado.");
            return;
        }

        System.out.println("OpenGL dibujando malla: " + nombreMalla);
    }

    @Override
    public void liberarRecursos() {

        if (!contextoInicializado) {
            System.out.println("No hay recursos de OpenGL para liberar.");
            return;
        }

        contextoInicializado = false;
        System.out.println("Recursos de OpenGL liberados.");
    }
}