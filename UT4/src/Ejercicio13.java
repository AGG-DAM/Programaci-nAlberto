import java.util.Scanner;

public class Ejercicio13 {
    /*
   13. Diseña una función que calcule y muestre la superficie y el volumen de una esfera.
   La función recibirá como parámetro de entrada el radio de la esfera.
           𝑆𝑢𝑝𝑒𝑟𝑓𝑖𝑐𝑖𝑒 = 4𝜋 ∗ 𝑟𝑎𝑑𝑖𝑜2
           𝑉𝑜𝑙𝑢𝑚𝑒𝑛 =(4𝜋/3) * 𝑟𝑎𝑑𝑖𝑜3
   */
    public static void  esfera (double radio){
        double superficie = 4* Math.PI * Math.pow(radio, 2);
        double volumen = ((4 * Math.PI)/3) * Math.pow(radio, 3);
        System.out.println("La superficie es " + superficie + " y el volumen "+ volumen);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera: ");
        double radio = sc.nextDouble();

        esfera(radio);


    }
}
