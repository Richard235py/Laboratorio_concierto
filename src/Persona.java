
import java.util.ArrayList;

public class Persona {
    private String nombres;
    private String apellidos;
    private String dni;
    private String contrasena;
    private ArrayList<Tarjeta> tarjetas = new ArrayList<>();
    private ArrayList<Venta> ventas = new ArrayList<>();

    public boolean registrarTarjeta(Tarjeta t) {
        tarjetas.add(t);
        System.out.println("Tarjeta registrada: " + t.getNumero());
        return true;
    }

    public boolean eliminarTarjeta(Tarjeta t) {
        tarjetas.remove(t);
        System.out.println("Tarjeta eliminada: " + t.getNumero());
        return true;
    }

    public boolean anularVenta(Venta v) {
        ventas.remove(v);
        System.out.println("Venta anulada con monto: " + v.getMonto());
        return true;
    }

    public boolean comprar(Venta v) {
        ventas.add(v);
        System.out.println("Compra realizada con monto: " + v.getMonto());
        return true;
    }
}
