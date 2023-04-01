//ESCRIBA UN PROGGRAMA EN EL CUAL SE INGRESE UN VALOR LÍMITE POSITIVO
//Y A CONTINUACIÓN SOLICITE NÚMEROS AL USUARIO HASTA QUE LA SUMA DE LOS
//NÚMEROS INTRODUCIDOS SUPERE EL LÍMITE INICIAL.
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ5ValorLimitePositivo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limiteInicial = 0;
        int numero = 0;
        int suma = 0;
        
        System.out.println("BIENVENIDO AL PROGRAMA QUE SUMA LOS NÚMEROS INGRESADOS");
        System.out.println("HASTA LLEGAR AL VALOR LÍMITE ESTABLECIDO.");
        System.out.println("******************************************************");
        
        do {
            System.out.println("INGRESE UN NÚMERO PARA ESTABLECER UN VALOR LÍMITEY PRESIONE ENTER");
            limiteInicial = leer.nextInt();
        }while (limiteInicial < 0);
        
        while (suma < limiteInicial){
            System.out.println("INGRESE UN NÚMERO Y PRESIONE ENTER");
            numero = leer.nextInt();
            suma = suma + numero;
        }
        System.out.println("LA SUMA DE LOS NÚMEROS INGRESADOS HA SUPERADO EL VALOR LÍMITE");
        System.out.println("*************************************************************");
        System.out.println("EL PROGRAMA HA FINALIZADO");
        System.out.println("GRACIAS POR UTILIZAR NUESTRO SERVICIO. :D");
    }
    
}
