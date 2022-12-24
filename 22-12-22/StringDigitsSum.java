package ThursdayLab;

public class StringDigitsSum {

	public static void main(String[] args) {
		String str="Hello 123";
		int sum = 0;
		char ch;
		String string;
		for(int i=0;i<str.length();i++)
		{
			 ch= str.charAt(i);
		if((ch>=48)&&(ch<=57))
		{
			int a= Integer.parseInt(String.valueOf(ch));
			sum=sum+a;
					
			}
			
		System.out.print(sum);
		//System.out.println("Total no of Alphabet is: "+num);
		//System.out.println("Total no of Alphabet is: "+alpha+num);

	}

	}
}
