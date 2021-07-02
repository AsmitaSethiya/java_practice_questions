import java.util.Scanner;
class MinElement
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int[] a = new int[10]; 
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Enter element at " + (i + 1) + " position: ");
			a[i] = in.nextInt();
		}
		
		int min = a[0];
		
		
		for(int i = 0; i < 10; i++)
		{
			if(min > a[i])
			{
				min = a[i];
			}
		}
		
		System.out.println("Min element in array is: " + min);
	}
}
