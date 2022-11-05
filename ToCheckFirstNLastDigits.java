//wap to find out first and last digit from a number
//i/p=3456

package basicprogram;

import java.util.Scanner;

public class ToCheckFirstNLastDigits {
  public static void main(String[]args)
  { 
	  Scanner sc =new Scanner(System.in);
	  int  number , firstdigit =0, lastdigit,  temp;
	  System.out.println(" Enter any number");
		number= sc.nextInt();
	  
	 lastdigit =number%10;
	  		System.out.println(" The last digit of a given number : " + number +"  =  " + lastdigit );
	
	  while( number!= 0)
	  {
		  firstdigit = number%10;
		  number = number/10;
		  
	  }  
	  
	  System.out.println(" The  first digit of a given number: " + number +"  =   " + firstdigit);
	  sc.close();
}
}	  
  

