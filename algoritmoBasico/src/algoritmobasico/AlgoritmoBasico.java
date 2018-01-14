/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmobasico;

import java.util.Scanner;
import javax.xml.bind.ParseConversionEvent;

/**
 *
 * @author ratakas
 */
public class AlgoritmoBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=0;
        System.out.println("dadoumero, determinar cuantos digitos tiene");
        Scanner teclado=new Scanner(System.in);
        n=teclado.nextInt();
        
        System.out.println(n);
        
        String aux = ""+n;
        
        String[] aux2= aux.split("");
        
        System.out.println("su numero tiene "+aux2.length+"digitos");
        
        
        
    }
    
}
