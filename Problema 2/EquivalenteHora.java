package problema2.Metodos;

public class EquivalenteHora {
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    
    
    public void establecerHoras(int c) {
        horas = c;
    }
    
    public void calcularMinutos() {
        minutos = horas * 60;
    }
    
    public void calcularSegundos() {
        segundos = horas *3600;
    }
            
    public void calcularDias() {
        dias = horas * 0.04166667;
    }
    
   

    public int obtenerHoras() {
        return horas;
    }
    
    public int obtenerMinutos() {
        return minutos;
    }
    
    public int obtenerSegundos() {
        return segundos;
    }
    
    public double obtenerDias() {
        return dias;
    }

}
