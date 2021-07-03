import java.util.Scanner;
class Student
{
	String name;
	int RollNo, physics_makrs, chem_marks, maths_marks, total;
	
	void setData(String name ,int RollNo, int physics_makrs, int chem_marks, int maths_marks)
	{
		this.name = name;
		this.RollNo = RollNo;
		this.physics_makrs = physics_makrs;
		this.chem_marks = chem_marks;
		this.maths_marks = maths_marks;
	}
	
	void show()
	{
		System.out.println(name + " " + RollNo + " " + physics_makrs + " " + chem_marks + " " + maths_marks);
	}
	
	void study()
	{
		System.out.println("Student name is: " + name + " And total marks is: " + total );
	}
	
	void calculate_total()
	{
		 total = physics_makrs + chem_marks + maths_marks;
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setData("Asmita" , 101, 10 , 20 , 30);
		s2.setData("Sanyam", 102, 100, 200, 300);
		
		s1.show();
		s2.show();
		
		s1.calculate_total();
		s2.calculate_total();
		
		s1.study();
		s2.study();
		
		
	}
}
