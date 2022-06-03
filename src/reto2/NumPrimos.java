/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

/**
 *
 * @author User
 */
public class NumPrimos {
    int num;
    
    public NumPrimos (int n){
        num = n;
    }
    
    public void nPrimos()  {
        int cont = 1, suma = 0;
        boolean fin = true;
        if (num != 0) { 
            System.out.print("La suma es = 2");
            for(int i = 3; fin ; i++) {
                if(esPrimo(i)) {            
                    System.out.print(" + " + i); 
                    suma += i;
                    cont++;

                    if(cont == num) {
                        fin = false;
                    }
                }
            }
        System.out.println(" = " + (suma + 2 ));
        } else {
            System.out.println("NUMERO NO VALIDO");
        }
    }

    private boolean esPrimo(int num) {
        boolean primo = true;

        if(num > 2) {
            for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        return primo;
    }
    
}
