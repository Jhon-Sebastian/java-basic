package ClaseSystem;

import java.util.Properties;

public class EjemploPropiedadesJava {

    public static void main(String[] args) {

        //Para ver las llaves -> Java system getProperties en google

        //Nombre de usuario del sistema operativo
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        //Directorio del usuario
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        // workspace  o espacio de trabajo
        String worksSpace = System.getProperty("user.dir");
        System.out.println("worksSpace = " + worksSpace);

        //version de java
        String javaVerison = System.getProperty("java.version");
        System.out.println("javaVerison = " + javaVerison);

        //Saber que linea de saparador usa el system
        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator: " + lineSeparator + " una linea nueva");


        //Listar todas las propiedades
        Properties p = System.getProperties();
        p.list(System.out); //System.out -> imprimir en pantalla

    }


}
