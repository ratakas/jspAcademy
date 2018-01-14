/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmobasico;

import java.util.Scanner;

/**
 *
 * @author ratakas
 */
public class juegoAdivinarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num=0,n=0;
        System.out.print("introduce numero adivinar \n");
         Scanner teclado=new Scanner(System.in);
         n=teclado.nextInt();
        
        
        while (num != n) {            
            
        System.out.print("adivina num \n");
         Scanner teclado2=new Scanner(System.in);
         num=teclado2.nextInt();
            if(num>n) {
                    System.out.print("es amyor");
                }else {
                System.out.print("es menor");
            }
        }
        
       System.out.print("Numero adivinado");
        
    }
    
}
