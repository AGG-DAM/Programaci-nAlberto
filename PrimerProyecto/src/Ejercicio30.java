import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        double num;
        System.out.println("Introduce un numero en decimal para mostrarlo el entero más proximo:");
        Scanner sc = new Scanner(System.in);
        num = Math.round(sc.nextDouble());
        System.out.printf("El numero entero más proximo es %.0f ", num);


    }
}
