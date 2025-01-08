import java.util.Scanner;

public class Ejercicio15 {
   /*15. Crea la función muestraPares(int n) que muestre por consola los primeros n números
pares. */
    public static void pares (int n){
        int par =2;
        for (int i = 1; i <= n; i++){
            System.out.print(par + " ");
            par = par+2;
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Cuantos numeros pares quiere ver? ");
    int n = sc.nextInt();
    pares(n);



}
}
