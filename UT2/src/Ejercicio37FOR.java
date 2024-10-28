import java.util.Scanner;

public class Ejercicio37FOR {
    public static void main(String[] args) {
        int numero, total;
        total = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            total = total * i;


        }
        System.out.println("El factorial de " + numero + " es " + total);
    }
}
