import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        String letra;
        char letraMin;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el letra: ");
        letra = entrada.next();
        letraMin = letra.toLowerCase().charAt(0);
        if (letraMin == 'a' || letraMin == 'e' || letraMin == 'i' || letraMin == 'o' || letraMin == 'u') {
            System.out.println("La letra " + letra + " es una vocal");
        } else {
            System.out.println("La letra " + letra + " es una consonante");
        }
    }
}
