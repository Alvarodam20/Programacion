import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Introduce un numero: ");
        num1 = lector.nextInt();
        lector.nextLine();
        System.out.print("Introduce otro numero: ");
        num2 = lector.nextInt();
        lector.nextLine();
        System.out.println("El numero mas grande es: "+mayor(num1, num2));
    }
    public static int mayor(int a, int b) {
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
}