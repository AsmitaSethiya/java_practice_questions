import java.util.Scanner;
class AreaOfCircle
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter radius of circle: ");
		
		float radius = in.nextFloat();
		
		double area = 3.141 * radius * radius;
		System.out.println("Area of Circle is: " + area);
		
		
		
	}
}
