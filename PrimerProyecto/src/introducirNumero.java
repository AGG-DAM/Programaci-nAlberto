import java.util.Scanner;
public class introducirNumero {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero decimal");
        Scanner s = new Scanner(System.in);
        double b = s.nextDouble();
        System.out.println(b);


        System.out.println("Ingrese un numero entero");
        int a = s.nextInt();
        System.out.println(a);

        System.out.println("Introduce tu nombre");
        String desecho = s.nextLine();
        String nombre = s.nextLine();
        System.out.println("Hola " + nombre);




    }
}
