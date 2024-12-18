import java.util.Scanner;

public class PruebaLLamadaRecursiva {
    public static long factorial(int n) {
        long resultado;
        if(n==0){
            resultado = 1;

        }else{
            resultado = factorial(n-1)*n;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero para conocer su factorial: ");
        int numero = entrada.nextInt();
        System.out.println("El resultado es: "+factorial(numero));
    }
}
