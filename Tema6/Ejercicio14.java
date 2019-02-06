public class Ejercicio14 {
    public Ejercicio14() {
        int m;
        int n;
        System.out.println("Introduce dos numeros: ");
        m = Main.lector.nextInt();
        Main.lector.nextLine();
        n = Main.lector.nextInt();
        Main.lector.nextLine();
        System.out.println(combinatorio(m, n));
    }

    public static long combinatorio(int a, int b) {
        return factorial(a) / (factorial(b) * factorial(a - b));
    }

    public static long factorial(int a) {
        long factorial = 1;
        for (int i = a; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }
}