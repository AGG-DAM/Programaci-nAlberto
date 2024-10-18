import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        int milla,total;
        final int MILLA_METRO =1852;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la distancia en millas para pasarla a metros: ");
        milla = sc.nextInt();
        total = milla*MILLA_METRO;

        System.out.println(milla+" millas equivalen a  "+total +" metros");



    }
}
