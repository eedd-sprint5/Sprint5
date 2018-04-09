package Ejercicio01;

public class CuentaBancaria extends SuperClaseCuentaBancaria {


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


    public String toString(String CCC) {
        return "Titular: " + this.getTitular() + ", CCC: " + CCC + ", Saldo: " + this.getSaldo();
    }


    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }


    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    /**
     * @param entidad the entidad to set
     */
    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }


    /**
     * @param oficina the oficina to set
     */
    public void setOficina(String oficina) {
        this.oficina = oficina;
    }


    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }


    /**
     * @param aMin_nombre the min_nombre to set
     */
    public static void setMin_nombre(int aMin_nombre) {
        min_nombre = aMin_nombre;
    }


    /**
     * @param aMax_nombre the max_nombre to set
     */
    public static void setMax_nombre(int aMax_nombre) {
        max_nombre = aMax_nombre;
    }

}
