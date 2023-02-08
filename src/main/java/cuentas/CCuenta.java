package cuentas;

/**
 * Clase para realizar ingresos o retiradas de saldo
 * @author Jaime Antonio Sánchez Peso
 * @version 1.0
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin parámetros
     */
    public CCuenta()
    {
    }

    /**
     * Constructo con parámetros
     * @param nom - nombre
     * @param cue - cuenta
     * @param sal - saldo
     * @param tipo - tipo

     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Para ver el saldo actual
     * @return Saldo - importe saldo actual
     */
    public double estado()
    {
        return getSaldo();
    }

     /**
      * Suma la cantidad al saldo actual 
     * @param cantidad importe a ingresar
     * @throws java.lang.Exception cuando cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Resta la cantidad al saldo actual 
     * @param cantidad importe a retirar
     * @throws java.lang.Exception cuando cantidad es negativa Y saldo insuficiente 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Getter nombre
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter nombre
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter saldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter saldo
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter tipoInterés
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Setter tipoInterés
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
