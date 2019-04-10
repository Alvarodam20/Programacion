//TODO Acabar actividad!!
public class Ejercicio02 {

    public Ejercicio02() {
        deteccionVocalesConsonantes();
    }

    public static void deteccionVocalesConsonantes() {
        String[] palabras = teclado().split(" ");
        int contadorv = 0;
        int contadorc = 0;
        //Este bucle mirará cada palabra.
        for (int i = 0; i <= palabras.length; i++) {
            //Este bucle mirará cada caracter de la palabra.
            for (int j = 0; j <= palabras[i].length(); j++) {
                switch (palabras[i].charAt(j)) {
                    case 'a':
                        contadorv++;
                    case 'e':
                        contadorv++;
                    case 'i':
                        contadorv++;
                    case 'o':
                        contadorv++;
                    case 'u':
                        contadorv++;
                    default:
                        contadorc++;
                }
            }
        }
        System.out.print("En total hay: " + contadorv + " vocales. \nY " + contadorc + " consonantes.");
    }

    public static String teclado() {
        String frase = "";
        System.out.println("Introduce una frase: ");
        return frase = Main.lector.nextLine();
    }
}