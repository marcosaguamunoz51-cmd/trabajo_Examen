public class Examen {
    public static void main(String[] args) {
        double precioCamiseta1 = 12.5;
        double NumUnidades1 = 4;
        double PrimeraCompra = precioCamiseta1 * NumUnidades1;
        double descuentoProducto1 = PrimeraCompra * 10 / 100;
        double totalOperaciones1 = PrimeraCompra - descuentoProducto1;
        Operaciónextraida1(totalOperaciones1);
        double precioCamiseta2 = 8.0;
        double NumUnidades2 = 5;
        double SegundaCompra = precioCamiseta2 * NumUnidades2;
        double DescuentoProducto2 = SegundaCompra * 10 / 100;
        double totalOperaciones2 = SegundaCompra - DescuentoProducto2;
        Operaciónextraida2(totalOperaciones2);
        double plazo = (totalOperaciones1 + totalOperaciones2) / 3;
        System.out.println("Pago de cada plazo (3 plazos): " + plazo + " euros");
        double MediaProductos = (NumUnidades1 + NumUnidades2) / 2;
        System.out.println("Media de unidades por pedido: " + MediaProductos);
    }

    private static void Operaciónextraida1(double totalOperaciones1) {
        System.out.println("Pedido 1: " + totalOperaciones1 + " euros");
    }

    private static void Operaciónextraida2(double totalOperaciones2) {
        System.out.println("Pedido 2: " + totalOperaciones2 + " euros");
    }
}