import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestCliente {
    @Test
    public void agregarCuenta(){
        String id="100";
        String nombre="NombreDePrueba";
        ArrayList<Cuenta> producto = new ArrayList();

        Cuenta cuenta=new Cuenta(10,"Credito",100);
        producto.add(cuenta);

        System.out.println("Id del cliente: "+id+"  Numero de cuenta: "+producto.get(0).getNumCuenta()+"  Tipo de cuenta: "+producto.get(0).getTipoCuenta()
        +"  Saldo: "+producto.get(0).getSaldoCuenta());

    }
}
