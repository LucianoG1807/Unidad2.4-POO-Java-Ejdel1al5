public class Main {

    public static void main(String[] args) {

        double montoOriginal = 100000;

        PoliticaDescuento lealtad = new DescuentoLealtad();
        PoliticaDescuento estacional = new DescuentoEstacional();
        PoliticaDescuento volumen = new DescuentoVolumen();

        CalculadoraPrecios calculadoraLealtad =
                new CalculadoraPrecios(lealtad);

        CalculadoraPrecios calculadoraEstacional =
                new CalculadoraPrecios(estacional);

        CalculadoraPrecios calculadoraVolumen =
                new CalculadoraPrecios(volumen);

        System.out.println("MONTO ORIGINAL: $" + montoOriginal);

        System.out.println("\n--- DESCUENTO POR LEALTAD ---");
        System.out.println("Ahorro: $" +
                calculadoraLealtad.calcularDescuento(montoOriginal));
        System.out.println("Precio final: $" +
                calculadoraLealtad.calcularPrecioFinal(montoOriginal));

        System.out.println("\n--- DESCUENTO ESTACIONAL ---");
        System.out.println("Ahorro: $" +
                calculadoraEstacional.calcularDescuento(montoOriginal));
        System.out.println("Precio final: $" +
                calculadoraEstacional.calcularPrecioFinal(montoOriginal));

        System.out.println("\n--- DESCUENTO POR VOLUMEN ---");
        System.out.println("Ahorro: $" +
                calculadoraVolumen.calcularDescuento(montoOriginal));
        System.out.println("Precio final: $" +
                calculadoraVolumen.calcularPrecioFinal(montoOriginal));
    }
}