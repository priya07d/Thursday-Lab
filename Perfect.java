package oopsconcept;

import java.util.Scanner;
public class Perfect {
	public static void main(String[] args) {
		int i,j,sum,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter last number: ");
		num = sc.nextInt();
		System.out.println(" All perfect number between 1 to +num");
		for( i=1;i<=num;i++) {
			
					sum=0;
			for( j =1; j<i; j++)
			{
				if(i %j==0) {
					sum = sum +j;
				}
			}
		
		if (sum==i)
		
   System.out.println(i);
	
	}
	}
	}
	

  