import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args)
	{
		int c;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int number = in.nextInt();
		
		int a = 0, b = 1;

		System.out.print(a + "\t" + b + "\t");

		for(int i = 2; i <= number;i++)
		{
			c = a + b;
			
			System.out.print(c + "\t");
			
			a = b;
			b = c;
		}			
	}
}
