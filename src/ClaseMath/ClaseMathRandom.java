package ClaseMath;

import java.util.Random;

public class ClaseMathRandom {
    public static void main(String[] args) {

        //#RANDOM
        //Numero aleatorio entre 0 y 1 -> no incluye el 1
        double random = Math.random();
        System.out.println("random = " + random);
        
        //si queremos un # entre 0 y 7
        random *= 7;
        System.out.println("random = " + random);

        String colores[] = {"azul","negro","blanco","celeste","cafe","amarillo"};
        double val = Math.random();
        val *= colores.length;
        System.out.println("\nColorer aleatorio= " + colores[(int)val]);

        //CLASS RANDOM
        Random numRandom = new Random();
        //Hay 2 opciones generar el numero aletorio o decirle hasta que numero puede generarlo pasandolo
        //por constructor -> ya sea negativos o positivos
        int randomInt = numRandom.nextInt(7);
        System.out.println("randomInt = " + randomInt);

    }
}
