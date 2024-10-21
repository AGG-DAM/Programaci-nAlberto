import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es par y divisible entre 5 ");
        numero = entrada.nextInt();
        if (numero % 2 == 0 && numero % 5 == 0) {
            System.out.println("El numero es par y divisible entre 5 ");
        } else if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else if (numero % 5 == 0) {
            System.out.println("El numero es  divisible entre 5 ");
        } else {
            System.out.println("El numero es impar");

        }

    }
}
