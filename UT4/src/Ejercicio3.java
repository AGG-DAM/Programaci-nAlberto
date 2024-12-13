import java.util.Scanner;

public class Ejercicio3 {
    public static void areavolumencilindro (int opcion, double altura, double radio){
        if (opcion ==1){
            double area = 2*Math.PI*radio*(altura+radio);
            System.out.println("El area de la area es: " + area);
        } else if (opcion ==2) {
            double volumen = Math.PI*Math.pow(radio,2)*altura;
            System.out.println("El volumen es: " + volumen);
        }else{
            System.out.println("La opcion no es correcta");
        }

    }
    public static void main(String[] args) {
        int opcion;
        double altura, radio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura : ");
        altura = sc.nextDouble();
        System.out.println("Introduce la radio : ");
        radio = sc.nextDouble();
        System.out.println("1- si quieres calcular el area");
        System.out.println("2- si quieres calcular el volumen");
        opcion = sc.nextInt();
        areavolumencilindro(opcion, altura, radio);

    }
}
