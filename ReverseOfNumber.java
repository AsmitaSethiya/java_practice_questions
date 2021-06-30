import java.util.Scanner;
class ReverseOfNumber
{
	public static void main(String[] args)
	{
		int r, temp, rev = 0;
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = in.nextInt();
		
		temp = number;
		
		while(number != 0)
		{
			r = number % 10;
			rev = rev * 10 + r;
			number = number / 10;
		}
		
	System.out.println("Reverse of " + temp + " is : " + rev);
	
	}
}
