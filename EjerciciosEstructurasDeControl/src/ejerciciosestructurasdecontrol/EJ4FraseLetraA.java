//ESCRIBA UN PROGRAMA QUE PIDA UNA FRASE O PALABRA Y VALIDE SI LA PRIMERA
//LETRA DE ESA FRASE ES UNA "A". SI LA PRIMERA LETRA ES UNA "A", SE DEBERÁ DE
//IMPRIMIR UN MENSAJE POR PANTALLA QUE DIGA "CORRECTO", EN CASO CONTRARIO,
//SE DEBERÁ IMPRIMIR "INCORRECTO". NOTA: INVESTIGAR LA FUNCIÓN SUBSTRING Y
//EQUALS() DE JAVA.
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ4FraseLetraA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("BIENVENIDO AL PROGRAMA QUE PIDE UNA FRASE");
        System.out.println("Y VALIDA SI EMPIEZA CON UNA LETRA PREDETERMINADA.");
        System.out.println("******************************************************");
        System.out.println("INGRESE UNA FRASE Y PRESIONE ENTER");
        String frase = leer.nextLine();
        frase = frase.substring(0, 1);
        
        if (frase.equalsIgnoreCase("A")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        System.out.println("******************************************************");
        System.out.println("EL PROGRAMA HA FINALIZADO");
        System.out.println("GRACIAS POR UTILIZAR NUESTRO SERVICIO. :D");
    }
    
}
