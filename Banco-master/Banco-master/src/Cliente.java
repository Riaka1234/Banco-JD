import java.util.ArrayList;

public class Cliente {

    String id;
    String nombre;
    ArrayList <Cuenta> producto = new ArrayList();
    Cuenta cuenta;

    public Cliente(String id, String nombre, ArrayList<Cuenta> producto,Cuenta cuenta) {
        this.id = id;
        this.nombre = nombre;
        this.producto = producto;
        this.cuenta = cuenta;
    }

    public void agregarCuenta(Cuenta cuenta){
        producto.add(cuenta);
    }

}
