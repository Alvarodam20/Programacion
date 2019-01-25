import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        float radio;
        float pi = 3.14f;
        System.out.print("Escribe el radio de la circunferencia: ");
        radio = lector.nextFloat();
        lector.nextLine();
        System.out.println("El area de la circunferencia es: " + area(pi, radio));
        System.out.println("La longitud de la circunferencia es: " + longitud(pi, radio));
    }

    public static float area(float pi, float r) {
        float area = pi * r * r;
        return area;
    }

    public static float longitud(float pi, float r) {
        float longitud = 2 * pi * r;
        return longitud;
    }
}