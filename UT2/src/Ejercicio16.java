import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*Diseña un programa que muestre, para cada numero introducido por teclado , si es par, sies positivo y su cuadrado. El " +
                "proceso se repetira hasta que el numero introducido sea 0 */
        int numero;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Introduce un numero para saber si es par , positivo y su cuadrado  ");
            numero = entrada.nextInt();
            if (numero % 2 == 0) {
                System.out.println("EL numero es par");
            }
            if (numero > 0) {
                System.out.println("El numero es positivo");
            }
            System.out.println("Su cuadrado es " + numero * numero);
        } while (numero != 0);
    }
}
