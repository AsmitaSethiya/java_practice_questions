class Rectangle
{
	float length, width;
	
	Rectangle()
	{
		length = 10;
		width = 20;
	}
	
	Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	
	void calculate_area()
	{
			System.out.println(width * length);
	}
	
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(100, 200);
		
		r1.calculate_area();
		r2.calculate_area();
	}
}

