package FlujosDeControl;

public class Etiquetas {

    public static void main(String[] args) {

        int[] num = {1, 3, 5, 7, 9, 11, 13, 15};

        //Etiquetas para poder reconocer a que for se hace referencia ( name:  )
        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    // Cuando i == 2, no lo toma y sigue, es como si no existiera
                    // por lo tanto tampoco se hace el for anidado
                    // pero si hace el for principal y anidados de los otros valores
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + " ], ");
            }
        }

        /////////////////////////////////////////////////////////////////////

        //Etiquetas para poder reconocer a que for se hace referencia ( name:  )
        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    // Ahora ya no para, si no que se sale cuando i == 2
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j + " ], ");
            }
        }

    }
}
