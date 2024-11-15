import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temperaturaMes = new int[12];

        for (int i = 0; i < temperaturaMes.length; i++) {
            System.out.println("Ingrese temperatura Mes " + (i + 1) + " :");
            temperaturaMes[i] = sc.nextInt();
        }

        for (int i = 0; i < temperaturaMes.length; i++) {
            for (int j = 0; j < temperaturaMes[i]; j++) {
                System.out.print("*");

            }
            System.out.println();
        }


    }
}
