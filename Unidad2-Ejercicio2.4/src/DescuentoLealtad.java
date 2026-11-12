public class DescuentoLealtad implements PoliticaDescuento {

    private static final double PORCENTAJE = 0.10;

    @Override
    public double calcularDescuento(double montoOriginal) {
        return montoOriginal * PORCENTAJE;
    }
}