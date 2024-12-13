import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entradaSwitch =0, contadorPassword =0;
        double precio =0, precioTotal =0;
        final String password = "dam2024";
        String passswordIntroducida;

        do {
            System.out.println("Introduce la contraseña ");
            passswordIntroducida= sc.nextLine();
            contadorPassword ++;

        } while( (contadorPassword < 3 ) && !(passswordIntroducida.equals(password)) );

        if ( passswordIntroducida.equals(password)) {

            System.out.println("Bienvenido a registrador 2024: ");
            do {
                System.out.println("1- Para introducir el precio de un producto.");
                System.out.println("2- Para introducir el precio de varios productos ( -1 para parar de introducir precios).");
                System.out.println("3- Para calcular el IVA total de los productos introducidos.");
                System.out.println("4- Para calcular el total de los productos introducidos y salir");
                try {
                    entradaSwitch = sc.nextInt();


                    switch (entradaSwitch) {
                        case 1 -> {
                            boolean correcto = false;
                            do {

                                try {
                                    System.out.println("Introduce el precio del producto: ");
                                    precio = sc.nextDouble();

                                    if (precio > 0) {
                                        precioTotal += precio;
                                        correcto = true;
                                    } else {
                                        System.out.println("El precio no puede ser menor que 0");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Error, el dato introducido no es valido");
                                    sc.nextLine();
                                }
                            } while (!correcto);

                        }
                        case 2 -> {
                            boolean correcto = false;
                            do {

                                try {
                                    System.out.println("Introduce el precio del producto: ");
                                    precio = sc.nextDouble();

                                    if (precio > 0) {
                                        precioTotal += precio;
                                        correcto = true;
                                    } else {
                                        System.out.println("El precio no puede ser menor que 0");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Error, el dato introducido no es valido");
                                    sc.nextLine();
                                }
                            } while (!correcto || precio != -1);
                        }
                        case 3 -> {
                            double iva;
                            iva = (precioTotal * 21) / 100;
                            System.out.printf("IVA total : %.2f \n", iva);
                        }
                        case 4 -> {
                            System.out.printf("El total de los productos introducidos : %.2f", precioTotal);
                            break;
                        }
                    }
                }catch (InputMismatchException e){
                    System.out.println("Error, no has introducido el valor del menu correcto");
                    sc.nextLine();
                }

                } while (entradaSwitch != 4) ;

        }else {
            System.out.println("Demasiados intentos erroneos");
        }

    }
}

