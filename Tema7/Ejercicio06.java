public class Ejercicio06 {
    public Ejercicio06() {
        int veces;
        String frase;
        System.out.println("Introduce una frase: ");
        frase = Main.lector.nextLine();
        System.out.println("Ahora introduce las veces que quieres imprimir la frase: ");
        veces = Main.lector.nextInt();
        Main.lector.nextLine();
        fraseImpresa(frase,veces);
    }

    public static void fraseImpresa(String frase, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(frase);
        }
    }
}