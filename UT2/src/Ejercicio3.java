import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros para mostrar cual es mayor");
        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else if (num1 < num2) {
            System.out.println("El mayor es: " + num2);
        }else {
            System.out.println("Los numeros son iguales");
        }
    }
}
