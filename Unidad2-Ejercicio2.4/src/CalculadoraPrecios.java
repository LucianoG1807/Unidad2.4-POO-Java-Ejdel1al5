public class CalculadoraPrecios {

    private PoliticaDescuento politicaDescuento;

    public CalculadoraPrecios(PoliticaDescuento politicaDescuento) {
        this.politicaDescuento = politicaDescuento;
    }

    public double calcularPrecioFinal(double montoOriginal) {

        double descuento = politicaDescuento.calcularDescuento(montoOriginal);

        return montoOriginal - descuento;
    }

    public double calcularDescuento(double montoOriginal) {
        return politicaDescuento.calcularDescuento(montoOriginal);
    }
}