public class Ejercicio13 {
    public Ejercicio13() {
        String nombre;
        int idioma;

        System.out.println("Introduce tu nombre: ");
        nombre = Main.lector.nextLine();
        System.out.println("1. Castellano");
        System.out.println("2. Valenciano");
        System.out.println("3. Inglés");
        System.out.println("Selecciona el idioma: ");
        idioma = Main.lector.nextInt();
        Main.lector.nextLine();

        System.out.println(idioma(idioma) + " " + nombre);

    }

    public static String idioma(int idioma) {
        switch (idioma) {
            case 1:
                return "Buenos dias";
            case 2:
                return "Bon dia";
            case 3:
                return "Good morning";
            default:
                return "";
        }
    }
}