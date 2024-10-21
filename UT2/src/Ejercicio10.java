import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Pedir día, mes y año de una gecha e indicar si la fecha es correcta. Hay que tener en cuenta" +
                " que existen meses con 28, 30 y 31 dias ( no se tiene en cuenta los años bisiestos) ");
        int dia, mes , anio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        dia = entrada.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = entrada.nextInt();
        System.out.println("Ingrese el año: ");
        anio = entrada.nextInt();

        switch (mes) {
            case 2 -> { if (dia >=1 && dia <= 28) System.out.println("La fecha: " + dia +"/"+ mes +"/"+ anio +" es correcta");
                else System.out.println("La fecha " + dia +"/"+ mes +"/"+ anio +"  es incorrecta");

            }
            case 4,6,9,11 ->{ if (dia >=1 && dia <= 30) System.out.println("La fecha: " + dia +"/"+ mes +"/"+ anio +" es correcta");
            else System.out.println("La fecha " + dia +"/"+ mes +"/"+ anio +" es incorrecta");

            }
            case 1,3,5,7,8,10,12->{ if (dia >=1 && dia <= 31) System.out.println("La fecha: " + dia +"/"+ mes +"/"+ anio +" es correcta");
            else System.out.println("La fecha " + dia +"/"+ mes +"/"+ anio +" es incorrecta");
            }
            default -> System.out.println("El mes "+ mes + " indicado es incorrecto");
        }

    }
}
