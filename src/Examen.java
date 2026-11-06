
public class Examen {
    public static void main(String[] args) {
        double Pedido1 = 12.5;
        double Unidades1 = 4;
        double NegociosTienda1 = Pedido1 * Unidades1;
        double Descuento1 = NegociosTienda1 * 10 / 100;
        double FormalizacionPago1 = NegociosTienda1 - Descuento1;
        System.out.println("Pedido 1: " + FormalizacionPago1 + " euros");
        double pedido2 = 8.0;
        double unidades2 = 5;
        double NegociosTienda2 = pedido2 * unidades2;
        double Descuento2 = NegociosTienda2 * 10 / 100;
        double FormalizacionPago2 = NegociosTienda2 - Descuento2;
        System.out.println("Pedido 2: " + FormalizacionPago2 + " euros");
        double PagoPlazos = getPagoPlazos(FormalizacionPago1, FormalizacionPago2);
        System.out.println("Pago de cada plazo (3 plazos): " + PagoPlazos + " euros");
        double MediaUnidadesPorPedido = getMediaUnidadesPorPedido(Unidades1, unidades2);
        System.out.println("Media de unidades por pedido: " + MediaUnidadesPorPedido);
    }

    private static double getPagoPlazos(double FormalizacionPago1, double FormalizacionPago2) {
        double PagoPlazos = (FormalizacionPago1 + FormalizacionPago2) / 3;
        return PagoPlazos;
    }

    private static double getMediaUnidadesPorPedido(double Unidades1, double unidades2) {
        double MediaUnidadesPorPedido = (Unidades1 + unidades2) / 2;
        return MediaUnidadesPorPedido;
    }
}
