
import java.util.ArrayList;

public class Concierto {
    private String nombre;
    private String fecha;
    private ArrayList<Zona> zonas = new ArrayList<>();

    public boolean agregarZona(String nombre) {
        Zona z = new Zona(nombre, 5, 50);
        zonas.add(z);
        System.out.println("Zona agregada: " + nombre);
        return true;
    }

    public boolean eliminarZona(String nombre) {
        zonas.removeIf(z -> z.getNombre().equals(nombre));
        System.out.println("Zona eliminada: " + nombre);
        return true;
    }
}
