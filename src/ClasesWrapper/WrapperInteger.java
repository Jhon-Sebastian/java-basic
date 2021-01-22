package ClasesWrapper;

public class WrapperInteger {

    public static void main(String[] args) {

        //Lo mismo , distintas maneras de instanciarlos
        Integer objeto = Integer.valueOf(2);
        System.out.println("objeto = " + objeto);
        Integer objeto3 = Integer.valueOf("3");
        Integer objeto2 = 5;
        System.out.println("objeto2 = " + objeto2);

        // Convertir de un objeto integer de referencia -> integer primitivo
        // Varias maneras
        int num1 = objeto;   // Directamente IMPLICITA
        System.out.println("num1 = " + num1);
        int num = objeto.intValue(); // A traves de un metodo de la instancia -> EXPLICITA
        System.out.println("num = " + num);




    }

}
