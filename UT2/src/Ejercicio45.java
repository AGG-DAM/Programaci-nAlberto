import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int COMBINACION = 1234;
        int intento;
        int intentos = 0;
        boolean abierto = false;

        while (intentos < 4 && !abierto) {
            System.out.println("Introduzca la combinacion");
            intentos = sc.nextInt();

            if (intentos == COMBINACION) {
                abierto = true;
            } else {
                System.out.println("Lo siento esa no es la combinacion");
            }
            intentos++;

        }
        if (abierto) {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        } else {
            System.out.println("Lo siento , la caja no se ha podido abrir");
        }

    }
}
