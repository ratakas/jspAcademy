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
public class factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("introduc factorial \n>>");
         Scanner teclado=new Scanner(System.in);
         int n1=teclado.nextInt();
         int resultado=1;
         
         for (int i = n1; i > 0; i--) {
            
            resultado = i*resultado;
             
        }
         System.out.println(resultado);
         
         
         
         
    }
    
}
