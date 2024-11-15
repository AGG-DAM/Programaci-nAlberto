import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero 15 numeros ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero" + (i + 1) + " :");
            numeros[i] = entrada.nextInt();

        }
        System.out.println("Numeros antes de la rotación");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");

        }
        System.out.println();

        int ultimo = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {

            numeros[i] = numeros[i - 1];

        }
        numeros[0] = ultimo;
        System.out.println("Numeros despues de la rotación");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");

        }

    }
}
