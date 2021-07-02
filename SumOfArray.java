import java.util.Scanner;
class SumOfArray
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int[] a = new int[5];
		
		int sum = 0;
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Enter element at " + (i + 1) + " position");
			
			a[i] = in.nextInt();
		}
		
		for(int i = 0; i < 5; i++)
		{
			sum +=  a[i];
		}
		
		System.out.println("Sum of all element of array is: " + sum);
	}
}
