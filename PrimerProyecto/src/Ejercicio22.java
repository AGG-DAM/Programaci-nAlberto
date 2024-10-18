import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        int numero1, numero2;
        String mayor;
        System.out.println("Ingrese 2 numeros para visuarlizarlos en orden ascendente ");
        System.out.println("Ingrese el numero 1");
        Scanner sc = new Scanner(System.in);
        numero1 = sc.nextInt();
        System.out.println("Ingrese el numero 2");
        numero2 = sc.nextInt();

        mayor = numero1 < numero2 ? "el orden de los numeros ascendente es " + numero1 + " y "+numero2 : "el orden de los numeros es  " + numero2 + " y "+numero1;
        System.out.println(mayor);
    }
}
