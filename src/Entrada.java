
public class Entrada {
    private int numero;
    private String estado = "disponible";

    public Entrada(int numero) {
        this.numero = numero;
    }

    public boolean vender() {
        estado = "vendida";
        System.out.println("Entrada " + numero + " vendida");
        return true;
    }

    public boolean liberar() {
        estado = "disponible";
        System.out.println("Entrada " + numero + " liberada");
        return true;
    }

    public int getNumero() {
        return numero;
    }
}
