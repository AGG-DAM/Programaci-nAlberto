import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        double kiloPeras, kiloManzanas, totalPeras, totalManzanas;
        final double PRECIO_PERAS = 1.95;
        final double PRECIO_MANZANAS = 2.35;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los kilos de peras: ");
        kiloPeras = sc.nextInt();
        System.out.println("Ingrese los kilos de manzanas: ");
        kiloManzanas = sc.nextInt();
        totalPeras = kiloPeras * PRECIO_PERAS;
        totalManzanas = kiloManzanas * PRECIO_MANZANAS;
        System.out.println("El importe total es " + (totalPeras + totalManzanas) + "€");

    }
}
