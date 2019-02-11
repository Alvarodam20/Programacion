//ACABAR EJERCICIO !!!
public class Ejercicio15 {
    public Ejercicio15() {
        String larga1, larga2, larga3;
        String corta1, corta2, corta3;
        menu();
        switch (Main.lector.nextLine()) {

        case 1:
        System.out.println("Introduce 3 palabras: ");
        System.out.println("1º Palabra: ");
        larga1 = Main.lector.nextLine();
        System.out.println("2º Palabra: ");
        larga2 = Main.lector.nextLine();
        System.out.println("3º Palabra: ");
        larga3 = Main.lector.nextLine();
        palabraLarga();
        case 2:
        System.out.println("Introduce 3 palabras: ");
        System.out.println("1º Palabra: ");
        corta1 = Main.lector.nextLine();
        System.out.println("2º Palabra: ");
        corta2 = Main.lector.nextLine();
        System.out.println("3º Palabra: ");
        corta3 = Main.lector.nextLine();
        case 3: 
        System.out.println("");
        }

    }

    public static void menu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("===============");
        System.out.println("1. Palabra mas larga.");
        System.out.println("2. Palabra mas corta.");
        System.out.println("3. Numero de vocales.");
        System.out.println("---------------------");
        System.out.println("0. Salir");
    }
    
}