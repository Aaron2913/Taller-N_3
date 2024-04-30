package problema4;

import problema4.Metodos.EquipoCelulares;

public class Ejectuor {

    public static void main(String[] args) {
        
        EquipoCelulares ventaUno = new EquipoCelulares();
        EquipoCelulares ventaDos = new EquipoCelulares();
        
        // Datos Primer Objeto
        String sistemaOperativo = "IOS";
        double tamanioPantalla = 6.1;
        double costoInicial = 949.99;
        double IVA = 0.15;
        String direccionMac = "00:1e:c2:11:3A:B7";
        String informacionIMEI = "013554006297015";
        
        ventaUno.establecerSistemaOperativo(sistemaOperativo);
        ventaUno.establecerTamanioPantalla(tamanioPantalla);
        ventaUno.establecerCostoInicial(costoInicial);
        ventaUno.establecerIVA(IVA);
        ventaUno.calcularIVACostoInicial();
        ventaUno.calcularCostoFinal();
        ventaUno.establecerDireccionMac(direccionMac);
        ventaUno.establecerInformacionIMEI(informacionIMEI);
        
        
        // Datos Segundo Objeto
        sistemaOperativo = "Android";
        tamanioPantalla = 6.7;
        costoInicial = 399.99;
        IVA = 0.15;
        direccionMac = "00:1b:h9:58:9T:B7";
        informacionIMEI = "012587965432587";
        
        ventaDos.establecerSistemaOperativo(sistemaOperativo);
        ventaDos.establecerTamanioPantalla(tamanioPantalla);
        ventaDos.establecerCostoInicial(costoInicial);
        ventaDos.establecerIVA(IVA);
        ventaDos.calcularIVACostoInicial();
        ventaDos.calcularCostoFinal();
        ventaDos.establecerDireccionMac(direccionMac);
        ventaDos.establecerInformacionIMEI(informacionIMEI);
        
        // Imprimir Datos del objeto uno
        System.out.printf("**EQUIPO CELULARES**\n\nSistema Operativo: %s\n"
                + "Tamanio Pantalla: %.2f\nCosto Inicial: %.2f\nIVA: %s\n"
                + "IVA costo inicial: %.2f\nCosto Final: %.2f\nDireccion MAC: "
                + "%s\nInformacion IMEI: %s\n", 
                ventaUno.obtenerSistemaOperativo(),
                ventaUno.obtenerTamanioPantalla(),
                ventaUno.obtenerCostoInicial(),ventaUno.obtenerIVA(),
                ventaUno.obtenerIVACostoInicial(),
                ventaUno.obtenerCostoFinal(),
                ventaUno.obtenerDireccionMac(),
                ventaUno.obtenerInformacionIMEI());
        
        System.out.println("===========================================");
        
        // Imprimir Datos del objeto dos
        System.out.printf("\n**EQUIPO CELULARES**\n\nSistema Operativo: %s\n"
                + "Tamanio Pantalla: %.2f\nCosto Inicial: %.2f\nIVA: %s\n"
                + "IVA costo inicial: %.2f\nCosto Final: %.2f\nDireccion MAC: "
                + "%s\nInformacion IMEI: %s\n", 
                ventaDos.obtenerSistemaOperativo(),
                ventaDos.obtenerTamanioPantalla(),
                ventaDos.obtenerCostoInicial(),ventaDos.obtenerIVA(),
                ventaDos.obtenerIVACostoInicial(),
                ventaDos.obtenerCostoFinal(),
                ventaDos.obtenerDireccionMac(),
                ventaDos.obtenerInformacionIMEI());
        
    }
    
}
