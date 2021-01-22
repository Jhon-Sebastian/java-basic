package Aritmetica;

import java.util.Scanner;

public class OperadorLogicoLogin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //String[] usernames = new String[2];
        //String[] passwords = new String[2];

        String[] usernames = {"Sebastian","admin"};
        String[] passwords = {"12345","123"};

        //usernames[0] = "Sebastian";
        //passwords[0] = "12345";

        //usernames[1] = "admin";
        //passwords[1] = "123";

        //String usename = "Sebastian";
        //String password = "12345";

        System.out.println("LOGIN BASE DATA\n");


        System.out.println("Usuario:");
        String u = sc.nextLine();
        System.out.println("Contraseña: ");
        String c = sc.nextLine();

        System.out.println();

        boolean authenticaciont = false;

        for (int i = 0; i < usernames.length ; i++){
            if(usernames[i].equals(u) && passwords[i].equals(c)){
                authenticaciont = true;
                break;
            }
        }

        if(authenticaciont){
            System.out.println("Bienvenido Usuario: ".concat(u));
        }else{
            System.out.println("El usuario no existe en la base de datos");
        }


    }
}
