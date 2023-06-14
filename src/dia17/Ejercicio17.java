package dia17;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author victor
 * @version 1.0
 *
 */
public class Ejercicio17 {
    public static void main(String[] args) {

        String palabra;

        /* Indica que el usuario debe ingresar una palabra , no vacio */
        do {

            System.out.println("Ingrese una palabra o texto");
            Scanner leer = new Scanner(System.in);
            palabra = leer.nextLine();

        }while( palabra.isEmpty() );

        System.out.println("Vocales : " +  getVocales( palabra ) );
        System.out.println("Consonantes : " + getConsonantes( palabra ));

    }

    /**
     * Función que retorna la cantidad de vocales en una palabra
     *
     * @param   palabra palabra o frase de texto
     * @return vocales - cantidad de vocales de la palabra
     */
    public static int getVocales( String palabra ){

        int vocales = 0;
        String strVocal = "aeiouáéíóúAEIOUÁÉÍÓÚ";

        for (int i = 0; i < palabra.length() ; i++) {

            if (strVocal.indexOf( palabra.charAt(i)) != -1){
                vocales++;
            }
        }

        return vocales;

    }

    /**
     * Función que retorna la cantidad de consonantes en una palabra
     *
     * @param palabra
     * @return consonantes - cantidad de consonantes de la palabra
     */
    public static int getConsonantes( String palabra){

        int consonantes = 0 ;

        /* Expresión regular para las consonantes para evitar que simbolos especiales cuenten como consonantes */
        String expresionConsonante = "[A-Za-z]";
        /* definir un objeto de la librería Pattern , para cargar la expresion regular que incluye las consonantes */
        Pattern patron = Pattern.compile(expresionConsonante);
        /* definir el string que contiene solo las vocales que serán halladas cuando se busque alguna letra específica */
        String strVocal = "aeiouáéíóúAEIOUÁÉÍÓÚ";
        
        
        for (int i = 0; i < palabra.length() ; i++) {

            if (strVocal.indexOf( palabra.charAt(i)) == -1){
               
                if( patron.matcher( String.valueOf( palabra.charAt(i) )).find() ){
                    consonantes ++;
                }
            }
        }
        
        return consonantes;

    }

}
