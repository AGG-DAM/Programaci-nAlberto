import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Pedir día, mes y año de una fecha e indicar  la fecha correspondiente al dia siguiente ");
        int dia, mes, anio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        dia = entrada.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = entrada.nextInt();
        System.out.println("Ingrese el año: ");
        anio = entrada.nextInt();

        switch (mes) {
            case 2 -> {
                if (dia >= 1 && dia <= 28) {
                    if (dia == 28) {
                        dia = 1;
                        mes++;
                    } else dia++;
                    System.out.println("La fecha del dia siguiente  es" + dia + "/" + mes + "/" + anio);

                } else System.out.println("La fecha " + dia + "/" + mes + "/" + anio + "  es incorrecta");
            }
            case 4, 6, 9, 11 -> {
                if (dia >= 1 && dia <= 30) {
                    if (dia == 30) {
                        dia = 1;
                        mes++;
                    } else dia++;
                    System.out.println("La fecha del dia siguiente es " + dia + "/" + mes + "/" + anio);

                } else System.out.println("La fecha " + dia + "/" + mes + "/" + anio + "  es incorrecta");

            }
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia >= 1 && dia <= 31) {
                    if (dia == 31) {
                        dia = 1;
                        mes++;
                        if (mes > 12) {
                            mes = 1;
                            anio++;
                        }
                    } else dia++;
                    System.out.println("La fecha del dia siguiente es " + dia + "/" + mes + "/" + anio);
                } else System.out.println("La fecha " + dia + "/" + mes + "/" + anio + "  es incorrecta");
            }
        }

    }
}
