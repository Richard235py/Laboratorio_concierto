
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Tarjeta tarjeta = new Tarjeta();
        Venta venta = new Venta();
        Concierto concierto = new Concierto();
        Zona zona = new Zona();
        Entrada entrada = new Entrada();

        persona.comprar();
        venta.anular();
        concierto.agregarZona("Zona A");
        zona.generarEntradas();
        entrada.vender();
        
        System.out.println("El proyecto está funcionando correctamente.");
    }
}
