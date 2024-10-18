import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double numdouble;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para ver si es cercano a 0 ");
        numdouble = sc.nextDouble();

        if (numdouble >-1 && numdouble <1 && numdouble !=0) {
            System.out.println("El numero es cercano a 0");
        } else {
            System.out.println("El numero no es cercano a 0");
        }
    }
}
