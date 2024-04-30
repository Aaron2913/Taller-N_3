package problema1.Metodos;

public class Terreno {
    
    private double valor;
    private double largo;
    private double ancho;
    private double area;
    private double costo_Terreno;
    
    
    public void establecerValorMetroCuadrado(double metro) {
        valor = metro;
    }
    
    public void establecerLargo(double metro) {
        largo = metro;
    }
    
    public void establecerAncho(double metro) {
        ancho = metro;
    }
    
          
    public void calcularArea() {
        area = largo * ancho;
    }
      
    public void calcularCosto_Terreno() {
        costo_Terreno = valor * area;
    }
    

    public double obtenerValorMetroCuadrado() {
        return valor;
    }
    
    public double obtenerLargo() {
        return largo;
    }
    
    public double obtenerAncho() {
        return ancho;
    }
    
    public double obtenerArea() {
        return area;
    }
    
    public double obtenerCosto_Terreno() {
        return costo_Terreno;
    }
}
