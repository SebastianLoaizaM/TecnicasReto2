/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto2;

import java.util.Scanner;

/**
 *
 * @Equipo: John Sebastian Gomez Gonzalez    c.c 1000084363
 *          Sebastian Loaiza Muñoz           c.c 1214748861
 */
public class Reto2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        boolean key = true;
        while (key) {     
            switch (menu()) {
                case "1":  
                    System.out.print("Ingrese el numero ");
                    n = leer.nextInt();
                    CuadradoImpares cuadrado = new CuadradoImpares(n);
                    cuadrado.imprimir();
                    break;
                case "2":
                    System.out.print("Ingrese el numero ");
                    n = leer.nextInt();
                    NumPrimos primos = new NumPrimos(n);
                    primos.nPrimos();
                    break;
                case "3":
                    DesarrollosBicicletas Bicicleta = new DesarrollosBicicletas();
                    Bicicleta.desarrollosBicicletas();
                    break;
                case "4":
                    key = false;
                    break;
                default: 
                    System.out.println("Opcion no valida");
            }
        }
    }
    
    public static String menu(){
        Scanner leer = new Scanner(System.in);
        String opcion;
        
        System.out.print("-------------BIENVENIDO------------- \n"
            + "¿Que operacion desea realizar? \n"
            + "1) Numero cuadrado \n"
            + "2) Numeros Primos \n"
            + "3) Desarrollo Bicicletas \n"
            + "4) SALIR \n"
            + "INGRESE EL NUMERO DE LA OPERACION: ");
        opcion = leer.nextLine();
        
        return opcion;
    }
}
