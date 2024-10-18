import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros para verlos ordenados de mayor a menor o indicar si son iguales : ");
        System.out.print("Ingrese el primer numero : ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero : ");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("El numero mayor es "+ num1 + " que "+ num2);
        } else if (num1 < num2) {
            System.out.println("El numero mayor es "+ num2 + " que "+ num1);

        } else {
            System.out.println("Los numeros son iguales ");
        }
    }
}
