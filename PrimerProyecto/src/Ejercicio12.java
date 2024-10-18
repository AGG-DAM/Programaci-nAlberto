import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int numero,faltante;
        System.out.println("Introduce un numero entero para saber cuanto hay que sumarle para que sea multiplo de 7 :");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        faltante= 7 - (numero %7);
        System.out.println("Al numero "+ numero + " le falta " + faltante + " para ser multiplo de 7 ");


    }
}
