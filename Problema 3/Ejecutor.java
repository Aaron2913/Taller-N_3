package problema3;

import problema3.Metodos.InstitucionesEducativas;

public class Ejecutor {

    public static void main(String[] args) {
        
        InstitucionesEducativas estudianteUno = new InstitucionesEducativas();
        InstitucionesEducativas estudianteDos = new InstitucionesEducativas();
        
        // Datos Primer Objeto
        String nombre = "La Salle";
        String tipoInstitucion = "Privado";
        int numeroAlumnos = 2569;
        int numeroDocentes = 268;
        int numeroSedes = 1;
        double gastoEstudiante = 600;        
        
        estudianteUno.establecerNombre(nombre);
        estudianteUno.establecerTipoInstitucion(tipoInstitucion);
        estudianteUno.establecerAlumnos(numeroAlumnos);
        estudianteUno.establecerDocentes(numeroDocentes);
        estudianteUno.establecerSedes(numeroSedes);
        estudianteUno.establecerGastoEstudiante(gastoEstudiante);
        estudianteUno.calcularPresupuesto();
        
        // Datos Segundo Objeto
        nombre = "Daniel Alvarez Burneo";
        tipoInstitucion = "Publica";
        numeroAlumnos = 5012;
        numeroDocentes = 231;
        numeroSedes = 7;
        gastoEstudiante = 150;        
        
        estudianteDos.establecerNombre(nombre);
        estudianteDos.establecerTipoInstitucion(tipoInstitucion);
        estudianteDos.establecerAlumnos(numeroAlumnos);
        estudianteDos.establecerDocentes(numeroDocentes);
        estudianteDos.establecerSedes(numeroSedes);
        estudianteDos.establecerGastoEstudiante(gastoEstudiante);
        estudianteDos.calcularPresupuesto();
        
        // Imprimir Datos del objeto uno
        System.out.printf("**ADMINISTRACION DE INSTITUCIONES EDUCATIVAS**\n\n"
                + "Nombre de la Institucion: %s\nTipo de Institucion: %s\n"
                + "Numero de Alumnos: %d\nNumero de Docentes: %d\n"
                + "Numero de Sedes: %d\nGasto por Estudiante: %.2f\n"
                + "Presupuesto: %.2f\n",estudianteUno.obtenerNombre(),
                estudianteUno.obtenerTipoInstitucion(),
                estudianteUno.obtenerAlumnos(),
                estudianteUno.obtenerDocentes(),
                estudianteUno.obtenerSedes(),
                estudianteUno.obtenerGastoEstudiante(),
                estudianteUno.obtenerPresupuesto());
        
        System.out.println("-------------");
        
        // Imprimir Datos del objeto dos
        System.out.printf("\n**ADMINISTRACION DE INSTITUCIONES EDUCATIVAS**\n\n"
                + "Nombre de la Institucion: %s\nTipo de Institucion: %s\n"
                + "Numero de Alumnos: %d\nNumero de Docentes: %d\n"
                + "Numero de Sedes: %d\nGasto por Estudiante: %.2f\n"
                + "Presupuesto: %.2f\n",estudianteDos.obtenerNombre(),
                estudianteDos.obtenerTipoInstitucion(),
                estudianteDos.obtenerAlumnos(),
                estudianteDos.obtenerDocentes(),
                estudianteDos.obtenerSedes(),
                estudianteDos.obtenerGastoEstudiante(),
                estudianteDos.obtenerPresupuesto());
    }    
}
