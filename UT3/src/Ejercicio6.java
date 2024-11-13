import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double media = 0;
        int mediaint;
        int[] arrayNumeros = new int[10];

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = rand.nextInt(11);
            media += arrayNumeros[i];
        }
        media /= 10;
        mediaint = (int) media;
        System.out.println("Las notas almacenadas son :");
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print(arrayNumeros[i] + " ");

        }
        System.out.println();

        switch (mediaint) {
            case 1, 2, 3, 4 -> {
                System.out.println("La nota media es " + media + " has suspendido");
            }
            case 5, 6 -> {
                System.out.println("La nota media es " + media + " tienes un bien");
            }
            case 7, 8 -> {
                System.out.println("La nota media es " + media + " tienes un notable");
            }
            case 9, 10 -> {
                System.out.println("La nota media es " + media + " tienes un sobresaliente");
            }
        }

    }
}
