package Fechas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);


        /*
        FORMATOS DE FECHA MORE INFORMATION : simpleDateFormat java 11 in google

        dd -> dia
        MM -> # mes
        MMMM -> nombre del mes
        yyyy -> año

        ej:  - "dd-MM * yyyy"
             - "yyyy.MM.dd G 'at' HH:mm:ss z"
             - "dd MMMM - yyyy"

         segun la cantidad de cacracteres va mostrando el valor
         E -> mar
         EEEE -> martes

         */

        SimpleDateFormat val = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");


        //Inicializamos una variable donde guardamos la fecha formateada
        // llamando al metodo format() y pasandole como argumento la fecha
        String fechaFormateada = val.format(fecha);
        System.out.println("fechaFormateada = " + fechaFormateada);


        // Method getTime -> return el time in misiseconds
        Date fecha1 = new Date();

        long j = 0;
        for (int i = 0; i < 1000000; i++){
            j += i;
        }

        Date fecha2 = new Date();
        
        long tiempoTranscurrido = fecha2.getTime() - fecha1.getTime();
        System.out.println("tiempoTranscurrido = " + tiempoTranscurrido);

    }

}
