package ClasesWrapper;

import java.lang.reflect.Method;

public class EjemploGetClass {

    public static void main(String[] args) {

        String valorAString = "Hola como estans=?";

        //El metodo getClass() lo posee todos los datos ya que extienden de la clase object
        // y debido a ello todos puede acceder a dicho metodo
        Class retorno = valorAString.getClass();

        // Obtiene todo el nombre ademas con su extension  java.lang.String
        System.out.println("retorno.getName() = " + retorno.getName());

        //Obtiene el nombre, pero sin decir de que paquete proviene -> String
        System.out.println("retorno.getNameSimple() = " + retorno.getSimpleName());

        //Obtiene el packete del que proviene ->  java.lang
        System.out.println("retorno.getPackage() = " + retorno.getPackageName());

        //   -> class java.lang.String
        System.out.println("retorno.getName() = " + retorno);

        // Si queremos mostrar los metodos que posee
        for (Method metodos : retorno.getMethods()) {
            System.out.println("metodos.getName() = " + metodos.getName());
        }

        Integer val = 34;
        Class a = val.getClass();
        System.out.println("na.gtSimpleName() = " + a.getSimpleName());
        // Clase padre de Integer  -> Number
        System.out.println("a.getSuperclass() = " + a.getSuperclass());
        // Clase padre de Number
        Class padre = a.getSuperclass().getSuperclass();
        System.out.println("a.getSuperclass().getSuperclass() = " + padre);
        //Metodos del padre
        for (Method metodo : padre.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }

}
