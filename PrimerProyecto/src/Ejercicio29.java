import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        int horas, minutos, segundos, tiempo, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresese la hora:");
        horas = sc.nextInt();
        System.out.println("Ingresese la minutos:");
        minutos = sc.nextInt();
        System.out.println("Ingresese la segundos:");
        segundos = sc.nextInt();
        System.out.println("La hora introducida es: " + horas + " horas " + minutos + " minutos " + segundos + " segundos");
        tiempo = horas * 3600 + minutos * 60 + segundos;
        resultado = tiempo + 1;
        horas = resultado / 3600;
        resultado = resultado % 3600;
        minutos = resultado / 60;
        resultado = resultado % 60;
        segundos = resultado;
        System.out.println("Pasado 1 segundo la hora sera:");
        System.out.println(horas + " horas " + minutos + " minutos " + segundos + " segundos ");
    }
}
