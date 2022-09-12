/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Hmc
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number::>");
        num1=input.nextInt();
        System.out.println("Enter second number::>");
        num2=input.nextInt();
        sum=num1+num2;
        System.out.println("sum is");
        System.out.println(sum);
        
        
        
        
        
    }
    
}
