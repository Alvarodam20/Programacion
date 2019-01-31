import java.util.Scanner;

public class Ejercicio5 {
    public static
        Scanner lector = new Scanner(System.in);
        char letra;
        int veces;
        System.out.println("Introduce una letra: ");
        //Con la siguiente linea solo cojo la letra de la primera posicion.
        letra = lector.nextLine().charAt(0);
        System.out.println("Introduce las veces que quieres repetir la letra: ");
        veces = lector.nextInt();
        lector.nextLine();
        vecesRepetidas(veces, letra);
    }

    public static void vecesRepetidas(int veces, char a) {
        for (int i = 1; i <= veces; i++) {
            System.out.print(a);
        }
        System.out.println();
    }
}