import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int numeroN,numeroM,faltante;
        System.out.println("Introduce un numero N:");
        Scanner sc = new Scanner(System.in);
        numeroN = sc.nextInt();
        System.out.println("Introduce un numero M:");
        numeroM = sc.nextInt();
        //formula para calcular cuanto falta para que N sea multiplo de M
        faltante= numeroM - (numeroN %numeroM);
        System.out.println("Al numero "+ numeroN + " le falta " + faltante + " para ser multiplo "+ numeroM);


    }
}