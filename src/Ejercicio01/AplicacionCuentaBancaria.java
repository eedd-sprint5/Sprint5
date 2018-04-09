package Ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Balta
 */
public class AplicacionCuentaBancaria {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String titular;
        String CCC;

        do {
            System.out.println("Introduzca el titular de la cuenta");
            titular = sc.nextLine();

            if (titular.length() < 10 || titular.length() > 100) {
                System.out.println("El tama�o del titular no es correcto");
                System.out.println("");
            }

        } while (titular.length() < 10 || titular.length() > 100);

        do {
            System.out.println("Introduzca el CCC de la cuenta");
            CCC = sc.nextLine();

            if (CCC.length() < 20) {
                System.out.println("N�mero de C�digo Cuenta Cliente no v�lido");
                System.out.println("El CCC debe estar formado por:");
                System.out.println("4 d�gitos de entidad");
                System.out.println("4 d�gitos de oficina");
                System.out.println("2 d�gitos de control");
                System.out.println("10 d�gitos de codigo de cuenta");
                System.out.println("Revise que contenga todo eso");
                System.out.println("");
            }

        } while (CCC.length() != 20);

        CuentaBancaria cb1 = new CuentaBancaria(titular, CCC);

        double cantidad;

        int o = 10;

        do {

            imprimirMenu();

            o = sc.nextInt();

            switch (o) {
                case 1:
                    try {
                        System.out.println("C�digo Cuenta Cliente: " + CCC);
                    } catch (IllegalArgumentException excepcion) {
                        System.out.println("Cantidad de dinero a ingresar no v�lida");
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Nombre del titular: " + titular);
                    } catch (IllegalArgumentException excepcion) {
                        System.out.println("Cantidad de dinero a ingresar no v�lida");
                    }
                    break;

                case 3:
                    try {
                        System.out.println("N�mero de entidad: " + cb1.obtener_entidad());
                    } catch (IllegalArgumentException excepcion) {
                        System.out.println("Cantidad de dinero a ingresar no v�lida");
                    }
                    break;

                case 4:
                    try {
                        System.out.println("N�mero de oficina: " + cb1.obtener_oficina());
                    } catch (IllegalArgumentException excepcion) {
                        System.out.println("Cantidad de dinero a ingresar no v�lida");
                    }
                    break;

                case 5:
                    try {
                        System.out.println("N�mero de cuenta: " + cb1.obtener_numCuenta());
                    } catch (IllegalArgumentException excepcion) {
                        System.out.println("Cantidad de dinero a ingresar no v�lida");
                    }
                    break;

                case 6:
                    System.out.println("Los d�gitos de control son: " + CCC.substring(8, 10));
                    break;

                case 7:
                    try {
                        System.out.println("El saldo actual es de " + cb1.obtener_saldo());
                        System.out.println("Indica la cantidad de dinero a ingresar: ");
                        cantidad = sc.nextDouble();

                        cb1.ingresar(cantidad);

                        System.out.println("El saldo actual es de " + cb1.obtener_saldo());
                        cantidad = 0;
                    } catch (IllegalArgumentException excepcion) {
                        System.out.println("Cantidad de dinero a ingresar no v�lida");
                    }
                    break;

                case 8:
                    try {
                        System.out.println("El saldo actual es de " + cb1.obtener_saldo());
                        System.out.println("Indica la cantidad de dinero a retirar: ");
                        cantidad = sc.nextDouble();

                        cb1.retirar(cantidad);

                        System.out.println("El saldo actual es de " + cb1.obtener_saldo());
                        cantidad = 0;
                    } catch (IllegalArgumentException excepcion) {
                        System.out.println("Cantidad de dinero a retirar no v�lida");
                    }
                    break;

                case 9:
                    System.out.println("El saldo actual es de " + cb1.obtener_saldo());
                    break;

                case 10:

                    break;
            }

            System.out.println("");

        } while (o != 10);
    }

    private static void imprimirMenu() {
        System.out.println("");
        System.out.println("Elige una opci�n: ");
        System.out.println("1. Ver el n�mero de cuenta completo");
        System.out.println("2. Ver el titular de la cuenta");
        System.out.println("3. Ver el c�digo de la entidad");
        System.out.println("4. Ver el c�digo de la oficina");
        System.out.println("5. Ver el n�mero de la cuenta");
        System.out.println("6. Ver os d�gitos de control de la cuenta");
        System.out.println("7. Realizar un ingreso");
        System.out.println("8. Retirar efectivo");
        System.out.println("9. Consultar saldo");
        System.out.println("10. Salir de la aplicaci�n");
    }

}
