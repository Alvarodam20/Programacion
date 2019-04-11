public class Ejercicio03 {
    public Ejercicio03() {
        String frase = "";
        System.out.println("Introduce una frase: ");
        frase = Main.lector.nextLine();
        palabras(frase);
    }

    public static void palabras(String frase) {
        String[] palabras = frase.split(" ");
        int contador = 0;
        for (int i = 0; i < palabras.length; i++) {
            contador++;
        }
        if (contador == 1) {
            System.out.println("En total tiene " + contador + " palabra.");
        }else {
            System.out.println("En total tiene " + contador + " palabras.");
        }
    }
}