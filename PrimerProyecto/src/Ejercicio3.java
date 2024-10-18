import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Introduce tu edad");
        Scanner s = new Scanner(System.in);
        int edad = s.nextInt();
        System.out.println("El año que viene tu edad sera " +(edad+1));
    }
}
