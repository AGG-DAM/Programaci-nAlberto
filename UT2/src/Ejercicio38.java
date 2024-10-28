import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        String letra;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el letra: ");
        letra = entrada.nextLine();
        letra = letra.toUpperCase();

        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra es una consonante");
        }
    }
}
