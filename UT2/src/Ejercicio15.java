import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Diseña una aplicación que muestre la edad mácima y minima de un grupo de alumnos. El usuariointroducira las edades y " +
                "terminara escribiendo un -1");

        int edad, edadMax, edadMin;
        edadMin = 100000;
        edadMax = 0;

        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Ingrese la edad de los alumnos para finalizar pon -1 ");
            edad = sc.nextInt();
            if (edad >= edadMax) {
                edadMax = edad;
            }
            if (edad <= edadMin && edad > 0) {
                edadMin = edad;


            }

        } while (edad != -1);


        System.out.println("El edad máxima es : " + edadMax);
        System.out.println("La edad minima es : " + edadMin);
    }
}
