import java.util.Scanner;
class CheckPalindrom
{
	public static void main(String[] args)
	{
		
		int temp, r, rev = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		int number = in.nextInt();
		
		temp = number;
		
		while(number != 0)
		{
			r = number % 10;
			rev = rev * 10 + r;
			number = number / 10;
		}
		
		if(temp == rev)
		{
			System.out.println("Palndrom");
		}
		else
		{
			System.out.println("Non- Plaindrom");
		}
		
	}
}
