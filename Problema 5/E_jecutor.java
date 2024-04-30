import java.util.Random;

public class E_jecutor {
    public static void main(String[] args) {
        
        Random entrada = new Random();
        String[] nombres = {"Sol", "Junior", "Pedro", "Jorge", "Jhon", "Laura", "Stiven"};
        String nombre = nombres[entrada.nextInt(nombres.length)];  
        double calificacionMateria1 = entrada.nextDouble() * 10;   
        double calificacionMateria2 = entrada.nextDouble() * 10;   
        double calificacionMateria3 = entrada.nextDouble() * 10;  

        Estudiante estudiante = new Estudiante(nombre, calificacionMateria1, calificacionMateria2, calificacionMateria3);

        System.out.println("Detalles del estudiante:");
        System.out.println(estudiante.toString());
    }
}
