import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 0, numeroIntroducido = 0, primerNumero = 0, segundoNumero = 0;


        do {
            System.out.println("\n--------------------------------------------------------------");
            System.out.println("Bienvenido a nuestro menú");
            System.out.println("1. Múltiplos de 5.");
            System.out.println("2. Cuenta atras.");
            System.out.println("3. Salir.");

            entrada = sc.nextInt();

            switch (entrada) {
                case 1 -> {
                    do {
                        System.out.println("Introduzca un numero >5 para sacar múltiplos hasta el :");
                        numeroIntroducido = sc.nextInt();

                    } while (!(numeroIntroducido > 5));
                    System.out.print("Los múltiplos de 5 son : ");
                    for (int i = 5; i <= numeroIntroducido; i = i + 5) {
                        System.out.print(i + " ");
                    }

                }
                case 2 -> {
                    System.out.println("Introduce el primer número para la cuenta atrás :");
                    primerNumero = sc.nextInt();
                    System.out.println("Introduce el segundo número para la cuenta atras : ");
                    segundoNumero = sc.nextInt();

                    if (primerNumero == segundoNumero) {
                        System.out.println("Los numeros son iguales y no hay cuenta atras");
                    } else if (primerNumero > segundoNumero) {
                        System.out.print("Cuenta atras desde " + primerNumero + " a  " + segundoNumero + " :");
                        for (int i = primerNumero; i > segundoNumero; i--) {
                            System.out.print(i + " ");
                        }

                    } else {
                        System.out.print("Cuenta atras desde " + segundoNumero + " a  " + primerNumero + " :");
                        for (int i = segundoNumero; i > primerNumero; i--) {
                            System.out.print(i + " ");
                        };

                    }
                }


            }

        }while (entrada != 3) ;
    }

}
