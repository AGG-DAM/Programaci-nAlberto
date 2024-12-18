import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        String palabra;
        for (int i = 0; i < casos; i++) {
            palabra = sc.next();
            if(palabra.toLowerCase().equals("colgadas"))
                System.out.println("Bien");
            else
                System.out.println("Mal");
        }
    }
}
