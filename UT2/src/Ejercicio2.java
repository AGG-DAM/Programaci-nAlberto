import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero 2 numeros para saber si son iguales ");
        System.out.println("Ingrese primer numero:");
        num1 = sc.nextInt();
        System.out.println("Ingrese segundo numero:");
        num2 = sc.nextInt();
        if(num1==num2){
            System.out.println("El numero es igual");
        } else {
            System.out.println("El numero no es igual");
        }
    }
}
