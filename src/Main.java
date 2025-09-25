
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Tarjeta tarjeta = new Tarjeta(12345);
        Venta venta = new Venta();
        Concierto concierto = new Concierto();
        Zona zona = new Zona("Zona A", 5, 50);
        Entrada entrada = new Entrada(1);

        persona.registrarTarjeta(tarjeta);
        persona.comprar(venta);
        persona.anularVenta(venta);
        persona.eliminarTarjeta(tarjeta);

        concierto.agregarZona("Zona A");
        concierto.eliminarZona("Zona A");

        zona.generarEntradas();
        zona.mostrarEntrada();
        zona.venderEntrada(1);
        entrada.liberar();
    }
}
