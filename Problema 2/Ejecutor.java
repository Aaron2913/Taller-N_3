package problema2;

import problema2.Metodos.EquivalenteHora;

public class Ejecutor {

    public static void main(String[] args) {
        EquivalenteHora conversionHorasUno = new EquivalenteHora();
        EquivalenteHora conversionHorasDos = new EquivalenteHora();
        
        int horas = 24;        
        
   
        conversionHorasUno.establecerHoras(horas);        
        conversionHorasUno.calcularMinutos();
        conversionHorasUno.calcularSegundos();
        conversionHorasUno.calcularDias();
        
      
        horas = 192;
        
        conversionHorasDos.establecerHoras(horas);        
        conversionHorasDos.calcularMinutos();
        conversionHorasDos.calcularSegundos();
        conversionHorasDos.calcularDias();
        

        System.out.printf("**CONVERSIONES**\n\n**HORA: %d**\nHoras a minutos: %d\n"
                + "Horas a segundos: %d\nHoras a dias: %.2f\n", 
                conversionHorasUno.obtenerHoras(), 
                conversionHorasUno.obtenerMinutos(), 
                conversionHorasUno.obtenerSegundos(), 
                conversionHorasUno.obtenerDias());
        
        System.out.println("--------------------");
        

        System.out.printf("**CONVERSIONES**\n\n**HORA: %d**\nHoras a minutos: %d\n"
                + "Horas a segundos: %d\nHoras a dias: %.2f\n", 
                conversionHorasDos.obtenerHoras(), 
                conversionHorasDos.obtenerMinutos(), 
                conversionHorasDos.obtenerSegundos(), 
                conversionHorasDos.obtenerDias());
    }
    
}
