//REALIZAR UN PROGRAMA QUE PIDA DOS NÚMEROS ENTEROS POSITIVOS POR
//TECLADO Y MUESTRE POR PANTALLA EL SIGUIENTE MENÚ: EL USUARIO DEBERÁ ELEGIR
//UNA OPCIÓN Y EL PROGRAMA DEBERÁ MOSTRAR EL RESULTADO POR PANTALLA Y
//LUEGO VOLVER AL MENÚ. EL PROGRAMA DEBERÁ EJECUTARSE HASTA QUE SE ELIJA LA
//OPCIÓN 5. TENER EN CUENTA QUE, SI EL USUARIO SELECCIONA LA OPCIÓN 5, EN
//VEZ DE SALIR DEL PROGRAMA DIRECTAMENTE, SE DEBE MOSTRAR EL SIGUIENTE
//MENSAJE DE CONFIRMACIÓN: ¿ESTÁ SEGURO QUE DESEA SALIR DEL PROGRAMA
//(S/N)? SI EL USUARIO SELECCIONA EL CARACTER "S" SALE DEL PROGRAMA, CASO
//CONTRARIO SE VUELVE A MOSTRAR EL MENÚ.

package ejerciciosestructurasdecontrol;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ6DosNumerosMenu {

    public static void main(String[] args) {
        
        int opcion;
        Scanner leer = new Scanner(System.in);
        double resultado;
        int numero1;
        int numero2;
        int salir;
        salir = 0;
        
        System.out.println("BIENVENIDO AL PROGRAMA QUE PIDE DOS NÚMEROS Y REALIZA");
        System.out.println("DISTINTAS OPERACIONES.");
        System.out.println("******************************************************");
        
        do {
        System.out.println("INGRESE UN NÚMERO POSITIVO Y PRESIONE ENTER");
        numero1 = leer.nextInt();
        }while (numero1 < 1);
        
        do {
        System.out.println("INGRESE OTRO NÚMERO POSITIVO Y PRESIONE ENTER");
        numero2 = leer.nextInt();
        }while (numero2 < 1);
        
        do{
            System.out.println("--------------------");
            System.out.println("| MENU             |");
            System.out.println("| 1. Sumar         |");
            System.out.println("| 2. Restar        |");
            System.out.println("| 3. Multiplicar   |");
            System.out.println("| 4. Dividir       |");
            System.out.println("| 5. Salir         |");
            System.out.println("| Elija opción:    |");
            System.out.println("--------------------");
            System.out.println("INGRESE UNA OPCIÓN Y PRESIONE ENTER");
            opcion = leer.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("USTED HA ELEGIDO SUMAR LOS NÚMEROS INGRESADOS");
                    resultado = numero1 + numero2;
                    System.out.println("EL RESULTADO DE LA OPERACIÓN ES: " + resultado);
                    break;
                case 2:
                    System.out.println("USTED HA ELEGIDO RESTAR LOS NÚMEROS INGRESADOS");
                    resultado = numero1 - numero2;
                    System.out.println("EL RESULTADO DE LA OPERACIÓN ES: " + resultado);
                    break;
                case 3:
                    System.out.println("USTED HA ELEGIDO MULTIPLICAR LOS NÚMEROS INGRESADOS");
                    resultado = numero1 * numero2;
                    System.out.println("EL RESULTADO DE LA OPERACIÓN ES: " + resultado);
                    break;
                case 4:
                    System.out.println("USTED HA ELEGIDO DIVIDIR LOS NÚMEROS INGRESADOS");
                    resultado = numero1 / numero2;
                    System.out.println("EL RESULTADO DE LA OPERACIÓN ES: " + resultado);
                    break;
                case 5:
                    System.out.println("¿ESTÁ SEGURO QUE DESEA SALIR DEL PROGRAMA(1/2)?");
                    System.out.println("1. SI");
                    System.out.println("2. NO");

                    salir = leer.nextInt();
                    if (salir == 1){
                    break;
                    }else{
                        System.out.println("SALIDA CANCELADA");
                        break;
                    }
                default:
                    System.out.println("LA OPCIÓN INGRESADA ESTÁ FUERA DE RANGO");
                    System.out.println("INGRESE UNA OPCIÓN VÁLIDA");
            }
        }while(salir != 1);
        
        System.out.println("EL PROGRAMA HA FINALIZADO");
        System.out.println("GRACIAS POR UTILIZAR NUESTROS SERVICIOS");
        }
    }