
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona persona = new Persona();
        Concierto concierto = new Concierto();

        System.out.print("Ingrese numero de tarjeta: ");
        int numTarjeta = sc.nextInt();
        Tarjeta tarjeta = new Tarjeta(numTarjeta);
        persona.registrarTarjeta(tarjeta);

        Venta venta = new Venta();
        persona.comprar(venta);

        persona.anularVenta(venta);

        persona.eliminarTarjeta(tarjeta);

        System.out.print("Ingrese nombre de la zona a agregar: ");
        sc.nextLine();
        String nombreZona = sc.nextLine();
        concierto.agregarZona(nombreZona);

        System.out.print("Ingrese nombre de la zona a eliminar: ");
        String eliminarZona = sc.nextLine();
        concierto.eliminarZona(eliminarZona);

        Zona zona = new Zona(nombreZona, 5, 50);
        zona.generarEntradas();
        zona.mostrarEntrada();

        System.out.print("Ingrese numero de entrada a vender: ");
        int numEntrada = sc.nextInt();
        zona.venderEntrada(numEntrada);

        Entrada entrada = new Entrada(numEntrada);
        entrada.liberar();

        sc.close();
    }
}
