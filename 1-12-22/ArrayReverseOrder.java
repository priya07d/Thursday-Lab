//1.wap to print reverse of an array
package arrayexamples;

import java.util.Scanner;

public class ArrayReverseOrder {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter elements in an array");
		for(int i=0;i<a.length;i++)
		{
			a[i] =sc.nextInt();
		}
			System.out.println("array elements");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]+" ");
			}
			System.out.println("\narray reverse elements ");
			for(int i=a.length-1;i>=0;i--)
			{
				System.out.println(a[i]+" ");
			}
		}
		
}


