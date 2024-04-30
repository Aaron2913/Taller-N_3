package problema1;

import problema1.Metodos.Terreno;

public class Ejecutor {

    public static void main(String[] args) {
        Terreno terreno_Uno = new Terreno();
        Terreno terreno_Dos = new Terreno();
        
        double valorMetroCuadrado = 50.00;
        double largo = 20.00;
        double ancho = 10.00;
        
        terreno_Uno.establecerValorMetroCuadrado(valorMetroCuadrado);
        terreno_Uno.establecerLargo(largo);
        terreno_Uno.establecerAncho(ancho);        
        terreno_Uno.calcularArea();
        terreno_Uno.calcularCostoTerreno();

        valorMetroCuadrado = 60.00;
        largo = 70.00;
        ancho = 35.00;
        
        terreno_Dos.establecerValorMetroCuadrado(valorMetroCuadrado);
        terreno_Dos.establecerLargo(largo);
        terreno_Dos.establecerAncho(ancho);        
        terreno_Dos.calcularArea();
        terreno_Dos.calcularCostoTerreno();
        
        System.out.printf("**TERRENO UNO**\n\nValor por Metro Cuadrado: %.3f\n"
                + "Largo del Terreno: %.2f\nAncho del Terreno: %.2f\n"
                + "Area del Terreno: %.2f\nCosto del Terreno: %.2f\n\n", 
                terreno_Uno.obtenerValorMetroCuadrado(), 
                terreno_Uno.obtenerLargo(), terreno_Uno.obtenerAncho(), 
                terreno_Uno.obtenerArea(),
                terreno_Uno.obtenerCostoTerreno());
        
        System.out.println("===========================================");

        System.out.printf("**TERRENO DOS**\n\nValor por Metro Cuadrado: %.3f\n"
                + "Largo del Terreno: %.2f\nAncho del Terreno: %.2f\n"
                + "Area del Terreno: %.2f\nCosto del Terreno: %.2f\n\n", 
                terreno_Dos.obtenerValorMetroCuadrado(), 
                terreno_Dos.obtenerLargo(), terreno_Dos.obtenerAncho(), 
                terreno_Dos.obtenerArea(),
                terreno_Dos.obtenerCostoTerreno());
    }
    
}
