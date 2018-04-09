package Ejercicio01;

/**
 *
 * @author Balta
 */
public class CuentaCorriente {

    private String titular;
    private double saldo = 0;
    private String entidad;
    private String oficina;
    private String numCuenta;

    /**
     *
     */
    public static final int min_nombre = 10;

    /**
     *
     */
    public static final int max_nombre = 100;

    /**
     *
     * @param cliente
     * @param entidad
     * @param oficina
     * @param DC
     * @param numCuenta
     * @throws IllegalArgumentException
     */
    public CuentaCorriente(String cliente, String entidad, String oficina, String DC, String numCuenta) throws IllegalArgumentException {
        if (cliente.length() < min_nombre || cliente.length() > max_nombre) {
            throw new IllegalArgumentException("Nombre de titular no v�lido");
        } else {
            this.titular = cliente;
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

    /**
     *
     * @param titular
     * @param CCC
     */
    public CuentaCorriente(String titular, String CCC) {

        this(titular, CCC.substring(0, 4), CCC.substring(4, 8), CCC.substring(8, 10), CCC.substring(10, 20));

    }

    /**
     *
     * @return
     */
    public String obtener_titular() {
        return titular;
    }

    /**
     *
     * @return
     */
    public double obtener_saldo() {
        return saldo;
    }

    /**
     *
     * @return
     */
    public String obtener_entidad() {
        return entidad;
    }

    /**
     *
     * @return
     */
    public String obtener_oficina() {
        return oficina;
    }

    /**
     *
     * @return
     */
    public String obtener_numCuenta() {
        return numCuenta;
    }

    /**
     *
     * @param titular
     */
    public void cambiar_titular(String titular, String titular1) {
        this.titular = titular1;
    }

    /**
     *
     * @param cantidad
     * @throws IllegalArgumentException
     */
    public void hacerIngreso(double cantidad) throws IllegalArgumentException {
        if (cantidad < 0) {
            throw new IllegalArgumentException("Cantidad de dinero a ingresar no v�lida");
        } else {
            this.saldo = this.saldo + cantidad;
        }
    }

    /**
     *
     * @param cantidad
     * @throws IllegalArgumentException
     */
    public void retirar(double cantidad) throws IllegalArgumentException {
        if (cantidad > this.saldo) {
            throw new IllegalArgumentException("Cantidad de dinero a retirar no v�lida");
        } else {
            this.saldo = this.saldo - cantidad;
        }
    }

    /**
     *
     * @param CCC
     * @return
     */
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

    /**
     *
     * @param CCC
     * @return
     */
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
     *
     * @param CCC
     * @return
     */
    public String toString(String CCC) {
        return "Titular: " + this.titular + ", CCC: " + CCC + ", Saldo: " + this.saldo;
    }

}
