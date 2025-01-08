import java.util.Scanner;

public class Ejercicio16 {
    /*16. Escribe una función a la que se pase como parámetros de entrada una cantidad de
días, horas y minutos. La función calculará y devolverá el número de segundos que
existen en los datos de entrada.

     */
    public static int segundos (int dias, int horas,int minutos) {
        int diasHoras = dias*24;
        int horasMinutos = (diasHoras+horas)*60;
        int minutosSegundos = (horasMinutos+minutos)*60;
        int segundos = minutosSegundos;
        return segundos;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los dias");
        int dias = sc.nextInt();
        System.out.println("Introduzca los horas");
        int horas = sc.nextInt();
        System.out.println("Introduzca los minutos");
        int minutos = sc.nextInt();
        int segundos = segundos(dias,horas,minutos);
        System.out.println(segundos);

    }
}
