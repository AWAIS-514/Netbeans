/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Hmc
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       
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
	}
        
        
    }
    

