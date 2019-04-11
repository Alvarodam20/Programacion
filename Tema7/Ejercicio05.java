public class Ejercicio05 {
    public Ejercicio05() {
        String frase = "";
        System.out.println("Introduce una frase: ");
        frase = Main.lector.nextLine();
        palabras(frase);
    }

    public static void palabras(String frase) {
        String[] palabra = frase.split(" ");
        int palabraLarga = 0;
        int maximo = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length() > maximo) {
                maximo = palabra[i].length();
                palabraLarga = i;
            }
        }
        System.out.println("La palabra mas larga es: " + palabra[palabraLarga]);
        System.out.println("Contiene " + maximo + " caracteres.");
    }
}