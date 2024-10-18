import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        double entradaInfantil,entradaAdulto,total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de entradas que vas a comprar de cada tipo");
        System.out.println("Entradas de niños:");
        entradaInfantil = sc.nextDouble()*15.50;
        System.out.println("Entradas de adultos");
        entradaAdulto = sc.nextDouble()*20;
        total = entradaInfantil + entradaAdulto;
        System.out.printf("El precio total de las entradas es %.2f€",total);

    }
}
