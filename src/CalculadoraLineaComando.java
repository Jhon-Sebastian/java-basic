public class CalculadoraLineaComando {
    public static void main(String[] args) {

        if(args.length != 3){
            System.out.println("Ocurrio un error, el array no es 3 posiciones");
            System.exit(-1);
        }

        System.out.println("1.suma\n2.resta\n3.multiplicacion\n4.division\n=> ademas de 2 enteros");


        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;

        switch(operacion){
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "multiplicacion":
                resultado = a*b;
                break;
            case "division":
                resultado = (double) a/b;
                break;
            default:
                System.out.println("No escogio ninguna de las opciones");
        }

        System.out.println("\nTodo salio Bien\nResultado de la '" + operacion + "' es:" + resultado);

    }
}
