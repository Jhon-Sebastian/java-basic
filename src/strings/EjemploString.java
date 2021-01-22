package strings;

public class EjemploString {

    public static void main(String[] args) {

        String curso = "Programación Java";
        String curso2 = new String("programación java");
        
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("urso.equals(curso2) = " + esIgual);

        // ignoreCase el cual hace la comparacion sin importar mayuscula o miniscula
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        // Son iguales porque para ahorrar memoria y como son dos objetivos con el mismo valor
        // le asigna la misma referencia de (curso) como de (curso3)
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);


    }

}
