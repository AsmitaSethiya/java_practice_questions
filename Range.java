import java.util.Scanner;

class Range
{
	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int number = in.nextInt();
		
		if(number <= 200 && number >= 100)
		{
			System.out.println(number + " is in range of 100 - 200");
		}
		else
		{
			System.out.println(number + " is not in range of 100 - 200");
		}
	}
}
