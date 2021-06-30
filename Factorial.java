import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int fact = 1;
		
		System.out.print("Enter a number to find factorial: ");
		int num = in.nextInt();
		
		for(int i = 1; i <= num; i++)
		{
			fact = fact * i;
		}
		
		System.out.println(fact);
	}
}
