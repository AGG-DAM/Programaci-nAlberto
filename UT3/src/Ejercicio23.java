import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tabla = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Introduce el valor para la posicion " + i + j);
                tabla[i][j] = sc.nextInt();

            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
}
