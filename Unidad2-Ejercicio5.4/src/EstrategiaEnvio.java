public abstract class EstrategiaEnvio {

    protected double tarifaBase;

    public EstrategiaEnvio(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public abstract double calcularCosto(double pesoKg, double distanciaKm);

    protected void validarDatos(double pesoKg, double distanciaKm) {

        if (pesoKg < 0 || distanciaKm < 0) {
            throw new IllegalArgumentException("El peso y la distancia no pueden ser negativos.");
        }
    }
}