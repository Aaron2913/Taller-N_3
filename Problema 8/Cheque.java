import java.util.Random;

class Cheque {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    // Constructor
    public Cheque(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
        this.comisionBanco = calcularComisionBanco();
    }

    private double calcularComisionBanco() {
        return valorCheque * 0.003;
    }

    public String toString() {
        return "Nombre del cliente: " + nombreCliente + "\n" +
               "Nombre del banco: " + nombreBanco + "\n" +
               "Valor del cheque: " + valorCheque + "\n" +
               "Comision del banco: " + comisionBanco;
    }
}
