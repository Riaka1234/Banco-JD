import org.junit.jupiter.api.Test;

class TarjetaCreditoTest {
    @Test
    public void consultarCupo(){
        int numCuenta=10;
        String tipoCuenta="Credito";
        int cupo=1000;
        System.out.println("Saldo tarjeta de " +tipoCuenta+ " # "+numCuenta+" es: " +cupo);
    }
    @Test
    public void consultarGasto(){
        int numCuenta=10;
        String tipoCuenta="Credito";
        double cupoCuenta=544.89;
        double cupodisponible=1000;
        double gasto;
        gasto= cupodisponible-cupoCuenta;
        System.out.println("el dinero gastado del cupo asignado es $"+gasto);
    }
    @Test
    public void pagarTarjeta(){
        int numCuenta=10;
        String tipoCuenta="Credito";
        double cupoCuenta=1000;
        double dinero=100;
        int cuotas=5;
        double pago;
        double interes =1.056;
        Cuenta cuentaApagar=new Cuenta(20,"Debito",0);
        int saldoCuenta2=cuentaApagar.getSaldoCuenta();
        cupoCuenta=cupoCuenta-dinero;
        pago=(dinero/cuotas)*interes;
        System.out.println("el pago de este mes es: $"+pago);
    }
//prueba
}