import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        int numero1, numero2;
        String mayor;
        System.out.println("Ingrese 2 numeros para saber cual es mayor: ");
        System.out.println("Ingrese el numero 1");
        Scanner sc = new Scanner(System.in);
        numero1 = sc.nextInt();
        System.out.println("Ingrese el numero 2");
        numero2 = sc.nextInt();

        mayor = numero1 > numero2 ? "el " + numero1 + " es mayor" : "el " + numero2 + " es mayor";
        System.out.println(mayor);
    }
}
