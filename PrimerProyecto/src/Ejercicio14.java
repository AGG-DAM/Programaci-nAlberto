import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Crea un programa que pida la base y la altura de un triangulo y muestre su area");
        double area,base,altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de base: ");
        base = sc.nextInt();
        System.out.println("Ingrese el valor de altura: ");
        altura = sc.nextInt();
        area = (base*altura)/2;
        System.out.println("El area de un triangulo con base "+base+ " y altura " +altura+" es: "+area);


    }
}
