import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        int milimetros,centimetros,metros,conversion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 distancias en milimetros,centimetros,metros para pasarlo todo a milimetros:");
        System.out.println("Introduce los milimetros:");
        milimetros = sc.nextInt();
        System.out.println("Introduce los centimetros:");
        centimetros = sc.nextInt();
        System.out.println("Introduce los metros:");
        metros = sc.nextInt();
        //suma y conversion a milimetros
        conversion = milimetros+(centimetros*10)+(metros*1000);
        System.out.printf("La conversion de %d milimetros, %d centimetros , %d metros a milimetros es %d",milimetros,centimetros,metros,conversion);


    }
}
