//TODO Acabar actividad!!
public class Ejercicio02 {

    public Ejercicio02() {
        System.out.println(deteccionVocalesConsonantes());
    }

    public static int deteccionVocalesConsonantes() {
        String[] palabras = teclado().split(" ");
        int contador = 0;
        //Este bucle mirará cada palabra.
        for (int i = 0; i <= palabras.length; i++) {
            //Este bucle mirará cada caracter de la palabra.
            for (int j = 0; j <= palabras[i].length(); j++) {
                if (palabras[i].charAt(j) == 'a' || palabras[i].charAt(j) == 'e' || palabras[i].charAt(j) == 'i' || palabras[i].charAt(j) == 'o' || palabras[i].charAt(j) == 'u') {
                    contador++;
                    System.out.println("En total hay: " + contador);
                } else {
                    contador++;
                    System.out.println("En total hay: " + contador);
                }
            }
        }
        return contador;
    }

    public static String teclado() {
        String frase = "";
        System.out.println("Introduce una frase: ");
        return frase = Main.lector.nextLine();
    }
}