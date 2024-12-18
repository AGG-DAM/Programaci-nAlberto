import java.util.Scanner;

public class Ejercicio10 {
    public static double potencia (double base, int exponente){
        double resultado;
        if(exponente == 0){
            resultado = 1;
        }else{
            resultado = base*potencia (base, exponente-1);
        }
        return resultado;
    }
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = entrada.nextDouble();
        System.out.print("Ingrese el exponente: ");
        int exponente = entrada.nextInt();
        double resultado = potencia(base,exponente);
        System.out.println("El resultado es: " + resultado);
    }
}
