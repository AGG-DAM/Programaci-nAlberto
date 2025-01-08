import java.util.Scanner;

public class Ejercicio14 {
    /*
   Implementa la función:
static double distancia(double x1, double y1, double x2, double y2)
que calcula y devuelve la distancia euclídea que separa los puntos (x1, y1) y (x2, y2). La
formula para calcular esta distancia es:
𝑑𝑖𝑠𝑡𝑎𝑛𝑐𝑖𝑎 = √(𝑥1 − 𝑥2)
2 + (𝑦1 − 𝑦2)
2
   */
    public static double  distancia (double x1, double y1, double x2,double y2){
        double distancia = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));

       return distancia;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor de x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Introduzca el valor de y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Introduzca el valor de x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Introduzca el valor de y2: ");
        double y2 = sc.nextDouble();
        double distancia = distancia(x1,y1,x2,y2);
        System.out.println("La distancia es " +distancia);


    }
}
