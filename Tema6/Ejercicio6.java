public class Ejercicio6 {
    public Ejercicio6() {
        char letra;
        int linea;
        int fila;
        System.out.println("Introduce una letra: ");
        letra = Main.lector.nextLine().charAt(0);
        System.out.println("Introduce las veces que se va a repetir en la linea: ");
        linea = Main.lector.nextInt();
        Main.lector.nextLine();
        System.out.println("Introduce la cantidad de lineas que se van a repetir: ");
        fila = Main.lector.nextInt();
        Main.lector.nextLine();
        vecesimpreso(letra, linea, fila);
    }

    public static void vecesimpreso(char letra, int linea, int fila) {
        for (int i = 1; i <= fila; i++) {
            for (int j = 1; j <= linea; j++) {
                System.out.print(letra);
            }
            System.out.println();
        }
    }
}