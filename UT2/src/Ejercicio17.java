import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        /*Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo. Se introducirán datos
        hasta que uno de ellos sea negativo, y se mostrará: la suma de todas las edades introducidas, la media, el número de alumnos y cuantos
        son mayores de edad
         */

        int edad, sumEdad, mediaEdad, numAlumnos, numMayorEdad, i;
        edad = 0;
        numAlumnos = 0;
        sumEdad = 0;
        numMayorEdad = 0;
        mediaEdad = 0;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Ingrese edad del alumno ");
            edad = sc.nextInt();
            if (edad >= 0) {
                numAlumnos++;

                sumEdad = sumEdad + edad;
                mediaEdad = sumEdad / numAlumnos;
                if (edad >= 18) {
                    numMayorEdad++;
                }

            }

        } while (edad >= 0);
        System.out.println("La suma de edad es: " + sumEdad);
        System.out.println("La media de edad es: " + mediaEdad);
        System.out.println("El numero de alumnos es: " + numAlumnos);
        System.out.println("Los alumnos mayores de edad son : " + numMayorEdad);

    }
}
