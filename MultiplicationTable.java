//wap to to print multiplication table
//i/p=5
//5*1=5
//5*2=10
package basicprogram;

import java.util.Scanner;

public class MultiplicationTable {
     public static void main(String[]args) {
    	 int number = 5, i, j;
    	 Scanner sc = new Scanner(System.in);
    	  
    	 System.out.println(" Enter any number :  ");
    	 number= sc.nextInt();
    	  for(i = number; i<=5; i++)
    	  {
    		  for(j =1; j <=10; j++)
    		  {
    			  System.out.println( i +" * " + j );
    		  }
    	 
     }
}
}
