import java.util.Scanner;
class OddNumbers
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int num = in.nextInt();
		
		System.out.println("Odd numbers from 1 to " + num + " are");
		
		for(int i = 1; i <= num; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i);
			}
		}
	}
}
