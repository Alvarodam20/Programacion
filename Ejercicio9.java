import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        String ciudad;
        //Tabulacion
        int tab=23;
        //Fecha
        int fechaDia;
        int fechaMes;
        int fechaAny;
        //Hora
        int horaSeg;
        int horaMin;
        int hora;
        int viento;
        float temp;
        float presion;
        int probabilidad;
        int uvi;
        Scanner lector = new Scanner(System.in);
        
        //Ciudad
        System.out.println("Introduce la ciudad deseada: ");
        ciudad = lector.nextLine();
        
        //Fecha 
        do {
            System.out.println("Introduce el dia: ");
            fechaDia = lector.nextInt();
            lector.nextLine();
            if (fechaDia<=0||fechaDia>31){
                System.out.println("ERROR\nVuelve a introducir el dia");
            }
        }while (fechaDia<=0||fechaDia>31);
        do{
            System.out.println("Introduce el mes: ");
            fechaMes = lector.nextInt();
            lector.nextLine();
            if (fechaMes<=0||fechaMes>12){
                System.out.println("ERROR\nVuelve a introducir el mes");
            }
        }while (fechaMes<=0||fechaMes>12);
        do {
            System.out.println("Introduce el año: ");
            fechaAny = lector.nextInt();
            lector.nextLine();
            if (fechaAny<=2014||fechaAny>2018){
                System.out.println("ERROR\nVuelve a introducir el año");
            }
        }while (fechaAny<=2014||fechaAny>2018);

        //Hora de la medida
        do {
            System.out.println("Introduce la hora: ");
            hora = lector.nextInt();
            lector.nextLine();
            if (hora>23) {
                System.out.println("ERROR\nVuelve a introducir la hora");
            }
        }while (hora>23);
        do {
            System.out.println("Introduce los minutos: ");
            horaMin = lector.nextInt();
            lector.nextLine();
            if (horaMin<=0||horaMin>60) {
                System.out.println("ERROR\nVuelve a introducir los minutos");
            }
        }while (horaMin<=0||horaMin>60);
        do {
            System.out.println("Introduce los segundos: ");
            horaSeg = lector.nextInt();
            lector.nextLine();
            if (horaSeg<=0||horaSeg>60) {
                System.out.println("ERROR\nVuelve a introducir los segundos");
            }
        }while (horaSeg<=0||horaSeg>60);

        //Velocidad del viento
        do {
            System.out.println("Introduce la velocidad del viento: ");
            viento = lector.nextInt();
            lector.nextLine();
            if (viento<0) {
                System.out.println("ERROR\nVuelve a introducir la velocidad del viento");
            }
        }while (viento<0);
        
        //La temperatura
        do {
            System.out.println("Introduce la temperatura: ");
            temp = lector.nextFloat();
            lector.nextLine();
            if (temp<-273||temp>10000) {
                System.out.println("ERROR\nVuelve a introducir la temperatura");
            }
        }while (temp<-273||temp>10000);

        //La presion atmosferica
        do {
            System.out.println("Introduce la presion atmosferica: ");
            presion = lector.nextFloat();
            lector.nextLine();
            if (presion<900) {
                System.out.println("ERROR\nVuelve a introducir la presion atmosferica\n Presion demasiado baja");
            }
            if (presion>1100) {
                System.out.println("ERROR\nVuelve a introducir la presion atmosferica\n Presion demasiado alta");
            }
        }while (presion<900||presion>1100);

        //Probabilidad de lluvia
        do {
            System.out.println("Introduce la probabilidad de lluvia: ");
            probabilidad = lector.nextInt();
            lector.nextLine();
            if (probabilidad<0||probabilidad>100){
                System.out.println("ERROR\nVuelve a introducir la probabilidad de lluvia");
            }
        }while (probabilidad<0||probabilidad>100);
        
        //Index de radiacion ultravioleta
        do {
            System.out.println("introduce el index de UVI: ");
            uvi = lector.nextInt();
            lector.nextLine();
            if (uvi<1) {
                System.out.println("ERROR\nVuelve a introducir el index de UVI");
            }
        }while (uvi<1);

        //SALIDA

        //Titulo
        System.out.printf("\u001B[1;37;44m **DATOS ESTACION METEOROLOGIA** \u001B[0m \n");

        //Ciudad
        System.out.printf("%-"+tab+"s","Ciudad:");
        System.out.println(" "+ciudad);

        //Fecha
        System.out.printf("%-"+tab+"s","Fecha:");
        System.out.printf(" %02d/%02d/%d\n",fechaDia,fechaMes,fechaAny);

        //Hora
        System.out.printf("%-"+tab+"s","Hora:");
        System.out.printf(" %02d:%02d:%02d\n",hora,horaMin,horaSeg);

        //Velocidad viento
        System.out.printf("%-"+tab+"s","Velocidad del viento:");
        if(viento<30){
            System.out.printf("\u001B[1;32m %sKm/h \u001B[0m\n",viento);
        }else if(viento>=30 && viento<=60){
            System.out.printf("\u001B[1;33m %sKm/h \u001B[0m\n",viento);
        }else{
            System.out.printf("\u001B[1;31m %sKm/h \u001B[0m\n",viento);
        }
        
        //Temperatura
        System.out.printf("%-"+tab+"s","Temperatura:");
        if(temp<22){
            System.out.printf("\u001B[1;34m %.2fºC \u001B[0m\n",temp);
        }else if(temp>=22 && temp<=27){
            System.out.printf("\u001B[1;32m %.2fºC \u001B[0m\n",temp);
        }else if(temp>27 && temp<=35){
            System.out.printf("\u001B[1;33m %.2fºC \u001B[0m\n",temp);
        }else{
            System.out.printf("\u001B[1;31m %.2fºC \u001B[0m\n",temp);
        }

        //Presion atmosferica
        System.out.printf("%-"+tab+"s","Presion atmosferica:");
        System.out.printf(" %.1f \n",presion);

        //Probabilidad de lluvia
        System.out.printf("%-"+tab+"s","Probabilidad de lluvia:");
        if(probabilidad<35){
            System.out.printf("\u001B[1;32m %d \u001B[0m\n",probabilidad);
        }else if(probabilidad>=35 && probabilidad<=70){
            System.out.printf("\u001B[1;33m %d \u001B[0m\n",probabilidad);
        }else{
            System.out.printf("\u001B[1;31m %d \u001B[0m\n",probabilidad);
        }
        
        //UVI
        System.out.printf("%-"+tab+"s","UVI:");
        if(uvi<=2){
            System.out.printf("\u001B[1;32m %d \u001B[0m\n",uvi);
        }else if(uvi>=3 && uvi<=5){
            System.out.printf("\u001B[1;34m %d \u001B[0m\n",uvi);
        }else if(uvi>=6 && uvi<=7){
            System.out.printf("\u001B[1;33m %d \u001B[0m\n",uvi);
        }else if(uvi>=8 && uvi<=10){
            System.out.printf("\u001B[1;31m %d \u001B[0m\n",uvi);
        }else{
            System.out.printf("\u001B[1;35m %d \u001B[0m \n",uvi);
        }
    }
}