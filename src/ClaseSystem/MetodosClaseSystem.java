package ClaseSystem;

public class MetodosClaseSystem {

    public static void main(String[] args) {

        try {

            //Mensajes de salida normales
            System.out.println("Imprimir un mensaje normal");

            Integer.parseInt("21d");

        } catch (Exception e) {

            //Mensajes de error
            System.err.println("Imprimir mensaje en rojo aclarando que es un error");
            // {Status} => Si sale bien = (0) || si sale mal = (-1 o 1) y salimos del programa
            System.exit(1);
        }
    }

}
