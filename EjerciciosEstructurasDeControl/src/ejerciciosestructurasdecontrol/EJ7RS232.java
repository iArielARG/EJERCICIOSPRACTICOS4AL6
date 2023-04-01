//REALIZAR UN PROGRAMA QUE SIMULE EL FUNCIONAMIENTO DE UN DISPOSITIVO
//RS232, ESTE TIPO DE DISPOSITIVO LEE CADENAS ENVIADAS POR EL USUARIO. LAS
//CADENAS DEBEN LLEGAR CON UN FORMATO FIJO: TIENEN QUE SER DE UN MÁXIMO
//DE 5 CARACTERES DE LARGO, EL PRIMER CARACTER TIENE QUE SER X Y EL ÚLTIMO
//TIENE QUE SER UNA O.
//LAS SECUENCIAS LEÍDAS QUE RESPETEN EL FORMATO SE CONSIDERAN CORRECTAS,
//LA SECUENCIA ESPECIAL "&&&&&" MARCA EL FINAL DE LOS ENVÍOS (LLAMÉMOSLA
//FDE), Y TODA SECUENCIA DISTINTA DE FDE, QUE NO RESPETE EL FORMATO SE CONSIDERA INCORRECTA.
//AL FINALIZAR EL PROCESO, SE IMPRIME UN INFORME INDICANDO LA CANTIDAD DE
//LECTURAS CORRECTAS E INCORRECTAS RECIBIDAS. PARA RESOLVER EL EJERCICIO
//DEBERÁ INVESTIGAR CÓMO SE UTILIZAN LAS SIGUIENTES FUNCIONES DE JAVA
//SUBSTRING(). LENGTH(), EQUALS().
package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ7RS232 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        String fde = "&&&&&";
        int sumarCorrectas = 0;
        int sumarIncorrectas = 0;
        boolean bandera;
        boolean condicion1;
        boolean condicion2;
        boolean condicion3;
        
        System.out.println("BIENVENIDO AL PROGRAMA QUE PIDE CADENAS DE 5 DÍGITOS QUE");
        System.out.println("COMIENCEN CON X Y TERMINEN CON O.");
        System.out.println("******************************************************");
        do{
            System.out.println("INGRESE UNA CADENA DE CARACTERES Y PRESIONE ENTER");
            System.out.println("PARA FINALIZAR INGRESE &&&&&");
            cadena = leer.nextLine();
            condicion1 = cadena.substring(0, 1).equals("X");
            condicion2 = cadena.substring(4, 5).equals("O");
            condicion3 = cadena.length() == 5;
            bandera = condicion1 && condicion2 && condicion3;
            System.out.println(bandera);
            if(bandera){
                sumarCorrectas = sumarCorrectas + 1;
            }else{
                sumarIncorrectas = sumarIncorrectas + 1;
            }
            System.out.println(sumarCorrectas);
        }while(!(cadena.equalsIgnoreCase(fde)));
            System.out.println("LA CANTIDAD DE LECTURAS CORRECTAS ES: " + sumarCorrectas);
            System.out.println("LA CANTIDAD DE LECTURAS INCORRECTAS ES: " + sumarIncorrectas);
            System.out.println("*************************************************************");
            System.out.println("EL PROGRAMA HA FINALIZADO");
            System.out.println("GRACIAS POR UTILIZAR NUESTRO SERVICIO. :D");
    }
    
}
