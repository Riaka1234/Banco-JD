public class Tarjeta extends Cuenta{

    int numTarjeta;

    public Tarjeta(int numCuenta, String tipoCuenta, int saldoCuenta, int numTarjeta) {
        super(numCuenta, tipoCuenta, saldoCuenta);
        this.numTarjeta = numTarjeta;
    }

    public void realizarCompra(int numCuenta, int dinero){

    }

}
