import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es par o impar :");
        numero = entrada.nextInt();
        if (numero % 2 == 0) {
          System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }
}
