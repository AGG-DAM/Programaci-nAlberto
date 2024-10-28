import java.util.Scanner;

public class Ejercicio37dowhile {
    public static void main(String[] args) {
        int numero, total, i;
        total = 1;
        i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();

        do {
            total = total * i;
            i++;

        } while (i <= numero);
        System.out.println("El factorial de " + numero + " es " + total);

    }
}
