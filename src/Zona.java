
import java.util.ArrayList;

public class Zona {
    private String nombre;
    private int capacidad;
    private int precio;
    private ArrayList<Entrada> entradas = new ArrayList<>();

    public Zona(String nombre, int capacidad, int precio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public boolean generarEntradas() {
        for(int i=1; i<=capacidad; i++) {
            Entrada e = new Entrada(i);
            entradas.add(e);
            System.out.println("Entrada generada: " + i);
        }
        return true;
    }

    public Entrada[] mostrarEntrada() {
        System.out.println("Mostrando entradas de la zona: " + nombre);
        return entradas.toArray(new Entrada[0]);
    }

    public Entrada[] venderEntrada(int numero) {
        for(Entrada e : entradas) {
            if(e.getNumero() == numero) {
                e.vender();
            }
        }
        return entradas.toArray(new Entrada[0]);
    }

    public String getNombre() {
        return nombre;
    }
}
