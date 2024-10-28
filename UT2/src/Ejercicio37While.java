import java.util.Scanner;

public class Ejercicio37While {
    public static void main(String[] args) {
        int numero, total, i;
        i = 1;
        total = 1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();

        while (i <= numero) {
            total = total * i;
            i++;
        }
        System.out.println("El factorial de " + numero + " es " + total);
    }
}
