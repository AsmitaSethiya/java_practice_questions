import java.util.Scanner;
class Array3
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		
		int[] a = new int[10]; 
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Enter element at " + (i + 1) + " position: ");
			a[i] = in.nextInt();
		}
		
		for(int i = 0; i < 10; i++)
		{
			sum = sum + a[i];
		}
		
		System.out.println(sum);
	}
}
