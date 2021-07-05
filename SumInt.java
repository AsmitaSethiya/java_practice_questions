import java.util.Scanner;
class SumInt
{
	public static void main(String[] args)
	{
	
		int num1, num2;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter  num1: ");
		num1 = in.nextInt();
		
		System.out.println("Enter num2: ");
		num2 = in.nextInt();
		
		int sum = num1 + num2; 
		
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
		
	}
}
