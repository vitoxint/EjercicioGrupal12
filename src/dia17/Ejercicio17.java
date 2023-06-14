package dia17;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Victor Rivas
 * @version 1.0
 *
 */
public class Ejercicio17 {
    public static void main(String[] args) {

        String palabra;

        // Indica que el usuario debe ingresar una palabra , no vacio 
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

        /* inicializa en la variable que almacena la cantidad de vocales */
        int vocales = 0;
        /* inicializa la variable vocales en 0 , que contará las vocales del string palabra */
        String strVocal = "aeiouáéíóúAEIOUÁÉÍÓÚ";

        for (int i = 0; i < palabra.length() ; i++) {

            if (strVocal.indexOf( palabra.charAt(i)) != -1){
                // si el caracter se encuentra dentro del string strVocal , suma 1 a la variable vocales
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
        /* inicializa en cero la variable que cuenta y retorna la cantidad de consonantes */

        String expresionConsonante = "[A-Za-z]";
        /* Expresión regular para las consonantes para evitar que simbolos especiales cuenten como consonantes */

        Pattern patron = Pattern.compile(expresionConsonante);
        /* definir un objeto de la librería Pattern , para cargar la expresion regular que incluye las consonantes */

        String strVocal = "aeiouáéíóúAEIOUÁÉÍÓÚ";
        /* definir el string que contiene solo las vocales que serán para descartarlas de las consonantes en la palabra */
        
        
        for (int i = 0; i < palabra.length() ; i++) {

            if (strVocal.indexOf( palabra.charAt(i)) == -1){ 
                // Si el caracter de la posicion i del string no se encuentra en strVocal
               
                if( patron.matcher( String.valueOf( palabra.charAt(i) )).find() ){ 
                    // Compara si que el caracter se encuentra dentro de la expresión regular , en caso afirmativo suma 1 a la variable consonantes
                    consonantes ++;
                }
            }
        }
        
        return consonantes;

    }

}
