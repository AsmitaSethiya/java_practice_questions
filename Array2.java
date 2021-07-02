import java.util.Scanner;
class Array2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int i = 0; i < 5; i++)
		{
			System.out.print("Enter element at " + (i+1) + " position: ");
			a[i] = in.nextInt();
		}
		
		System.out.println("Array elements are: ");
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println(a[i]);
		}
	}
}
