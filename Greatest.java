import java.util.Scanner;

class Greatest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		
		int num1 = in.nextInt();
		
		System.out.println("Enter 2nd number");
		
		int num2 = in.nextInt();
		
		System.out.println("Enter 3rd number");
		
		int num3 = in.nextInt();
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println(num1 + " is a greatest number");
		}
		else if(num2 > num3 && num2 > num1)
		{
			System.out.println(num2 + " is a greatest number");
		}
		else
		{
			System.out.println(num3 + " is a greatest number");
		}	
	}
}
