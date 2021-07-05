import java.util.Scanner;
class ReverseDigit
{
	public static void main(String[] args)
	{
		int rev = 0, r;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a numer: ");
		
		int num = in.nextInt();
		
		while(num != 0)
		{
			r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		
		System.out.println(rev);
	}
}
