import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad para saber si es mayor de edad: ");
        int edad = sc.nextInt();
        boolean mayor = edad >= 18;
        System.out.println("Mayor de edad = " + mayor);
    }
}
