import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        double precioReal, precioDescuento, descuento;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el precio real del producto: ");
        precioReal = entrada.nextDouble();
        System.out.println("Ingrese el precio de descuento del producto: ");
        precioDescuento = entrada.nextDouble();
        descuento = ((precioReal - precioDescuento) / precioReal) * 100;
        System.out.println("El descuento del producto es: " + descuento + "%");

    }
}
