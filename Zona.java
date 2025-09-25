
import java.util.ArrayList;

public class Zona {
    private String nombre;
    private int capacidad;
    private int precio;
    private ArrayList<Entrada> entradas;

    public boolean generarEntradas() {
        return true;
    }

    public Entrada[] mostrarEntrada() {
        return new Entrada[0];
    }

    public Entrada[] venderEntrada(int numero) {
        return new Entrada[0];
    }
}
