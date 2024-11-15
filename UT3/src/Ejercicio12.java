import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int[] numeros = new int[100];


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(21);
            System.out.print(numeros[i] + " ");

        }
        System.out.println();
        System.out.println(" Introduce 2 valores para sustituir el valor 2 por el valor 1 entre comillas");
        System.out.println("Introduce valor 1:");

        int primerValor = entrada.nextInt();

        System.out.println("Introduce valor 2:");

        int segundoValor = entrada.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == segundoValor) {

                numeros[i] = primerValor;
                System.out.print("\"" + numeros[i] + "\" ");
            } else {
                System.out.print(numeros[i] + " ");
            }

        }
    }
}
