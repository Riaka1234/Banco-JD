import org.junit.jupiter.api.Test;

public class TarjetaTest {
@Test
    public void realizarcompra(){
    int numCuenta=10;
    String tipoCuenta="Credito";
    int saldoCuenta=1000;
    int dinero=100;
    Cuenta cuentaApagar=new Cuenta(20,"Debito",0);
    int saldoCuenta2=cuentaApagar.getSaldoCuenta();
    System.out. println("Antes de la COMPRA");
    System.out.println("tipo de tarjeta "+tipoCuenta);
    System.out.println("cupo Cuenta CLIENTE = $"+saldoCuenta);
    System.out.println("Saldo Cuenta A La Que Se Le COMPRA= $"+cuentaApagar.getSaldoCuenta());

    saldoCuenta=saldoCuenta-dinero;
    cuentaApagar.setSaldoCuenta(saldoCuenta2+dinero);

    System.out. println("Despues de la COMPRA");
    System.out.println("cupo Cuenta CLIENTE = $"+saldoCuenta);
    System.out.println("Saldo Cuenta A La Que Se Le COMPRA = $"+cuentaApagar.getSaldoCuenta());


}

}