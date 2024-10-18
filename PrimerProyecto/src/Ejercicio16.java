import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        int horas, minutos, segundos;
        System.out.println("Escribe una cantidad de segundos para saber cuantas horas, minutos y segundos son:");
        Scanner sc = new Scanner(System.in);
        // solicitamos los segundos
        segundos = sc.nextInt();
        horas = segundos / 3600;
        minutos = segundos % 3600 / 60;
        segundos = (segundos % 3600) % 60;
        System.out.println(horas + " horas " + minutos + " minutos " + segundos + " segundos ");

    }
}
