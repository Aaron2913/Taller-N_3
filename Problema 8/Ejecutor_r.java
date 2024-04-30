import java.util.Random;

public class Ejecutor_r {
    public static void main(String[] args) {
        
        Random entrada = new Random();
        String[] nombresClientes = {"Juan", "Hower", "Cris", "Tony", "Jese", "Lautaro", "Mario"};
        String[] nombresBancos = {"Banco Loja", "Banco Pichincha", "Banco Guayaquill", "Banco Coopmego", "Banco del Pacifico"};
        String nombreCliente = nombresClientes[entrada.nextInt(nombresClientes.length)];  // Seleccionar un nombre aleatorio
        String nombreBanco = nombresBancos[entrada.nextInt(nombresBancos.length)];  // Seleccionar un banco aleatorio
        double valorCheque = entrada.nextDouble() * 10000;   // Valor aleatorio entre 0 y 10000

        Cheque cheque = new Cheque(nombreCliente, nombreBanco, valorCheque);

        System.out.println("Detalles del cheque:");
        System.out.println(cheque.toString());
    }
}
