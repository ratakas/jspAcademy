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
public class multiplo {
     public static void main(String[] args) {
        
         System.out.print("introduce n 1");
         Scanner teclado=new Scanner(System.in);
         int n1=teclado.nextInt();
     
         System.out.print("introduce n 2");
         int n2=teclado.nextInt();

         System.out.print(n1+"-"+n2);
         
         if(n1%n2==0) {
          System.out.print("es multiplo");
         }else{
          System.out.print("NO pailas");
         }
}

}

