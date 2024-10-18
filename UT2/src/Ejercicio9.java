import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int dia;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una nota: ");
        dia = entrada.nextInt();
        switch (dia) {

            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("El dia de la semana no es valido");
        }
    }
}
