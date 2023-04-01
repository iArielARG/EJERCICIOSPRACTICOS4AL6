//CREAR UN PROGRAMA QUE PIDA UNA FRASE Y SI ESA FRASE ES IGUAL A "EUREKA" EL PROGRAMA
//PONDRÁ UN MENSAJE DE CORRECTO, SINO MOSTRARÁ UN MENSAJE DE INCORRECTO.
//NOTA: INVESTIGAR LA FUNCIÓN EQUALS() EN JAVA.
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ2FraseEureka {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("BIENVENIDO AL PROGRAMA QUE PIDE UNA FRASE Y LA COMPARA");
        System.out.println("CON LA ALMACENADA.");
        System.out.println("******************************************************");
        System.out.println("INGRESE UNA FRASE Y PRESIONE ENTER");
        String frase = leer.nextLine();
        frase = frase.toUpperCase();
        String eureka = "EUREKA";
        
        if (frase.equals(eureka)){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        System.out.println("******************************************************");
        System.out.println("EL PROGRAMA HA FINALIZADO");
        System.out.println("GRACIAS POR UTILIZAR NUESTRO SERVICIO. :D");
    }
    
}
