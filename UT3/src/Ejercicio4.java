import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int arraynumeros [] = new int [10];
        int pares =0;
        int impares =0;
        int ceros =0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa los numeros del array de 10  ");

        for (int i=0; i< arraynumeros.length; i++){
            System.out.println("Ingresar el numero: ");
            arraynumeros[i] = entrada.nextInt();

            if (arraynumeros[i]<0){
               pares ++;
            } else if (arraynumeros[i]>0){
                impares ++;
            } else {
                ceros ++;
            }

        }
        System.out.println("Hay " + pares + " pares ");
        System.out.println("Hay " + impares + " impares ");
        System.out.println("Hay " + ceros + " ceros ");
    }
}
