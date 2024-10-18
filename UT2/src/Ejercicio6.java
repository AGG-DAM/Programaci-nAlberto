import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 numeros para mostrarlos ordenados de menor a mayor");
        System.out.println("Introduce el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero: ");
        num3 = sc.nextInt();
        if (num1 >= num2 && num1 >= num3 && num2 >= num3) {
            System.out.println(num1+">"+num2+">"+num3);
        }else if (num1 >= num2 && num1 >= num3 && num3 >= num2){
            System.out.println(num1+">"+num3+">"+num2);
        }else if (num2 >= num1 && num2 >= num3 && num1 >= num3) {
            System.out.println(num2+">"+num1+">"+num3);
        }else if (num2 >= num1 && num2 >= num3 && num3 >= num1) {
            System.out.println(num2+">"+num3+">"+num1);
        }else if (num3 >= num1 && num3 >= num2 && num1 >= num2) {
            System.out.println(num3+">"+num1+">"+num2);
        }else{
            System.out.println(num3+">"+num2+">"+num1);
        }
    }
}
