import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        int hora;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la hora ");
        hora = entrada.nextInt();
        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");

        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");

        } else if (hora >= 21 && hora <= 23 || hora >= 0 && hora <= 5) {
            System.out.println("Buenas noches");

        } else {
            System.out.println("La hora introducida no es valida");
        }
    }
}
