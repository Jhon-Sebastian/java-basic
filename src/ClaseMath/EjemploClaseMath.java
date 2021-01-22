package ClaseMath;

public class EjemploClaseMath {
    public static void main(String[] args) {

        //#VALOR ABSOLUTO
        //Entrega el valor absoluto -> sin importar el signo u otra cosa entre el numero
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);//#3

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto); //#3

        //#NUMERO MAYOR
        //compara entre dos valores cual es mayor
        double dou = Math.max(3.5,1.6);
        System.out.println("dou = " + dou);
        
        dou = Math.max(21,56);
        System.out.println("dou = " + dou);

        //#NUMERO MENOR
        //compara entre dos valores cual es mayor
        double men = Math.min(3.5,1.6);
        System.out.println("men = " + men);

        men = Math.min(21,56);
        System.out.println("men = " + men);

        //#NUMERO REDONDEADO
        double redondeoArriba = Math.ceil(3.5);
        System.out.println("redondeoArriba = " + redondeoArriba);

        double redondeoAbajo = Math.floor(3.5);
        System.out.println("redondeoAbajo = " + redondeoAbajo);
        
        //redondea segun el numero sea 3.6 -> arriba || 3.4 -> abajo
        long numeroRound = Math.round(3.6);
        System.out.println("numeroRound = " + numeroRound);
        numeroRound = Math.round(3.4);
        System.out.println("numeroRound = " + numeroRound);

        //#VALOR DE (e)
        //Obtenemos el valor de   -> e -> en trigonometria y podemos exponeciarla con el numero que ingresemos 
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        //#LOGARTIMO NATURAL
        //Tomando como base la contsante (e)
        //y la exponenciamos a 10
        double log = Math.log(10);
        System.out.println("log = " + log);

        //#POTENCIA
        // Numero base , Exponente
        double potencia = Math.pow(2,3);
        System.out.println("potencia = " + potencia);

        //#RAIZ CUADRADA
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        //#TRIGONOMETRIA

        //CONVERTIR UN ANGULO DE RADIANES A GRADOS
        double grados = Math.toDegrees(1.57);
        System.out.println("grados = " + grados);

        //CONVERTIR DE GRADOS A RADIANES
        double radianes = Math.toRadians(90.0);
        System.out.println("radianes = " + radianes);

        // SENO
        //siempre recibe los daots en radianes
        System.out.println("sin(90)=  " + Math.round(Math.sin(90)));

        // COSENO
        System.out.println("Cos(90)= " + Math.round(Math.cos(90)));

        //#RANDOM



    }
}
