import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio62 {
    public static void main(String[] args) {
        String cadena;
        int indice;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el texto del cadena que desea: ");
        cadena = entrada.nextLine();


        try {
            System.out.print("Ingrese el indice del cadena que desea: ");
            indice = entrada.nextInt();
            char caracter = cadena.charAt(indice);
            System.out.println("El caracter en la posición :" + indice + " es " + caracter);

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Indice fuera de los limites de la cadena");
        } catch (InputMismatchException f) {
            System.err.println("Error: Indice debe de ser un numero entero");
        }
    }
}
