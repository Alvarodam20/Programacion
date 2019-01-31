public class Ejercicio9 {
    public Ejercicio9() {
        int num;
        System.out.print("Introduce un numero: ");
        num = Main.lector.nextInt();
        Main.lector.nextLine();
        System.out.println("El sumatorio de " + num + " es " + sumatorio(num));
    }

    public static int sumatorio(int n) {
        int suma = 0;
        for (int i = n; i >= 1; i--) {
            suma += i;
        }
        return suma;
    }
}