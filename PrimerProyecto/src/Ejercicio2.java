import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        //Pedimos un numero al usuario
        System.out.println("Ingrese un numero");
        Scanner s = new Scanner(System.in);
        //Asignamos el valor leido a la variable num
        int num = s.nextInt();
        System.out.println(" El numero introducido es " + num);
    }
}
