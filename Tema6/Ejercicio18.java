//TODO Acabar Ejercicio!!
public class Ejercicio18 {
    public Ejercicio18() {
        nif();
    }

    public static void dni() {
        int num;
        String dni;
        System.out.println("Introduce tu dni: ");
        num = Main.lector.nextInt();
        Main.lector.nextLine();
        dni = num;
    }

    public static void nif() {
        dni();
        int puntero;
        for (int i = puntero; i <= dni.length(); i++) {
            if (i > dni.length()) {
                char nif = "a";
                System.out.println(dni+""+nif);
            }
        }
    }
}