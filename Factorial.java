//wap to calculate factorial number:
//input =5
//5*4*3*2*1=120

package basicprogram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
		  int  i,num,fact=1 ; //declare variables
		  
		  
		  System.out.println(" Enter a number"); //taking input from user
		  		num= sc.nextInt();
		  		for(i=1;i<=num;i++)
		  		{
		  			  fact=fact*i;
		  		}
		  		
		          System.out.println(" The factorial of "  +num+ "!= " +fact);
		    
	}

}
