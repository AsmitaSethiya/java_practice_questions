import java.util.Scanner;
class Students
{
	String name;
	static String clg_name;
	static int RollNo;
	int phy_marks, chem_marks, math_marks;
	
	Students(String name, int RollNo, int phy_marks, int chem_marks, int math_marks)
	{
		this.name = name;
		this.RollNo = RollNo;
		this.phy_marks = phy_marks;
		this.chem_marks = chem_marks;
		this.math_marks = math_marks;
	}

	void show()
	{
		System.out.println(name + " " + RollNo + " " + phy_marks + " " + chem_marks + " " + math_marks );
	}
	
	void calculate_avg()
	{
		System.out.println((phy_marks + chem_marks + math_marks)/3);
	}
	

	
	public static void main(String[] args)
	{
		Students s1 = new Students("Asmita", 101, 10, 20, 30);
		Students s2 = new Students("Veer", 102, 100, 200, 300);

		s1.show();
		s2.show();
		
		s1.calculate_avg();
		s2.calculate_avg();
	}
}
