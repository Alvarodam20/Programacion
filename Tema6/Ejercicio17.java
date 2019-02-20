public class Ejercicio17 {
    public Ejercicio17() {
        char simbolo;
        int num1;
        int num2;
        System.out.println("Introduce un simbolo: ");
        simbolo = Main.lector.nextLine().charAt(0);
        System.out.println("Introduce el numero de ancho que va a ser: ");
        num1 = Main.lector.nextInt();
        System.out.println("Introduce el numero de alto que va a ser: ");
        num2 = Main.lector.nextInt();

        imprimir(num1, num2, simbolo);
    }

    public static void imprimir(int num1, int num2, char simbolo) {
        for (int i = 1; i <= num2; i++) {

            for (int j = 1; j <= num1; j++) {
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }
}