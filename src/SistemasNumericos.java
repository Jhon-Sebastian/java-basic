import javax.swing.*;


public class SistemasNumericos {

    public static void main(String[] args) {

        int numero = 0;

        try {
             numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el Numero"));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Tipo de dato no valido");
            main(args);
            System.exit(0);
        }

        System.out.println("numero = " + numero);

        System.out.println("numero binario de:  = " + numero + ":  " + Integer.toBinaryString(numero));
        System.out.println("");


        int  numeroBinaria = 0B111110100; // OB
        System.out.println("numeroBinaria = " + numeroBinaria);
        System.out.println("numeroBinaria = " + numeroBinaria + " a Octal " + Integer.toOctalString(numeroBinaria));

        int numeroOctal = 0764; // 0
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("numeroOctal = " + numeroOctal + "a hexadecilam " + Integer.toHexString(numeroOctal));

        int hexa = 0x1f4; // 0x
        System.out.println("hexadecimal = " + hexa);

        JOptionPane.showMessageDialog(null,"El numero es: " + numero);


    }

}
