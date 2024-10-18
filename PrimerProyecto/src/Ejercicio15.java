import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,x;
        double y;
        System.out.println("Dado el siguiente polinomio, introduce los valores de a,b,c y x para saber el valor de y ");
        System.out.println("Ingrese el valor de a: ");
        a = sc.nextInt();
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextInt();
        System.out.println("Ingrese el valor de c: ");
        c = sc.nextInt();
        System.out.println("Ingrese el valor de x: ");
        x = sc.nextInt();

        //formula para calcular polinomio de segundo grado y uso la funcion math para hacer x elevado a 2
        y=(a*Math.pow(x,2))+(b*x)+c;

        // muestro la información y uso la funcion math para que no me muestre decimales
        System.out.println("El valor de y es : "+ Math.round(y));

    }

}

