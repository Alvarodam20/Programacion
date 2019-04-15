public class Ejercicio09 {
    public Ejercicio09() {
        String frase;
        System.out.println("Introduce una frase: ");
        frase = Main.lector.nextLine();
        fraseImpresa(frase);
    }

    public static void fraseImpresa(String frase) {
        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length(); j++) {
                if (j % 2 == 1) {
                    System.out.println(palabras[i].charAt(j));
                }else {
                    System.out.print("");
                }
            }
        }
    }
}