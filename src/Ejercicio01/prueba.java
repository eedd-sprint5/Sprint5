package Ejercicio01;

/**
 *
 * @author Balta
 */
public class prueba {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String NSS = "22 88888888 22";

        NSS = NSS.replace(" ", "");

        System.out.println(NSS.substring(0, 2));
        System.out.println(NSS.substring(10, 12));

    }

}
