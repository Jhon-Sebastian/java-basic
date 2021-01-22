package Fechas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {

    public static void main(String[] args) {

        //No se puede instancia como una clase normal ya que es abstracta
        // por lo tanto lo hace por debajo -> por lo tanto se usa el method static para hacer la instancia
        Calendar calendario = Calendar.getInstance();

        //Si queremos ingresar una fecha en especifica -> el mes inicia en 0 -> (0 == enero)
        // si no ponemos el set la fecha actual sera la de por defecto , ademas el metodo set esta
        //     calendario.set(2020,0,26);
               calendario.set(2020,0,26, 19,20,10);


        //Tambien hay otra opcion en el que podemos asignar la llave y valor como en el Map
        calendario.set(Calendar.YEAR,  2020);
        calendario.set(Calendar.MONTH,  2);
        calendario.set(Calendar.DAY_OF_MONTH,  23);
        calendario.set(Calendar.HOUR, 12); //Hora de 0 a 12
        // calendario.set(Calendar.HOUR_OF_DAY, 12); //Hora 0 ->(0 == 12 p.m.) formato 24 hrs
        calendario.set(Calendar.AM_PM, Calendar.AM); //Indicar si es pm o am

        // calendario.set(2020,Calendar.SEPTEMBER,26, 19,20,10);
        // Se puede hacer asi o la clase Calendar nos prporciona unas constantes


        // Obtenemos una instancia de la hora con el formato del calendario asignado
        Date fecha = calendario.getTime();
        System.out.println("Calendario fecha = " + fecha);

        // la (a) es para indicar el formato am o pm para la hora
        // HH -> formato 24 hrs
        // hh -> formato 12 hrs
        SimpleDateFormat valor = new SimpleDateFormat("yyy/MMMM/dd hh:mm:ss a");
        String retornoValor = valor.format(fecha);
        System.out.println("\nretornoValor = " + retornoValor);

        SimpleDateFormat val = new SimpleDateFormat("Obtenemos el formato de fecha");
        String fechaNueva = val.format(fecha); // Pasamos la fecha que queremos aplicar el formato y la obtenemos

    }

}
