class CountEven
{
	public static void main(String[] args)
	{
		int count = 0;
		for(int i = 300; i <= 600; i++)
		{
			if(i % 2 == 0)
			{
				count++;
			}
		}
		
		System.out.println("There are " + count + " Even numbers between 300 and 600");
	}
}
