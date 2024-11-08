import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        try {
            System.out.println("Ingrese un numero para calcular su raíz cuadrada: ");
            numero = sc.nextInt();
            double result = Math.sqrt(numero);
            if (Double.isNaN(result)) {
                throw new ArithmeticException();

            }
            System.out.println("La raíz cuadrada de " + numero + " es " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error:No se puede calcular la raiz cuadrada de un numero negativo");
        } catch (InputMismatchException f) {
            System.err.println("Error: la entrada debe de ser un numero entero ");
        }


    }
}
