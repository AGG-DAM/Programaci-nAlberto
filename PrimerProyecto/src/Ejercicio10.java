import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Ingrese las notas del primer, segundo y tercer trimestre ");
        int nota1, nota2, nota3, mediaInt;
        double mediaDouble;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        nota1 = entrada.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = entrada.nextInt();
        System.out.println("Ingrese la tercera nota: ");
        nota3 = entrada.nextInt();
        mediaDouble = (nota1 + nota2 + nota3) / 3.0;
        mediaInt = (nota1 + nota2 + nota3) / 3;
        System.out.println("La nota media del boletin es: " + mediaInt);
        System.out.println("La nota media del expediente es: " + mediaDouble);


    }
}
