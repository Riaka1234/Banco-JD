import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class TestCuenta {

    @Test
    public void consignarCuenta(){

        int numCuenta=10;
        String tipoCuenta="Credito";
        int saldoCuenta=10;
        int dinero=100;

        saldoCuenta=saldoCuenta+dinero;

        System.out.println(saldoCuenta);
    }

    @Test
    public void transferirCuenta(){

        int numCuenta=10;
        String tipoCuenta="Credito";
        int saldoCuenta=10;

        int dineroATransferir=10;
        Cuenta cuentaATransferir=new Cuenta(20,"Debito",0);
        int saldoCuenta2=cuentaATransferir.getSaldoCuenta();

        System.out. println("Antes de la transferencia");
        System.out.println("Saldo Cuenta = "+saldoCuenta);
        System.out.println("Saldo Cuenta A La Que Se Le Transfirio = "+cuentaATransferir.getSaldoCuenta());

        saldoCuenta=saldoCuenta-dineroATransferir;
        cuentaATransferir.setSaldoCuenta(saldoCuenta2+dineroATransferir);

        System.out. println("Despues de la transferencia");
        System.out.println("Saldo Cuenta = "+saldoCuenta);
        System.out.println("Saldo Cuenta A La Que Se Le Transfirio = "+cuentaATransferir.getSaldoCuenta());

    }

    @Test
    public void retirarDinero(){

        int numCuenta=10;
        String tipoCuenta="Credito";
        int saldoCuenta=10;
        int dinero=10;

        saldoCuenta=saldoCuenta-dinero;

        System.out.println("Saldo despues del retiro = "+saldoCuenta);
    }

}
