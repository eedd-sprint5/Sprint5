/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01;

/**
 *
 * @author lover
 */
public class SuperClaseCuentaBancaria {
    
    public static int min_nombre = 10;
    public String titular;
    public static int max_nombre = 100;
    public double saldo = 0;

    public static boolean comprobarCCC(String CCC) {
        boolean c = false;
        int total1;
        int total2;
        int resto1;
        int resto2;
        int dc1;
        int dc2;
        int num1 = Integer.parseInt(CCC.substring(0, 1));
        int num2 = Integer.parseInt(CCC.substring(1, 2));
        int num3 = Integer.parseInt(CCC.substring(2, 3));
        int num4 = Integer.parseInt(CCC.substring(3, 4));
        int num5 = Integer.parseInt(CCC.substring(4, 5));
        int num6 = Integer.parseInt(CCC.substring(5, 6));
        int num7 = Integer.parseInt(CCC.substring(6, 7));
        int num8 = Integer.parseInt(CCC.substring(7, 8));
        total1 = (num1 * 4) + (num2 * 8) + (num3 * 5) + (num4 * 10) + (num5 * 9) + (num6 * 7) + (num7 * 3) + (num8 * 6);
        resto1 = total1 % 11;
        dc1 = 11 - resto1;
        int num21 = Integer.parseInt(CCC.substring(10, 11));
        int num22 = Integer.parseInt(CCC.substring(11, 12));
        int num23 = Integer.parseInt(CCC.substring(12, 13));
        int num24 = Integer.parseInt(CCC.substring(13, 14));
        int num25 = Integer.parseInt(CCC.substring(14, 15));
        int num26 = Integer.parseInt(CCC.substring(15, 16));
        int num27 = Integer.parseInt(CCC.substring(16, 17));
        int num28 = Integer.parseInt(CCC.substring(17, 18));
        total2 = (num21 * 4) + (num22 * 8) + (num23 * 5) + (num24 * 10) + (num25 * 9) + (num26 * 7) + (num27 * 3) + (num28 * 6);
        resto2 = total2 % 11;
        dc2 = 11 - resto2;
        if ((dc1 == Integer.parseInt(CCC.substring(9, 10))) && (dc2 == Integer.parseInt(CCC.substring(10, 11)))) {
            c = true;
        } else {
            c = false;
        }
        return c;
    }

    public static String calcularCCC(String CCC) {
        int total1;
        int total2;
        int resto1;
        int resto2;
        int dc1;
        int dc2;
        int num1 = Integer.parseInt(CCC.substring(0, 1));
        int num2 = Integer.parseInt(CCC.substring(1, 2));
        int num3 = Integer.parseInt(CCC.substring(2, 3));
        int num4 = Integer.parseInt(CCC.substring(3, 4));
        int num5 = Integer.parseInt(CCC.substring(4, 5));
        int num6 = Integer.parseInt(CCC.substring(5, 6));
        int num7 = Integer.parseInt(CCC.substring(6, 7));
        int num8 = Integer.parseInt(CCC.substring(7, 8));
        total1 = (num1 * 4) + (num2 * 8) + (num3 * 5) + (num4 * 10) + (num5 * 9) + (num6 * 7) + (num7 * 3) + (num8 * 6);
        resto1 = total1 % 11;
        dc1 = 11 - resto1;
        int num21 = Integer.parseInt(CCC.substring(10, 11));
        int num22 = Integer.parseInt(CCC.substring(11, 12));
        int num23 = Integer.parseInt(CCC.substring(12, 13));
        int num24 = Integer.parseInt(CCC.substring(13, 14));
        int num25 = Integer.parseInt(CCC.substring(14, 15));
        int num26 = Integer.parseInt(CCC.substring(15, 16));
        int num27 = Integer.parseInt(CCC.substring(16, 17));
        int num28 = Integer.parseInt(CCC.substring(17, 18));
        total2 = (num21 * 4) + (num22 * 8) + (num23 * 5) + (num24 * 10) + (num25 * 9) + (num26 * 7) + (num27 * 3) + (num28 * 6);
        resto2 = total2 % 11;
        dc2 = 11 - resto2;
        return "Los d�gitos de control son: " + dc1 + " " + dc2;
    }

    /**
     * @return the min_nombre
     */
    public static int getMin_nombre() {
        return min_nombre;
    }

    /**
     * @return the max_nombre
     */
    public static int getMax_nombre() {
        return max_nombre;
    }
    public String entidad;
    public String oficina;
    public String numCuenta;

    public SuperClaseCuentaBancaria() {
    }

   

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @return the entidad
     */
    public String getEntidad() {
        return entidad;
    }

    /**
     * @return the oficina
     */
    public String getOficina() {
        return oficina;
    }

    /**
     * @return the numCuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }
    
}
