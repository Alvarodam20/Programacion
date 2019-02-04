public class Ejercicio12 {
    public Ejercicio12() {

        for (int i = 1; i <= 50; i++) {
            float calificacion = aleatorio(0, 10);
            System.out.printf("%.2f", calificacion);
        }
    }

    public static float aleatorio(float min, float max) {
        //Se puede hacer return directamente con la operacion.
        return Main.rnd.nextFloat() * (max - min) + min;
    }

    public static String notaAbc(float num) {
        String calificacion = "La calificacion no es valida";
        if (num >= 0 && num <= 5) {
            return "INSUFICIENTE";
        } else if (num >= 5 && num <= 6) {
            return "SUFICIENTE";
        } else if (num >= 6 && num <= 7) {
            return "BIEN";
        } else if (num >= 7 && num <= 9) {
            return "NOTABLE";
        } else if (num > 9 && num <= 10) {
            return "EXCELENTE";
        } else {
            return calificacion;
        }
    }
}