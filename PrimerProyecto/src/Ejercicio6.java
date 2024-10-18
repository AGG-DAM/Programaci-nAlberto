import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int nota1, nota2;
        double media;
        System.out.println("Ingrese la primera nota: ");
        Scanner entrada = new Scanner(System.in);
        nota1 = entrada.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = entrada.nextInt();
        media = (nota1 + nota2) / 2.0;
        System.out.println("La media es: " + media);
    }
}
