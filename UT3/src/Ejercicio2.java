import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {

        int numerosAleatorios[] = new int[10];
        Random rand = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++ ){
            int aleatorio = rand.nextInt(100)+1;

            numerosAleatorios[i] = aleatorio;

        }
        for (int i = numerosAleatorios.length-1; i >=0 ; i-- ){
            System.out.print(numerosAleatorios[i]+ " : ");
        }

    }
}
