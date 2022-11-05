//wap to find out first and last digit from a number
//i/p=3456

package basicprogram;

import java.util.Scanner;

public class ToCheckFirstNLastDigits {
  public static void main(String[]args)
  { 
	  Scanner sc =new Scanner(System.in);
	  int  number =3456 ;
	  int firstdigit =0 ;
	  int lastdigit =0;
	  System.out.println(" Enter any number");
		number= sc.nextInt();
	  
	 
	  		
	  		lastdigit =number%10;
	  		System.out.println(" The last digit of a given number : " + number +"  =  " + lastdigit );
	
	  while( number!= 0);
	  {
		  firstdigit = number%10;
		  number /=10;
		  
	  }  
	  
	  System.out.println(" The  first digit of a given number: " + number +"  =   " + firstdigit);
	  
}
}	  
  

