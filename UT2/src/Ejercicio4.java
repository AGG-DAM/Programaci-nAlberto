import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double numDouble;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para ver si es cercano a 0 ");
        numDouble = sc.nextDouble();

        if (numDouble > -1 && numDouble < 1 && numDouble != 0) {
            System.out.println("El numero es cercano a 0");
        } else {
            System.out.println("El numero no es cercano a 0");
        }
    }
}

