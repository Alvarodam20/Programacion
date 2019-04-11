//TODO Acabar actividad!!
public class Ejercicio02 {

    public Ejercicio02() {
        salida();
    }

    public static int deteccionVocales() {
        String[] palabras = teclado().split(" ");
        int contadorv = 0;
        //Este bucle mirará cada palabra.
        for (int i = 0; i < palabras.length; i++) {
            //Este bucle mirará cada caracter de la palabra.
            for (int j = 0; j < palabras[i].length(); j++) {
                if (palabras[i].charAt(j) == 'a' || palabras[i].charAt(j) == 'e' || palabras[i].charAt(j) == 'i' || palabras[i].charAt(j) == 'o' || palabras[i].charAt(j) == 'u') {
                    contadorv++;
                }
            }
        }
        return contadorv;
    }

    public static int deteccionConsonantes() {
        String[] palabras = teclado().split(" ");
        int contadorc = 0;
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length(); j++) {
                if (palabras[i].charAt(j) != 'a' || palabras[i].charAt(j) != 'e' || palabras[i].charAt(j) != 'i' || palabras[i].charAt(j) != 'o' || palabras[i].charAt(j) != 'u') {
                    contadorc++;
                }else if (palabras[i].charAt(j) == 'a' || palabras[i].charAt(j) == 'e' || palabras[i].charAt(j) == 'i' || palabras[i].charAt(j) == 'o' || palabras[i].charAt(j) == 'u'){
                    contadorc--;
                }
            }
        }
        return contadorc;
    }

    public static void salida() {
        System.out.println("En total hay " + deteccionVocales() + " vocales.");
        System.out.println("En total hay " + deteccionConsonantes() + " consonantes.");
    }

    public static String teclado() {
        String frase = "";
        System.out.println("Introduce una frase: ");
        return frase = Main.lector.nextLine();
    }
}