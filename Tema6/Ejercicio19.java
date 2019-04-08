public class Ejercicio19 {
    public Ejercicio19() {

    }

    public static String dni() {
        int num;
        System.out.println("Introduce tu dni: ");
        num = Main.lector.nextInt();
        String dniS = new String(Integer.toString(num));
        return dniS;
    }

    public static boolean comprobarDNI(String dniS) {
        String dniString = "";
        
    }

    public static  nif(String dniS) {
        int cambio = Integer.parseInt(dniS);
        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        int posicion = cambio % 23;
    }

}