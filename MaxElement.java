import java.util.Scanner;
class MaxElement
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
		
		int max = a[0];
		
		
		for(int i = 0; i < 10; i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
		}
		
		System.out.println("Max element in array is: " + max);
	}
}
