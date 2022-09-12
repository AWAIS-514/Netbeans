/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes.all;

/**
 *
 * @author Hmc
 */
public class ShapesAll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        /////Hollow box/////Hollow box/////Hollow box
        /////Hollow box
        /////Hollow box
        /////Hollow box
          int n=9;
     
		for(int i = 1; i <=n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 1 || i == n || j == 1 || j == n)
				{
					System.out.print("* "); 
				}
				else
				{
					System.out.print("  "); 
				}
			}
			System.out.println(""); 
		}	
        
        
        //Holllow box

//Holllow box//Holllow box
//Holllow box
//Holllow box
//Holllow box
//Holllow box



                                    //Oval
                                    //Oval
                                      //Oval
                                    //Oval
                                      //Oval
                                    //Oval
        
        
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
         
         
         
           //Oval
                                    //Oval
                                      //Oval
                                    //Oval
                                      //Oval
                                      
                                      
                                      
                                      
                                      
                                      
                                      
                                      
                                      //arrow
                                      //aroow
                                            
   for(int u = 1; u <= 3; u++)
   {
     
      for(int k = u; k < 3; k++)
      {
                  System.out.print(" ");
      }
     
      for(int j = 1; j <= (2 * u - 1); j++)
      {
          System.out.print("*");
      }

                System.out.print("\n");
                
                
                
                
                
                
   }
   
   
   
      
   for(int o = 1; o <= 5; o++)
   {
      //for loop for displaying space
      for(int k = 1; k <= 1; k++)
      {
          
          System.out.print("  ");
      }
                 for(int j=1;j<=1;j++){
                     
                     System.out.println("*");
                 }
      }

         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
