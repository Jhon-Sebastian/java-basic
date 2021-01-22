package strings;

public class EjemploTestRendimiento {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        //Calcula el tiempo actual en misilegundos
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 1000; i++){
            // c = c.concat(a).concat(b).concat("\n");  // 16 ms
            // c += a+b+"\n";                           // 65 ms
            // sb.append(a).append(b).append("\n");     // 0 ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

    }

}
