/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgthrow.s;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Hmc
 */
public class ThrowS {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws ArithmeticException
    {
      Scanner s=new Scanner(System.in);
          
            System.out.println("ENTer 1st number" );
          int n=s.nextInt();
          System.out.println("ENter 2nd number ");
          int m=s.nextInt();
       
            try {
             System.out.println(n/m);
        } catch (Exception e) {
                System.out.println(e.getMessage());
            
        }
        
        
        
        
        
        
    }
    
}
