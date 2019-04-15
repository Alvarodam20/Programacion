public class Ejercicio07 {
    public Ejercicio07()  {
        String frase;
        System.out.println("Introduce una frase: ");
        frase = Main.lector.nextLine();
        fraseImpresa(frase);
    }

    public static void fraseImpresa(String frase) {
        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
}