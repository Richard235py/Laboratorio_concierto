
import java.util.Date;

public class Venta {
    private Date fecha = new Date();
    private int monto;

    public Venta() {
        this.monto = 100; // monto de prueba
    }

    public boolean anular() {
        System.out.println("Venta anulada con monto: " + monto);
        return true;
    }

    public int getMonto() {
        return monto;
    }
}
