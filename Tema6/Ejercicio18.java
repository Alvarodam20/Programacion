public class Ejercicio18 {
    public Ejercicio18() {
        nif(dni());
    }

    public static String dni() {
        int num;
        System.out.println("Introduce tu dni: ");
        num = Main.lector.nextInt();
        String dniS = new String(Integer.toString(num));
        return dniS;
    }

    public static void nif(String dniS) {
        int cambio = Integer.parseInt(dniS);
        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        int posicion = cambio % 23;
        System.out.println("La letra correspondiente es: " + letra.charAt(posicion));
        System.out.println(dniS + letra.charAt(posicion));
    }
}