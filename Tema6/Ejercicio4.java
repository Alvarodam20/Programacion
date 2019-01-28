import java.util.Scanner;

public class Ejercicio4 {
    public Ejercicio4() {
        Scanner lector = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        System.out.print("Introduce el primer numero: ");
        num1 = lector.nextInt();
        lector.nextLine();
        System.out.print("Introduce el segundo numero: ");
        num2 = lector.nextInt();
        lector.nextLine();
        System.out.print("Introduce el tercer numero: ");
        num3 = lector.nextInt();
        lector.nextLine();
        System.out.print("Introduce el ultimo numero: ");
        num4 = lector.nextInt();
        lector.nextLine();
        System.out.println("El numero mas grande es: "+mayor(num1, num2, num3, num4));
    }
    public static int mayor(int a, int b, int c, int d) {
        if (a>b||a>c||a>d) {
            return a;
        }
        else if (b>a||b>c||b>d) {
            return b;
        }
        else if (c>a||c>b||c>d) {
            return c;
        }
        else {
            return d;
        } 
    }
}