import java.util.Scanner;

class Checkdivisibility
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number to check whether it is divisible by 3,4 and 8 or not");
		
		int number = in.nextInt();
		
		if(number % 3 == 0 && number % 4 == 0 && number % 8 == 0)
		{
			System.out.println(number + " is divisible by 3 ,4 and 8");
		}
		else
		{
			System.out.println(number + " is not divisible by 3 ,4 and 8");
		}
	}
}
