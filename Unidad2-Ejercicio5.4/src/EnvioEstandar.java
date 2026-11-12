public class EnvioEstandar extends EstrategiaEnvio {

    public EnvioEstandar(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularCosto(double pesoKg, double distanciaKm) {

        validarDatos(pesoKg, distanciaKm);

        return tarifaBase + (pesoKg * 100) + (distanciaKm * 2);
    }
}