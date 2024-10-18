import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        int mega,total;
        final int MEGA_KILO =1024;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de MB para convertirlos a Kb: ");
        mega = sc.nextInt();
        total = mega*MEGA_KILO;

        System.out.println(mega+" Mb equivalen a  "+total +" Kb");

    }
}
