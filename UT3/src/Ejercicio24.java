import java.util.Random;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = 5;
        int columnas;
        Random r = new Random();

        System.out.println("Introduce el número de columnas: ");
        columnas = sc.nextInt();

        int[][] tabla = new int[filas][columnas];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = r.nextInt(0, 11);
            }
        }

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

    }
}
