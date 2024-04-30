class Profesor {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    // Constructor
    public Profesor(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.sueldoTotal = sueldoBasico * 1.20; // Calculamos el sueldo total como el sueldo básico más el 20%
        this.cedula = cedula;
    }

    // Método para obtener el sueldo total
    public double getSueldoTotal() {
        return sueldoTotal;
    }

    // Método para obtener los detalles del profesor
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Apellido: " + apellido + "\n" +
               "Sueldo Básico: " + sueldoBasico + "\n" +
               "Sueldo Total: " + sueldoTotal + "\n" +
               "Cédula: " + cedula;
    }
}
