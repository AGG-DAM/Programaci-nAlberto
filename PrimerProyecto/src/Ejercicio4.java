import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Introduce el año actual ");
        Scanner s = new Scanner(System.in);
        int añoActual = s.nextInt();
        System.out.println("Introduce el año de nacimiento");
        int añoNacimiento = s.nextInt();
        System.out.println("Esta es la edad que tienes "+(añoActual-añoNacimiento));
    }
}
