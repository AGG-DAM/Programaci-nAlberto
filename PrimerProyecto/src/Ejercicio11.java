import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        //declaracion  de las variables
        double iva,total,precioBase;
        System.out.println("Ingrese el precio del producto para saber su iva: ");
        //entrada para añadir precio base de un producto
        Scanner sc = new Scanner(System.in);
        precioBase = sc.nextInt();
        // calculo el iva del producto
        iva = precioBase *0.21;
        // calculo el precio total del producto con iva
        total = precioBase + iva;
        // imprimo en pantalla precio, iva y total como cadena de texto
        System.out.println("El producto con precio "+ precioBase + " tiene un iva de " + iva + " el precio total del producto es :"+ total);
        // Imprimo  en pantalla precio , iva y total indicando con %.2f que coja 2 decimales y dando las variables como parametros indicando con
        System.out.printf("El producto con precio %.2f tiene un iva de %.2f el precio total del producto es : %.2f",precioBase,iva,total);
    }
}
