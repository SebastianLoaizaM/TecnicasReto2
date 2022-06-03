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
public class CuadradoImpares {
    Scanner leer = new Scanner(System.in);
    int num;
        
    public CuadradoImpares(int n){
        num = n;
    }
    
    public void imprimir () {
        int cont = 1, suma = 0;
        while((cont/2) < num) {
            suma += cont;
            if (cont == 1) {
                System.out.print(num + "^2 = 1");
            } else {               
                System.out.print(" + " + cont);
            }
            cont += 2;
        }
        System.out.println(" = " + suma);
    }
    
}
