import java.util.Scanner;
class NumberOfDigit
{
	public static void main(String[] args)
	{
		int r, count = 0, temp;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		
		temp = num;
		
		while(num != 0)
		{
			r = num % 10;
			count++;
			num = num / 10;
		}
		
		System.out.println("In " + temp + " there are " + count + " digit");
	}
}
