/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oval;

/**
 *
 * @author Hmc
 */
public class Oval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i;
         for( i=0;i<=11;i++){
             
          for(int j=0;j<=9;j++)
             {
                 if((i==0 &&(j ==4 || j == 5 ||j==6  ))){
                     System.out.print("*");   
                 }
                 else if(i==1 && (j==2 || j==8))
                 {
                     System.out.print("*");
                 
                 }
                  else if(i>=2 && i<=9  &&( j==1 || j==9) )
                 {
                     System.out.print("*");
                 
                 }
                 else if(i==10 && (j==2 || j==8))
                 {
                     System.out.print("*");
                 
                 }
                 
                  else if((i==11 &&(j ==4 || j == 5 ||j==6  ))){
                     System.out.print("*");   
                 }
//                 
                 else{
                     System.out.print(" ");
                   
                 }
             } 
             System.out.print("\n"); 
         }
            
    }
    
}
