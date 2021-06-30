import java.util.Scanner;
class FirstLastDigit
{
	public static void main(String[] args)
	{
		int r, temp, count = 0, first, last;;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int number = in.nextInt();
		
		last  = number % 10;
		
		while(number >= 10 )
		{
			number = number / 10; 
		}
		
		first = number;
		
		System.out.println("Last digit is: " + last);
		System.out.println("First digit is: " + first);
		
	}
}
