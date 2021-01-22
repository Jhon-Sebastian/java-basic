package ClaseSystem;

import java.io.IOException;

public class EjecutarProgramaSistemaSO {

    public static void main(String[] args) {

        //Encargado de ejecutar la aplicacion y aqui se esta instanciando
        Runtime run = Runtime.getRuntime();
        //cuando se ejecuta un programa retorna un objeto de tipo Process
        Process proceso;

        try {
            //preguntamos si la propiedad sel sistema la cual se refiere al nombre
            // del sisetema operativo inicia con Windows para asi sabe que txt ejecutar segun el S.O.
            if (System.getProperty("os.name").startsWith("Windows")) {
                // si estamos en windows ejecuatr el notepad -> .txt
                proceso = run.exec("notepad");
            }else{
                proceso = run.exec("gedit");
            }
            //espera que se cierre el  .txt para finalizar este programa si no hya nada mas
            proceso.waitFor();

        } catch (IOException e) {
            System.err.println("El comando es desconocido " + e.getMessage());
            System.exit(1);
        } catch (InterruptedException i){
            System.err.println("Error esperando por el cierre de la aplicacion: " + i.getMessage());
        }
        System.out.println("Se ha cerrado la aplicacion");


    }

}
