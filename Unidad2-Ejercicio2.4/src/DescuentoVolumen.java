public class DescuentoVolumen implements PoliticaDescuento {

    private static final double PORCENTAJE = 0.15;

    @Override
    public double calcularDescuento(double montoOriginal) {
        return montoOriginal * PORCENTAJE;
    }
}