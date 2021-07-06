import java.util.Scanner;
class AreaOfTriangle
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter radius of circle: ");
		
		int radius = in.nextInt();
		
		float area = (float)(3.141 * radius * radius);
		
		System.out.println("Area of circle is: " + area);
		
	}
}
