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
        }while (!valido);
        do {
            System.out.println("Segundo numero: ");
            num2 = Main.lector.nextInt();
            Main.lector.nextLine();
            valido = num2 >= 0 && num2 <= 9;
            if (!valido) {
                System.out.println("Solo numeros de 0 a 9");
            }
        }while (!valido);
        do {
            System.out.println("Tercer numero: ");
            num3 = Main.lector.nextInt();
            Main.lector.nextLine();
            valido = num3 >=0 && num3 <= 9;
            if (!valido) {
                System.out.println("Solo numeros de 0 a 9");
            }
        }while (!valido);
        do {
            System.out.println("Cuarto numero: ");
            num4 = Main.lector.nextInt();
            Main.lector.nextLine();
            valido = num4 >= 0 && num4 <= 9;
            if (!valido) {
                System.out.println("Solo numeros de 0 a 9");
            }
        }while (!valido);
        if ( capicua(num1,num2,num3,num4)== true) {
            System.out.println("Los numeros "+num1 +num2 +num3 +num4+" son capicua.");
        }else {
            System.out.println("Los numeros "+num1 +num2 +num3 +num4+" no son capicua.");
        }
    }
    public static boolean capicua(int a, int b, int c, int d) {
        return a == d && c == b;
    }
}