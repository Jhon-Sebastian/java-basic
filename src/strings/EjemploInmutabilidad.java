package strings;

public class EjemploInmutabilidad {

    public static void main(String[] args) {

        String cursp = "Programacion Java";
        String profesor = "Jhon Sebastian";
        String result = cursp.concat(profesor);


        System.out.println("cursp = " + cursp);
        System.out.println("profesor = " + profesor);
        System.out.println("result = " + result);
        System.out.println(cursp == result);

        String valorReplace = result.replace("a","A");
        System.out.println("Valor reemplazado: ".concat(valorReplace));


    }


}
