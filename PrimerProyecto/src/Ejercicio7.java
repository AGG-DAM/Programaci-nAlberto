import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        double radio,area,perimetro;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        radio = entrada.nextDouble();
        area=3.1416*(radio*radio);
        perimetro=2*3.1416*radio;
        System.out.println("El area del ciruclo es "+area);
        System.out.println("El perimetro del circulo es "+perimetro);

    }
}
