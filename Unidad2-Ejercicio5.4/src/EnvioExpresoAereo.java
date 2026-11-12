public class EnvioExpresoAereo extends EstrategiaEnvio {

    public EnvioExpresoAereo(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularCosto(double pesoKg, double distanciaKm) {

        validarDatos(pesoKg, distanciaKm);

        return tarifaBase + (pesoKg * 250) + (distanciaKm * 5);
    }
}