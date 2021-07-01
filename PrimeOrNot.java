import java.util.Scanner;
class PrimeOrNot
{
	public static void main(String[] args)
	{
		int i;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int n = in.nextInt();
		
		for(i = 2; i < n; i++)
		{
			if(n % i == 0)
			{
				System.out.println("Non Prime Number");
				break;
			}
		}
		
		if(n == i)
		{
			System.out.println("Prime Number");
		}

	}
}
