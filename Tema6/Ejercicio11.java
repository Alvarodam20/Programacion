public class Ejercicio11 {
    //Pongo aqui las variables para que a la hora de modificar los valores se modifiquen en toda la clase.
    public static final int perder = 1;
    public static final int ganar = 2;
    public static final int x = 3;

    public Ejercicio11() {

        for (int i = 1; i <= 15; i++) {
            //El "%4s" significa que dará 4 espacios de distancia.
            //El "%02d" significa que pondra un 0 adelante de las cifras menores que 10.
            System.out.printf("Partido%02d %4s\n", i, quiniela());
        }
    }

    public static int aleatorio(int min, int max) {
        //Se puede hacer return directamente con la operacion.
        return Main.rnd.nextInt(max - min + 1) + min;
    }

    public static String quiniela() {
        int resultado = aleatorio(1, 3);
        switch (resultado) {
            case perder:
                return "1";
            case ganar:
                return "2";
            case x:
                return "X";
            default:
                return "";
        }

    }
}