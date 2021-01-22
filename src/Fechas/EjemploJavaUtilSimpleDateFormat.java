package Fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilSimpleDateFormat {

    public static void main(String[] args) {


        SimpleDateFormat optionFormat = new SimpleDateFormat("yyyy-MM-dd");

        //Pasar un String a una Date
        try {
            Date fecha = optionFormat.parse ("2020-01-23");
            System.out.println("fecha = " + fecha);
            System.out.println("Format: " + optionFormat.format(fecha));

            Date fecha2 = new Date();

            // Comparar fechas, si la fecha esta despues o antes
            if(fecha.after(fecha2)){
                System.out.println("Fecha1 es mayor que la fecha2");
            }else if(fecha.before(fecha2)){ //Fecha 1 esta anterior que fecha2
                System.out.println("Fecha 1 es anterior que la fecha2");
            }else if(fecha.equals(fecha2)){ // Son iguales
                System.out.println("Las fechas son iguales");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
