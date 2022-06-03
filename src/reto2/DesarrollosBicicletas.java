/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DesarrollosBicicletas {
        public static void desarrollosBicicletas(){
        Scanner leer = new Scanner(System.in);
        Scanner lectorTipoLlanta = new Scanner(System.in);
        String tipoLlanta;
        double nroDientDelanPlato1;
        double nroDientDelanPlato2;
        double desarrollo1;
        double desarrollo2;
        int nroPinones;
        int nroDientPinon;
        double dimensionLlanta = 0;
        
        System.out.println("Sr. ciclista, a continuación deberá ingresar los parametros que harán posible indicar los desarrollos de su bicicleta");
        System.out.println("Ingrese el número de platos delanteros - 1 ó 2:");
        Scanner entradaPlatosDelanteros = new Scanner(System.in);
        int nroPlatosDelanteros = entradaPlatosDelanteros.nextInt();
        
        if (nroPlatosDelanteros == 1){
                System.out.println("Ingrese el número de dientes de plato");
                nroDientDelanPlato1 = leer.nextInt();
                
        System.out.println("Ingrese la opción indicada según corresponda, así: Si las llantas son de dimensiones: 29x2.1 escriba: Opcion1, si son 29x2.2 escriba: Opcion2 o si son 29x2.3 escriba: Opcion3");
        tipoLlanta = lectorTipoLlanta.nextLine();
        
        switch (tipoLlanta){
            case "Opcion1":
                System.out.println("Según la opción elegida su llanta tiene una circunferencia de 2288 mm, es decir, 2.288 mts");
                dimensionLlanta = 2.288;
                break;
            case "Opcion2":
                System.out.println("Según la opción elegida su llanta tiene una circunferencia de 2298 mm, es decir, 2.298 mts");
                dimensionLlanta = 2.298;
                break;
            case "Opcion3": 
                System.out.println("Según la opción elegida su llanta tiene una circunferencia de 2326 mm, es decir, 2.326 mts");
                dimensionLlanta = 2.326;
                break;
            default:
                System.out.println("No ingresó la opción de manera correcta, debe ingresarla tal cual se muestra en las opciones.");
                break;
        }       
        
                System.out.println("Ingrese el número de piñones que tiene su bicicleta, el máximo es de 12 piñones: ");
                nroPinones = leer.nextInt();
                
                int i = 1;
                
                while (i <= nroPinones) {
                    System.out.println("Ingrese el número de dientes que tiene el piñon " + i);
                    nroDientPinon = leer.nextInt();
                    System.out.println(nroDientDelanPlato1 + " " + nroDientPinon + " " + dimensionLlanta + ".................");
                    desarrollo1 = ((nroDientDelanPlato1/nroDientPinon)*(dimensionLlanta));
                    System.out.println("Para este piñon y plato evaluado, teniendo en cuenta la dimensión de su llanta, el desarrollo posible es: " + desarrollo1 + " metros.");
                    i ++;
                }
        }
        
        if (nroPlatosDelanteros == 2) {
        System.out.println("Ingrese el número de dientes del plato 1");
        nroDientDelanPlato1 = leer.nextInt();
        
        System.out.println("Ingrese el número de dientes del plato 2");
        nroDientDelanPlato2 = leer.nextInt();
                
        System.out.println("Ingrese la opción indicada según corresponda, así: Si las llantas son de dimensiones: 29x2.1 escriba: Opcion1, si son 29x2.2 escriba: Opcion2 o si son 29x2.3 escriba: Opcion3");
        tipoLlanta = lectorTipoLlanta.nextLine();
        
        switch (tipoLlanta){
            case "Opcion1":
                System.out.println("Según la opción elegida su llanta tiene una circunferencia de 2288 mm, es decir, 2.288 mts");
                dimensionLlanta = 2.288;
                break;
            case "Opcion2":
                System.out.println("Según la opción elegida su llanta tiene una circunferencia de 2298 mm, es decir, 2.298 mts");
                dimensionLlanta = 2.298;
                break;
            case "Opcion3": 
                System.out.println("Según la opción elegida su llanta tiene una circunferencia de 2326 mm, es decir, 2.326 mts");
                dimensionLlanta = 2.326;
                break;
            default:
                System.out.println("No ingresó la opción de manera correcta, debe ingresarla tal cual se muestra en las opciones.");
                break;
        }       
        
                System.out.println("Ingrese el número de piñones que tiene su bicicleta, el máximo es de 12 piñones: ");
                nroPinones = leer.nextInt();
                
                int i = 1;
                
                while (i <= nroPinones) {
                    System.out.println("Ingrese el número de dientes que tiene el piñon " + i);
                    nroDientPinon = leer.nextInt();
                    
                    desarrollo1 = ((nroDientDelanPlato1/nroDientPinon)*(dimensionLlanta));
                    desarrollo2 = ((nroDientDelanPlato2/nroDientPinon)*(dimensionLlanta));
                    System.out.println("Para este piñon y plato evaluado, teniendo en cuenta la dimensión de su llanta, el desarrollo posible es para el Plato 1: " + desarrollo1 + " metros, y para el Plato 2: " + desarrollo2 + " metros");
                    i ++;
                }
            }
            else {
            System.out.println("Por favor ingrese un número valido - 1 ó 2 platos.");
            }     
        System.out.println("FIN DE LA EVALUACIÓN DE LOS DESARROLLOS DE SU BICICLETA");
        
    }
}
