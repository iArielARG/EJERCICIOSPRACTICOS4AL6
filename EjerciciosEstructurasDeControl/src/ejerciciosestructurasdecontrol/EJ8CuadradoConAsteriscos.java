//DIBUJAR UN CUADRADO DE N ELEMENTOS POR LADO UTILIZANDO EL CARACTER "*".
//POR EJEMPLO, SI EL CUADRADO TIENE 4 ELEMENTOS POR LADO SE DEBERÁ DIBUJAR
//LO SIGUIENTE:
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ8CuadradoConAsteriscos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int elementos;
        
        elementos = leer.nextInt();
        
        for(int i = 0;i < elementos;i = i + 1){
            System.out.print("*");
        }
        
        System.out.println("");
        
        for(int i = 0;i < elementos - 1;i = i + 1){
            System.out.print("*");
            for(int j = 0;j < elementos - 2;j = j + 1){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        for(int i = 0;i < elementos;i = i + 1){
            System.out.print("*");
        }
    }
    
}
