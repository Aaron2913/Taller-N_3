package problema4.Metodos;

public class EquipoCelulares {
    
    private String sistemaOperativo;
    private double tamanioPantalla;
    private double costoInicial;
    private double iva;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String informacionIMEI;
        
    
    // metodos establecer y calcular
    public void establecerSistemaOperativo(String sistema){
        sistemaOperativo = sistema;
    }
    
    public void establecerTamanioPantalla(double tamanio){
        tamanioPantalla = tamanio;
    }
    
    public void establecerCostoInicial(double costo_I){
        costoInicial = costo_I;
    }
    
    public void establecerIVA(double i){
        iva = i;
    }
    
    public void calcularIVACostoInicial(){
        ivaCostoInicial = costoInicial * iva;
    }
    
    public void calcularCostoFinal(){
        costoFinal = costoInicial + ivaCostoInicial;
    }
    
    public void establecerDireccionMac(String direc){
        direccionMac = direc;
    }
    
    public void establecerInformacionIMEI(String imei){
        informacionIMEI = imei;
    }
    
    // metodos obtener
    public String obtenerSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public double obtenerTamanioPantalla(){
        return tamanioPantalla;
    }
    
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    
    public double obtenerIVA(){
        return iva;
    }
    
    public double obtenerIVACostoInicial(){
        return ivaCostoInicial;
    }
    
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    
    public String obtenerDireccionMac(){
        return direccionMac;
    }
    
    public String obtenerInformacionIMEI(){
        return informacionIMEI;
    }
}
