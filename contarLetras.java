package javaapplication82;

import java.util.Scanner;

public class contarLetras {

    public int conteoLetras(String frase) {
        //PARA CONTAR LAS LETRAS QUE VAN DENTRP DE ESE ARREGLO
        
        char letras[]={'a', 'b','c','d','e','m'};
        int numeroLetras = 0;
        String fraseMinusculas = frase.toLowerCase();

        for (int i = 0; i < fraseMinusculas.length(); i++) {
            //Para contar las letras que hay dentro de la frase
            char letra=fraseMinusculas.charAt(i);
            for (int j = 0; j < letras.length; j++) {
                if (letra==letras[j]) {
                    numeroLetras++;
                    break;
                }
            }
            //Para contar cuantos caracteres tiene la frase
            //if (letra != ' ') {
                //numeroLetras++;
            //}
        }
        return numeroLetras;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase :");
        frase = entrada.nextLine();
 
        contarLetras contador = new contarLetras();
        System.out.println(contador.conteoLetras(frase));
    }

}

