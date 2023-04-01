//REALIZAR UN PROGRAMA QUE SOLO PERMITA INTRODUCIR FRASES O PALABRAS
//DE 8 CARACTERES DE LARGO. SI EL USUARIO INGRESA UNA FRASE O PALABRA DE 8
//CARACTERES DE LARGO, DEBERÁ DE IMPRIMIR UN MENSAJE POR PANTALLA QUE DIGA
//"CORRECTO", EN CASO CONTRARIO, SE DEBERÁ IMPRIMIR "INCORRECTO".
//NOTA: INVESTIGAR LA FUNCIÓN LENGHT() DE JAVA.
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ3FraseLargo8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("BIENVENIDO AL PROGRAMA QUE PIDE UNA FRASE");
        System.out.println("DE UN LARGO DETERMINADO.");
        System.out.println("******************************************************");
        System.out.println("INGRESE UNA FRASE Y PRESIONE ENTER");
        String frase = leer.nextLine();
        
        if ((frase.length()) <= 8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        System.out.println("******************************************************");
        System.out.println("EL PROGRAMA HA FINALIZADO");
        System.out.println("GRACIAS POR UTILIZAR NUESTRO SERVICIO. :D");
    }
    
}
