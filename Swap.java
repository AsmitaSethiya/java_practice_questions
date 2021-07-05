import java.util.Scanner;
class Swap
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int c;
		
		System.out.println("Enter first number: ");
		int num1 = in.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = in.nextInt();
		
		System.out.println("Before swaping num1 and num2 are: " + num1 +" " + num2);
		
		c = num1;
		num1 = num2;
		num2 = c;
		
		System.out.println("After swaping num1 and num2 are: " + num1 + " " + num2);
	}
}
