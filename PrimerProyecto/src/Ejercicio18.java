import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        int hormigas,aranas,cochinillas,totalPatas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de hormigas");
        //se pide el numero de hormigas como entrada y se multiplica por 6 patas , se guarda en variable el numero de patas de las hormigas;
        hormigas = sc.nextInt()*6;
        //se pide el numero de aranas como entrada y se multiplica por 8 patas , se guarda en variable el numero de patas de las aranas;
        System.out.println("Ingrese el numero de aranas");
        aranas = sc.nextInt()*8;
        //se pide el numero de cochinillas como entrada y se multiplica por 14 patas , se guarda en variable el numero de patas de las cochinillas;
        System.out.println("Ingrese el numero de cochinillas");
        cochinillas = sc.nextInt()*14;
        //se suman las patas totales de todos los tipos de insectos
        totalPatas = hormigas + aranas + cochinillas;
        //se muestra el numero total de patas de todos los insectos
        System.out.println("El total de patas es: "+totalPatas);



    }
}
