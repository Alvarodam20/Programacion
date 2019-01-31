public class Ejercicio10 {
    public Ejercicio10() {
        int n;
        System.out.print("Introduce un numero: ");
        n = Main.lector.nextInt();
        Main.lector.nextLine();
        tablas(n);
    }

    public static int tablas(int a) {
        int tablas = 0;
        if (a > 0) {
            for (int i = tablas; i <= 10; i++) {
                tablas = i;
                tablas *= a;
                System.out.println(a + " * " + i + " = " + tablas);
            }
        }else {
            System.out.println("ERROR!!\nEl programa no admite numeros negativos.");
        }

        return tablas;
    }
}