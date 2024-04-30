package problema3.Metodos;

public class InstitucionesEducativas {
    
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastoEstudiante;
    private double presupuesto;
    
    
    //metodos establecer y calcular
    public void establecerNombre(String name){
        nombre = name;
    }
    
    public void establecerTipoInstitucion(String tipo){
        tipoInstitucion = tipo;
    }
    
    public void establecerAlumnos(int numA){
        numeroAlumnos = numA;
    }
    
    public void establecerDocentes(int numD){
        numeroDocentes = numD;
    }
    
    public void establecerSedes(int numS){
        numeroSedes = numS;
    }
    
    public void establecerGastoEstudiante(double gasto){
        gastoEstudiante = gasto;
    }
    
    public void calcularPresupuesto(){
        presupuesto = numeroAlumnos * gastoEstudiante;
    }
    
    // metodos obtener
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipoInstitucion(){
        return tipoInstitucion;
    }
    
    public int obtenerAlumnos(){
        return numeroAlumnos;
    }
    
    public int obtenerDocentes(){
        return numeroDocentes;
    }
    
    public int obtenerSedes(){
        return numeroSedes;
    }
    
    public double obtenerGastoEstudiante(){
        return gastoEstudiante;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
