package strings;

public class EjemploStringValidation {

    public static void main(String[] args) {

        String curso = "";
        
        boolean isNull = curso == null;

        System.out.println("isNull = " + isNull);

        if(isNull){
            System.out.println("El valor no es null");
        }else{
            System.out.println(curso.toUpperCase());
        }

        //Valida que no este vacio
        boolean isEmpty = curso.isEmpty();
        if(isEmpty){
            System.out.println("El curso esta vacio: " + isEmpty);
        }

        System.out.println("\n");
        //Validad que asi sea espacios en blanco o este null o no tenga caracteres
        boolean isBlank = curso.isBlank();
        System.out.println("isBlank = " + isBlank);
        if(isBlank){
            System.out.println("No hay ningun valor, aunque hallan espacios en blanco");
        }


    }

}
