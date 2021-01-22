package FlujosDeControl;

public class SentenciaForArreglo {

    public static void main(String[] args) {

        String[] nombres = {"Luisa","Andres","Pepe","Carlos","Ezperanza"};
        for (int i = 0; i < nombres.length; i++){
            //No queremos mostrar el primero y ultimo
            if(nombres[i].equalsIgnoreCase("luisa")
                    || nombres[i].equalsIgnoreCase("ezperanza")){
                continue;
            }
            System.out.println(i + " - " + nombres[i]);
        }
    }

}
