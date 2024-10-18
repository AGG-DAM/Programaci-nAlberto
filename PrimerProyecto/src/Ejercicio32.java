import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        boolean llueve, tareas, biblioteca;
        String decision;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Esta lloviendo? (True/False) ");
        llueve = sc.nextBoolean();
        System.out.println("¿Has terminado las tareas? (True/False)  ");
        tareas = sc.nextBoolean();
        System.out.println("¿Tienes que ir a la biblioteca? (True/False)  ");
        biblioteca = sc.nextBoolean();
        decision = (!llueve && tareas) || biblioteca ? "Puedes salir a la calle" : "No puedes salir al a calle";
        System.out.println(decision);


    }
}
