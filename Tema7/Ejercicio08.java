public class Ejercicio08 {
    public Ejercicio08() {
        String frase;
        System.out.println("Introduce una frase: ");
        frase = Main.lector.nextLine();
        fraseImpresa(frase);
    }

    public static void fraseImpresa(String frase) {
        String[] palabras = frase.split(" ");
        int contador = 0;
        for (int i = 0; i < palabras.length; i++) {
            for (int j= 0; j< palabras[i].length(); j++) {
                contador++;
            }
            System.out.println(palabras[i]+" "+ contador);
            contador = 0;
        }
    }
}