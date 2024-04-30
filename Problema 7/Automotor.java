class Automotor {
    private String cedulaPropietario;
    private String marcaPropietario;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    // Constructor
    public Automotor(String cedulaPropietario, String marca_Vehiculo, int anioFabricacion, double valorVehiculo) {
        this.cedulaPropietario = cedulaPropietario;
        this.marcaPropietario = marca_Vehiculo;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
        this.valorMatricula = calcularValorMatricula();
    }

    private double calcularValorMatricula() {
        int antiguedad = 2024 - anioFabricacion;
        return valorVehiculo * 0.002 * antiguedad;
    }

    public String toString() {
        return "Cedula del Propietario: " + cedulaPropietario+ "\n" +
               "Marca del vehiculo: " + marcaPropietario + "\n" +
               "Anio de fabricacion: " + anioFabricacion + "\n" +
               "Valor del vehiculo: " + valorVehiculo + "\n" +
               "Valor de la matricula: " + valorMatricula;
    }
}