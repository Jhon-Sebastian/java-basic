package ValorPorArgumento;

public class PasarPorValor {

    public static void main(String[] args) {

        //Pasar por valor
        /*
             Los tipos primitivos siempre se pasan por valor ya que no sn un objeto para
             que apunte a una referencia
         */
        int i = 10;
        System.out.println("Inicio Metodo Main");
        System.out.println("Valor = " + i);
        test(i);
        System.out.println("Finaliza Metodo Main");
        System.out.println("Valor = " + i);
        
        Integer val = 23;
        String re = "Hola.amigos";

        System.out.println("Index of: "+re.indexOf(3));
        System.out.println("StarWith: " +  re.startsWith("Hol"));
        System.out.println("Index of con String: " + re.indexOf("o"));
        System.out.println("Inicia desde : " + re.substring(1));

        char[] cha = re.toCharArray();
        for (char a : cha){
            System.out.println("\na = " + a);
        }
        
        String[] ass =  re.split("[.]");
       for(String s : ass){
           System.out.println("\ns = " + s);
       }

    }

    private static void test(int valor){
        System.out.println("\nInicio Metodo Test");
        valor = 35;
        System.out.println("valor = " + valor);
    }
    

}


