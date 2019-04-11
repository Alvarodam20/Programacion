public class Ejercicio04 {
    public Ejercicio04() {
        String frase = "";
        System.out.println("Introduce una frase: ");
        frase = Main.lector.nextLine();
        deteccionVocalesConsonantes(frase);
    }

    public static void deteccionVocalesConsonantes(String frase) {
        String[] palabras = frase.split(" ");
        int contadorv = 0;
        int contadorc = 0;
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length(); j++) {
                if (palabras[i].charAt(j) == 'a' || palabras[i].charAt(j) == 'e' || palabras[i].charAt(j) == 'i' || palabras[i].charAt(j) == 'o' || palabras[i].charAt(j) == 'u' ||
                        palabras[i].charAt(j) == 'A' || palabras[i].charAt(j) == 'E' || palabras[i].charAt(j) == 'I' || palabras[i].charAt(j) == 'O' || palabras[i].charAt(j) == 'U') {
                    contadorv++;
                } else {
                    contadorc++;
                }
            }
            System.out.println("Hay " + contadorv + " vocales y " + contadorc + " consonantes en la palabra " + palabras[i]);
//          Pongo los contadores a 0 para que cuando pase de palabra no se sumen con las vocales y consonantes de la palabra anterior.
            contadorv = 0;
            contadorc = 0;
        }
    }
}