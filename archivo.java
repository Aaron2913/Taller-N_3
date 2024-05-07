package examen;
//Con Bytes

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class archivo {

    
        try(FileOutputStream fos = new FileOutputStream("A.txt")){
    String data = "Ejemplo Examen";
        byte b[] = data.getBytes();
        fos.write(b);
        fos.close();
        System.out.println("Se ha escrito el archivo");
    }catch (IOException exception){
            System.out.println("Error");
    }
}
