package ClaseSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesSystema {

    public static void main(String[] args) {


        try {
            //Lee y obtiene el contenido del archivo en bytes y se lo pasa al sistema
            FileInputStream entrada = new FileInputStream("src/ClaseSystem/config.properties");

            //Crear el object properties para agregarlo al systema
            //Ademas le agregamos todas las configuraticiones que tenemos del sistema
            Properties p = new Properties(System.getProperties());
            //y agregamos las nuevas configuraciones desde el archivo
            p.load(entrada);
            //tambien se puede agregar propiedades directamente
            p.setProperty("mi.propeidad.personalizada", "Hello World");

            //Ahora le pasamos las propiedades personalizadas al Systema
            System.setProperties(p);

            //Mostramos las propiedades del sistema
            System.getProperties().list(System.out);

            //Obtener una propiedad en especifica
            System.out.println("Propiedad en especifica: "+System.getProperty("mi.propeidad.personalizada"));

        } catch (Exception e) {
            System.out.println("No existe el archivo = " + e);
        }


    }

}
