public class DescuentoEstacional implements PoliticaDescuento {

    private static final double PORCENTAJE = 0.20;

    @Override
    public double calcularDescuento(double montoOriginal) {
        return montoOriginal * PORCENTAJE;
    }
}