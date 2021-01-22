package EjercicioExtensionArchivo;

public class EjemploExtension {

    public static void main(String[] args) {

        String archivo = "proyec.management.json";
        int i = archivo.lastIndexOf('.');
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(17) = " + archivo.substring(i + 1));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] trab = trabalenguas.toCharArray();
        for (char elemento : trab) {
            System.out.print(elemento);
        }

        //Divivdie el String segun el patron que pasemos
       // System.out.println("Trabalenguas: " + trabalenguas.split("a"));
        String[] val = trabalenguas.split("a");
        for (String ele : val) {
           // System.out.println("ele = " + ele);
        }

        //Ejemplo 2 de split
        String algunValor = "1]2]3]4]5]6]7]8]9";
        String[] reco = algunValor.split("]");
        for(String iterador : reco){
           // System.out.print(iterador + ", ");
        }

        /*
           Tambien funcionaria para dividir las partes del archivo
           EL DOBLE \\ o [] Sirve para decirle que voy a usar un caracter
           ya que si lo pongo normal no funciona porque el (punto)
           es un caracter especial
        */
        String archivo2 = "alguna.imagen.pdf";
        String[] elementos = archivo2.split("\\.");
       // String[] elementos3 = archivo2.split("[.]");
        System.out.println("\nELEMENTOS DEL ARCHIVO");
        for(String iter: elementos){
            System.out.print(iter.concat(", "));
        }


        String cad = "blanco-rojo:amarillo.verde_azul*cafe";
        String[] l = cad.split("[-:._*]");
        for(String ele : l){
            System.out.println("ele = " + ele);
        }

    }
}
