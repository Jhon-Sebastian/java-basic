public class ConversionTipos {

    public static void main(String[] args) {

        String numero = "50";

        int numeroParseado = Integer.parseInt(numero);
        System.out.println("numeroParseado = " + numeroParseado);

        String num = "982033.23";
        double numDouble = Double.parseDouble(num);
        System.out.println("numDouble = " + numDouble);

        String logico = "true";
        boolean logicoBolean = Boolean.parseBoolean(logico);
        System.out.println("logicoBolean = " + logicoBolean + "\n");
        
        // Conversion de Strings

        int numEntero = 100;
        String numEnteroString = Integer.toString(numEntero);
        // System.out.println("numEnteroString = " + numEnteroString);

        numEnteroString = String.valueOf(numEntero);
        System.out.println("numEnteroString = " + numEnteroString);
        
        char[] a = numEnteroString.toCharArray();
        for (char b: a) {
            System.out.println("b = " + b);
        }

    }

}
