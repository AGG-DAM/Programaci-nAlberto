import java.util.Scanner;

public class Ejercicio2 {
    public static void comprendidos(int numero1, int numero2){
        if(numero1 == numero2){
            System.out.println("Los numeros son iguales");
        }else {
            int numeromenor = Math.min(numero1, numero2);
            int numeromayor = Math.max(numero1, numero2);
            for (int i=numeromenor; i <= numeromayor; i++) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero 1: ");
        int numero1 = sc.nextInt();
        System.out.println("Introduzca el numero 2: ");
        int numero2 = sc.nextInt();
        comprendidos(numero1, numero2);

    }
}
