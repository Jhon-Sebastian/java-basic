package Aritmetica;

public class OperadorInstanceOf {

    public static void main(String[] args) {

        String text = "Creando un objeto de la clase string";

        Integer num = 14;

        boolean b1 = text instanceof Object;
        System.out.println("Es del tipo String: " + b1);


        char[] a = new char[2];
        System.out.println(a instanceof Object);

    }

}
