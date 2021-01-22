package strings;

public class EjemploStringMetodos {

    public static void main(String[] args) {

        String nombre = "Sebastian";
        System.out.println("Tamaño de la cadena: " + nombre.length());
        System.out.println("MAYUSCULA: " + nombre.toUpperCase());
        System.out.println("MAYUSCULA: " + nombre.toLowerCase());
        System.out.println("Comparacion de STRINGS MAYUS= " + nombre.equals("Sebastian"));
        System.out.println("Comparacion de STRINGS minus= " + nombre.equals("sebastian"));
        System.out.println("Comparacion de STRINGS IgnorCase= " + nombre.equalsIgnoreCase("sEbAstian"));
        //Comparacion en el orden numerico con respecto a la tabla UNICODE
        /*
            Si es 0 son iguales
        
         */
        System.out.println("Comparacion UNICODE: " + nombre.compareTo("Sebastian"));
        System.out.println("Comparacion UNICODE: " + nombre.compareTo("Silvia"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1)) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(0,3) = " + nombre.substring(0,3));

        String trabalengua  = "trabalenguas";
        System.out.println("trabalenguas = " + trabalengua.replace("a","."));
        //acepta '' o "" -> arrojando la posicion de la primera ves que la encuentre
        // si no lo encuentra arroja un -1
        System.out.println("trabalengua.indexOf('a') = " + trabalengua.indexOf('a'));
        // Retorna la primera ocurrencia pero del ultimo al principio
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
        // Contains -> arroja un true o false si encuentra la cadena ("solo acepta cadenas")
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("t"));
        // Saber si la cadena empieza con la cadena que se pasa por argumento
        System.out.println("trabalengua.startsWith(\"traba\") = " + trabalengua.startsWith("traba"));
        // lo mismo que starWith pero finalizando
        System.out.println("trabalengua.endsWith(\"lenguas\") = " + trabalengua.endsWith("lenguas"));
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());
        






    }

}
