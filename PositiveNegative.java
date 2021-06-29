import java.util.Scanner;

class PositiveNegative
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number to check whether it is positive or negative");
		int number = in.nextInt();
		
		if(number >= 0)
		{
			System.out.println(number + " is a positive number");
		}
		else
		{
			System.out.println(number + " is a negative number");
		}
	}
}
