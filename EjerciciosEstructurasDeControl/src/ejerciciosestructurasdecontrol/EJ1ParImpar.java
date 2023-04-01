//CREAR UN PROGRAMA QUE DADO UN NÚMERO DETERMINE SI ES PAR O IMPAR.
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ1ParImpar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("***********************************************************");
        System.out.println("BIENVENIDO AL PROGRAMA QUE DETERMINA SI EL NÚMERO INGRESADO");
        System.out.println("ES PAR O IMPAR.");
        System.out.println("***********************************************************");
        System.out.println("INGRESE UN NÚMERO Y PRESIONE ENTER");
        int numero = leer.nextInt();
        
        if((numero % 2) == 0){
            System.out.println("EL NÚMERO INGRESADO ES PAR");
        }else{
            System.out.println("EL NÚMERO INGRESADO ES IMPAR");
        }
        System.out.println("************************************************************");
        System.out.println("EL PROGRAMA HA FINALIZADO");
        System.out.println("GRACIAS POR UTILIZAR NUESTRO SERVICIO");
        System.out.println("************************************************************");        
    }
    
}
