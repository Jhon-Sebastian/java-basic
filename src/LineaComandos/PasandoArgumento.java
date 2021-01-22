package LineaComandos;

public class PasandoArgumento {

    public static void main(String[] args) {

        System.out.println(System.getProperty("classpath"));

        if(args.length == 0){
            System.out.println("Debe ingresar argumentosN");
            System.exit(-1);
        }

        for(int i = 0; i < args.length; i++){
            System.out.println("Arguementos n" + i + ": " + args[i]);
        }

    }
}
