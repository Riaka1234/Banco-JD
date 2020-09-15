public class Cuenta {

    int numCuenta;
    String tipoCuenta;
    int saldoCuenta;

    public Cuenta(int numCuenta, String tipoCuenta,int saldoCuenta) {
        this.numCuenta = numCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public void consignarCuenta (int dinero){

    }

    public void transferirCuenta (int numCuenta,int dinero){

    }

    public void retirarDinero(int dinero){

    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
}
