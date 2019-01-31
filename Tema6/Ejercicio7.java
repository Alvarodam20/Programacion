public class Ejercicio7 {
    public Ejercicio7() {
        int num;
        System.out.println("Introduce un numero: ");
        num = Main.lector.nextInt();
        Main.lector.nextLine();
        System.out.println("El factorial de " + num + " es " + factorial(num));
    }

    public static long factorial(int a) {
        long factorial = 1;
        for (int i = a; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }
}