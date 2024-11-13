import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
            int arraynumeros [] = new int [10];
            double media =0;
            int superior =0;
            int inferior =0;
            int iguales =0;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingresa los numeros del array de 10  ");

            for (int i=0; i< arraynumeros.length; i++){
                System.out.println("Ingresar el numero: ");
                arraynumeros[i] = entrada.nextInt();
                media += arraynumeros[i];
            }
            media = media/arraynumeros.length;
            System.out.println("La media es: "+media);

            for (int i=0; i< arraynumeros.length; i++){

                if (arraynumeros[i]>media){
                    superior ++;
                } else if (arraynumeros[i]<media){
                    inferior ++;
                } else {
                    iguales ++;
                }
            }

            System.out.println("Hay " + superior + " superior ");
            System.out.println("Hay " + inferior + " inferior ");
            System.out.println("Hay " + iguales + " iguales ");
        }
    }

