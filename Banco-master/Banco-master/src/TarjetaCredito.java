public class TarjetaCredito extends Tarjeta{

    int cupo;
    int gasto;

    public TarjetaCredito(int numCuenta, String tipoCuenta, int saldoCuenta, int numTarjeta, int cupo, int gasto) {
        super(numCuenta, tipoCuenta, saldoCuenta, numTarjeta);
        this.cupo = cupo;
        this.gasto = gasto;
    }

    public void consultarCupo(){

    }

    public void consultarGasto(){

    }

    public void pagarTarjeta(){

    }

}
