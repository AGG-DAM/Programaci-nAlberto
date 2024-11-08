import java.util.Scanner;

public class Ejercicio61 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        String numero = sc.nextLine();
        int num;

        try {
            num = Integer.parseInt(numero);

            System.out.println("Número valido: " + numero);


        } catch (NumberFormatException e) {
            System.err.println("Error: no es un numero valido");

        }
    }
}
