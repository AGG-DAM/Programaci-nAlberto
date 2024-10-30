import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();

        for (int i = numero; i >= 1; i--) {
            if (i % 2 == 1) {
                System.out.println(i + " ");
            }
        }
    }
}
