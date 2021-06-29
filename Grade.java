import java.util.Scanner;

class Grade
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a Percentage");
		
		int per = in.nextInt();
		
		if(per >= 75)
		{
			System.out.println("A Grade");
		}
		else if(per >= 60 && per < 75)
		{
			System.out.println("B Grade");
		}
		else if(per >= 50 && per < 60)
		{
			System.out.println("C Grade");
		}
		else if(per >= 40 && per < 50)
		{
			System.out.println("D Grade");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
