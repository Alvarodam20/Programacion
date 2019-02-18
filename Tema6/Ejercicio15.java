public class Ejercicio15 {
    public Ejercicio15() {
        String palabra1, palabra2, palabra3;
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {

                case 1:
                    System.out.print("Primera palabra: ");
                    palabra1 = Main.lector.nextLine();
                    System.out.print("Segunda palabra: ");
                    palabra2 = Main.lector.nextLine();
                    System.out.print("Tercera palabra: ");
                    palabra3 = Main.lector.nextLine();
                    System.out.println("La palabra mas larga de "+palabra1+" "+palabra2+" "+palabra3+" es "+masLarga(palabra1,palabra2,palabra3));
                    break;
                case 2:
                    System.out.print("Primera palabra: ");
                    palabra1 = Main.lector.nextLine();
                    System.out.print("Segunda palabra: ");
                    palabra2 = Main.lector.nextLine();
                    System.out.print("Tercera palabra: ");
                    palabra3 = Main.lector.nextLine();
                    System.out.println("La palabra mas corta de "+palabra1+" "+palabra2+" "+palabra3+" es "+masCorta(palabra1,palabra2,palabra3));
                    break;
                case 3:
                    System.out.println("Introduce una palabra: ");
                    palabra1 = Main.lector.nextLine();
                    System.out.println("La palabra " + palabra1 + " tiene " + cuentaVocales(palabra1) + " vocales");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;

            }
            if (opcion != 0) {
                System.out.println("Presiona INTRO para continuar ...");
                Main.lector.nextLine();
            }
            borrarPantalla();
        } while (opcion != 0);

    }

    public static int menu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("===============");
        System.out.println("1. Palabra mas larga.");
        System.out.println("2. Palabra mas corta.");
        System.out.println("3. Numero de vocales.");
        System.out.println("---------------------");
        System.out.println("0. Salir");
        System.out.println("Elige una opcion: ");
        return Integer.parseInt(Main.lector.nextLine());
    }

    public static void borrarPantalla() {
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
    }

    public static String masLarga(String s1, String s2, String s3) {
        String m1 = masLarga(s1, s2);
        return masLarga(m1, s3);
    }

    public static String masLarga(String s1, String s2) {
        return s1.length() > s2.length() ? s1 : s2;
    }

    public static String masCorta(String s1, String s2, String s3) {
        String m1 = masCorta(s1, s2);
        return masCorta(m1, s3);
    }

    public static String masCorta(String s1, String s2) {
        return s1.length() < s2.length() ? s1 : s2;
    }

    public static int cuentaVocales(String s) {
        int contador = 0;
        String aux = s.toLowerCase();
        for (int i = 0; i < aux.length(); i++) {
            char c = aux.charAt(i);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++;
            }
        }
        return contador;
    }

}