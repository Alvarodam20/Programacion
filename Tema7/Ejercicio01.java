
public class Ejercicio01 {
    public Ejercicio01() {
        System.out.println(frase());
    }

    public static String frase() {
        String frase = "";
        char letra;
        StringBuilder builder = new StringBuilder();
        System.out.println("Introduce una frase: ");
        frase = Main.lector.nextLine();
        letra = Character.toUpperCase(frase.charAt(0));
        builder = builder.append(letra).append(frase.substring(1,frase.length()));
        return builder.toString();
    }
}