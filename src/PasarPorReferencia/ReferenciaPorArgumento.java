package PasarPorReferencia;

public class ReferenciaPorArgumento {

    public static void main(String[] args) {

        long variable = System.currentTimeMillis();

        int[] valor = {10,11,12};
        System.out.println("Iniciamos el metodo main\n");
        for(int i : valor){
            System.out.println("i = " + i);
        }
        System.out.println("BEFORE METHOD TEST");
        //Llamada al metodo
        test(valor);
        System.out.println("AFTER METHOD TEST");
        for (int i : valor){
            System.out.println("i = " + i);
        }
        System.out.println("Fin metodo main");

    }

    private static void test(int[] valArreglo){
        System.out.println("STAR METHOD TEST");
        for (int i = 0; i < valArreglo.length; i++){
            valArreglo[i] = valArreglo[i] + 20;
        }
        System.out.println("END METHOD TEST\n");
    }

}
