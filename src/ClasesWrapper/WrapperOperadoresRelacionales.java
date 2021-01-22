package ClasesWrapper;

public class WrapperOperadoresRelacionales {

    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;


        //Son iguales porque compara instancias, o sea memoria donde se guardan
        System.out.println("Son iguales: " + (num1 == num2)); // True

        //Pero si le cambiamos el valor y no le asignamos la instancia de num1
        num2 = 1000;
        System.out.println("Son iguales : " + (num1 == num2)); // False

        // Para eso se compara con el method equals
        System.out.println("Son iguales EQUALS: " + (num1.equals(num2))); // True
        // Tambien se puede comparar pasando los Integer de referencia a Integer primitivo
        System.out.println("Son iguales PRIMITIVO: " + (num1.intValue() == num2.intValue())); // True

        /*
            NOTA:  Si el valor asignado a la variable Integer de referencia es menor a 128
                   no hay problema con comparar con los operadores (==) porque java lo toma
                   como un valor primitivo
         */

        Integer val1 = 127;
        Integer val2 = 127;
        System.out.println("\nIGUALES? -  " + (val1 == val2));
        System.out.println("EQUALS? -  " + (val1.equals(val2)));

        // No hay problema al momento de usar operadores >< && ||
        // ya que hace el proceso normal, solo cuando el numero es > 128 es cuando ocurre
        // la comparación de Integers de referencia donde se guarda la memoria,
        // usando el operador ==
        val1 = 1000;
        val2 = 999;
        System.out.println("\nES MAYOR? -  " + (val1 > val2));



    }
}
