import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int nota;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una nota: ");
        nota = entrada.nextInt();
        switch (nota) {

            case 0, 1, 2, 3, 4 -> System.out.println("Insuficiente");
            case 5 -> System.out.println("Suficiente");
            case 6 -> System.out.println("Bien");
            case 7, 8 -> System.out.println("Notable");
            case 9, 10 -> System.out.println("Sobresaliente");
            default -> System.out.println("la nota no es valida");
        }
    }
}
