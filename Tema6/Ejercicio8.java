//ACABAR EJERCICIO!!!!
public class Ejercicio8 {
    public Ejercicio8() {
        int num1, num2, num3, num4;
        boolean valido;
        do {
            System.out.println("Primer numero: ");
            num1 = Main.lector.nextInt();
            Main.lector.nextLine();
            valido = num1 >= 0 && num1 <= 9;
            if (!valido) {
                System.out.println("Solo numeros de 0 a 9");
            }
        }
        do {
            System.out.println("Segundo numero: ");
            num2 = Main.lector.nextInt();
            Main.lector.nextLine();
            valido = num2 >= 0 && num2 <= 9;
            if (!valido) {
                System.out.println("Solo numeros de 0 a 9");
            }
        }
        do {
            System.out.println("Tercer numero: ");
            num3 = Main.lector.nextInt();
            Main.lector.nextLine();
            valido = num3 >=0 && num3 <= 9;
            if (!valido) {
                System.out.println("Solo numeros de 0 a 9");
            }
        }
        do {
            System.out.println("Cuarto numero: ");
            num4 = Main.lector.nextInt();
            Main.lector.nextInt();
            valido = num4 >= 0 && num4 <= 9;
            if (!valido) {
                System.out.println("Solo numeros de 0 a 9");
            }
        }while (!valido);
    }
    public static boolean capicua(int a, int b, int c, int d) {
        if (n1 == n4 && n2 == n3) {
            return;
        }
    }
}