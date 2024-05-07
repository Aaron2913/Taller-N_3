package examen;
// Con Caracteres
import java.io.*;
import java.io.IOException;

public class ExAmen {

    public static void main(String[] args) {
        //Creamos el Archivo
        try {
            File archivo = new File("A.txt");
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado : " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error 404");
        }

    }

    private void EscribirArchivo() {
        try {
            FileWriter myWriter = new FileWriter("A.txt");
            myWriter.write("Bien Loco -Nova & Jory");
            myWriter.write("TEMAZOO !!!");
            myWriter.close();
            System.out.println("El archivo ha sido escrito");
        } catch (IOException e) {
            System.out.println("Error 302");
        }
    }

    private void LeemosArchivo() {
        System.out.println("Leemos el Archivo:");
        try {
            FileReader myReader = new FileReader("A.txt");
            int i;
            while ((i = myReader.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error de Lectura");
        }

    }

}
