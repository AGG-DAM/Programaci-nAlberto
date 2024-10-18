import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para saber si es par: ");
        int num = sc.nextInt();
        boolean par = num % 2 == 0;
        System.out.println("El número es par?: " + par);

    }
}
