import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 0 y 99999 para saber cuantas cifras tiene: ");
        numero = entrada.nextInt();
        if (numero >= 0 && numero <= 9) {
            System.out.println("El numero tiene 1 caracter");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El numero tiene 2 caracteres");
        } else if (numero >= 100 && numero <= 999) {
            System.out.println("El numero tiene 3 caracteres");
        } else if (numero >= 1000 && numero <= 9999) {
            System.out.println("El numero tiene 4 caracteres");
        } else if (numero >= 10000 && numero <= 99999) {
            System.out.println("El numero tiene 5 caracteres");
        } else {
            System.out.println("El numero no esta entre 0 y 99999");
        }
    }
}
