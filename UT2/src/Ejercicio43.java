import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero de 5 cifras: ");
        numero = entrada.nextInt();
        while (numero < 0 || numero > 99999) {

            System.out.println("El numero debe ser de hasta 5 cifras \n Introduce un numero de 5 cifras");
            numero = entrada.nextInt();
        }

        while (numero >= 10) {
            numero = numero / 10;
        }

        System.out.println(numero);
    }
}
