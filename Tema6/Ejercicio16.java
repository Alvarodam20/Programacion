public class Ejercicio16 {
    public Ejercicio16() {
        char c;
        int num;
        System.out.println("Introduce el numero a sustituir: ");
        num = Main.lector.nextInt();
        Main.lector.nextLine();
        System.out.println("Introduce la letra que lo va a sustituir: ");
        c = Main.lector.nextLine().charAt(0);
        imprimir(num, c);
    }

    public static void imprimir(int num, char c) {
        char ca, cb, cc, cd;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        ca = i == num ? c : String.valueOf(i).charAt(0);
                        cb = j == num ? c : String.valueOf(j).charAt(0);
                        cc = k == num ? c : String.valueOf(k).charAt(0);
                        cd = l == num ? c : String.valueOf(l).charAt(0);
                        System.out.println(+ca + " - " + cb + " - " + cc + " - " + cd);
                    }
                }
            }
        }
    }
}