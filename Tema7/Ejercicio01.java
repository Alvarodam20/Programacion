//TODO Acabar ejercicio.
public class Ejercicio01 {
    public Ejercicio01() {
        frase();
    }

    public static String frase() {
        String frase;
        char letra;
        System.out.println("Introduce una frase: ");
        frase = Main.lector.nextLine();
        letra = frase.charAt(0);

        return frase;
    }
}