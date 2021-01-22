import javax.swing.*;
import java.util.Scanner;


public class EntradaScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();

        try {
            System.out.println("\nEL NUMERO ES :  "+numero);
        }catch (NumberFormatException e){
            System.out.println("Tipo de dato no valido");
            main(args);
            System.exit(0);
        }

        System.out.println("Detalle Hexadecimal: " + Integer.toHexString(numero));
        System.out.println("Detalle Octal: " + Integer.toOctalString(numero));
        System.out.println("Detalle Binario: " + Integer.toBinaryString(numero));


    }

}
