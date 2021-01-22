package ClaseSystem;

import java.util.Map;

public class VariablesDeEntorno {

    public static void main(String[] args) {

        //El metodo va a retornar un map -> para las variables de entorno
        Map<String,String> varEmv = System.getenv();
        System.out.println("Variable de entorno del Systema = " + varEmv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        
        String temp = System.getenv("TEMP");
        System.out.println("temp = " + temp);
        
        String path = System.getenv("Path");
        System.out.println("path = " + path);

        System.out.println("--- Listado de variables del SISTEMA ---");
        for(String key : varEmv.keySet()){
            System.out.println(key + " => " + varEmv.get(key));
        }
    }

}
