package Ejercicio01;

public class CuentaBancaria {

    public String titular;
    public double saldo = 0;
    public String entidad;
    public String oficina;
    public String numCuenta;
    public static int min_nombre = 10;
    public static int max_nombre = 100;

    public CuentaBancaria(String titular, String entidad, String oficina, String DC, String numCuenta) throws IllegalArgumentException {
        if (titular.length() < min_nombre || titular.length() > max_nombre) {
            throw new IllegalArgumentException("Nombre de titular no v�lido");
        } else {
            this.titular = titular;
        }

        if (entidad.length() > 4) {
            throw new IllegalArgumentException("N�mero de entidad no v�lido");
        } else {
            this.entidad = entidad;
        }

        if (oficina.length() > 4) {
            throw new IllegalArgumentException("N�mero de oficina no v�lido");
        } else {
            this.oficina = oficina;
        }

        if (DC.length() > 2) {
            throw new IllegalArgumentException("N�mero de control no v�lido");
        }

        if (numCuenta.length() > 10) {
            throw new IllegalArgumentException("N�mero de cuenta no v�lido");
        } else {
            this.numCuenta = numCuenta;
        }
    }

    public CuentaBancaria(String titular, String CCC) {

        this(titular, CCC.substring(0, 4), CCC.substring(4, 8), CCC.substring(8, 10), CCC.substring(10, 20));

    }

    public String obtener_titular() {
        return getTitular();
    }

    public double obtener_saldo() {
        return getSaldo();
    }

    public String obtener_entidad() {
        return getEntidad();
    }

    public String obtener_oficina() {
        return getOficina();
    }

    public String obtener_numCuenta() {
        return getNumCuenta();
    }

    public void cambiar_titular(String titular) {
        this.setTitular(titular);
    }

    public void ingresar(double cantidad) throws IllegalArgumentException {
        if (cantidad < 0) {
            throw new IllegalArgumentException("Cantidad de dinero a ingresar no v�lida");
        } else {
            this.setSaldo(this.getSaldo() + cantidad);
        }
    }

    public void retirar(double cantidad) throws IllegalArgumentException {
        if (cantidad > this.getSaldo()) {
            throw new IllegalArgumentException("Cantidad de dinero a retirar no v�lida");
        } else {
            this.setSaldo(this.getSaldo() - cantidad);
        }
    }

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

    public String toString(String CCC) {
        return "Titular: " + this.getTitular() + ", CCC: " + CCC + ", Saldo: " + this.getSaldo();
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the entidad
     */
    public String getEntidad() {
        return entidad;
    }

    /**
     * @param entidad the entidad to set
     */
    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    /**
     * @return the oficina
     */
    public String getOficina() {
        return oficina;
    }

    /**
     * @param oficina the oficina to set
     */
    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    /**
     * @return the numCuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * @return the min_nombre
     */
    public static int getMin_nombre() {
        return min_nombre;
    }

    /**
     * @param aMin_nombre the min_nombre to set
     */
    public static void setMin_nombre(int aMin_nombre) {
        min_nombre = aMin_nombre;
    }

    /**
     * @return the max_nombre
     */
    public static int getMax_nombre() {
        return max_nombre;
    }

    /**
     * @param aMax_nombre the max_nombre to set
     */
    public static void setMax_nombre(int aMax_nombre) {
        max_nombre = aMax_nombre;
    }

}
