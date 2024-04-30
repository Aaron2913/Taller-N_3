
// Definición de la clase Estudiante
class Estudiante {
    private String nombre;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedio;
    private String estado;

    // Constructor
    public Estudiante(String nombre, double calificacionMateria1, double calificacionMateria2, double calificacionMateria3) {
        this.nombre = nombre;
        this.calificacionMateria1 = calificacionMateria1;
        this.calificacionMateria2 = calificacionMateria2;
        this.calificacionMateria3 = calificacionMateria3;
        this.promedio = (calificacionMateria1 + calificacionMateria2 + calificacionMateria3) / 3.0;
        this.estado = (this.promedio >= 6.5) ? "Aprobado" : "Reprobado";
    }

    // Método para obtener el estado del estudiante
    public String getEstado() {
        return estado;
    }

    // Método para obtener los detalles del estudiante
    public String toString() {
        return "Nombre: " + this.nombre + "\n" +
               "Calificación Materia 1: " + this.calificacionMateria1 + "\n" +
               "Calificación Materia 2: " + this.calificacionMateria2 + "\n" +
               "Calificación Materia 3: " + this.calificacionMateria3 + "\n" +
               "Promedio: " + this.promedio + "\n" +
               "Estado: " + this.estado;
    }
}
