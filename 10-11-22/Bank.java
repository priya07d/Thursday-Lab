/*create a Bank (variable:amount)class to calculate withdraw and deposit.for withdraw, amount will be given by user.
 * if amount is sufficient then “withdraw successful” will going to print. Later on deposit 5000rs in the account balance. Ex.:10000 after withdraw 5000,current bal=5000,after deposit 5000 total bal=10000.
 */
package oopsconcept;

import java.util.Scanner;

class Sbi
{
	float amount=10000;
	float withdraw,deposit;
	float balance;
	Scanner sc =new Scanner(System.in);
	void withdraw()
	{
		
		
		System.out.print(" Enter withdraw amount:  ");
		withdraw= sc.nextFloat();
		if( amount>=withdraw)
		{
			amount=amount-withdraw;
			System.out.println(" Withdraw amount is: "+withdraw );
			System.out.println(" After withdraw avaliable balance : "+amount );
		
			
		} 
		else
		{
			System.out.println(" u cannot withdraw insufficient balance: "+withdraw );
			System.out.println(" your balance is  : "+amount );
		}
	}
	
	void deposit()
	{
		System.out.println(" Enter deposit amount : " );
		deposit = sc.nextFloat();
		amount = amount + deposit;
		System.out.println(" Deposit amount is : "+deposit);
		System.out.println("Available balance is : "+amount);
		
	}
}	
	public class Bank
	{
		public static void main(String[] args)
		{
			Sbi b=new Sbi();
			b.deposit();
			b.withdraw();
			
		}
	}

	

	
	


    
    		
    	


