package mypackage1;


class Outer1
{
	int x;
	Outer1()
	{
		x = 10;
		Inner ob = new Inner();
		System.out.println("Outer class is created!");
		ob.show();
	}
	void show()
	{
		System.out.println(x);
	}
	class Inner
	{
		int y;
		Inner()
		{
			y = 20;
			System.out.println("Inner class is created!");
		}
		void show()
		{
			System.out.println(y);
			
		}
	}
}

public class Outer_inner_class_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Outer1 obj = new Outer1();
       obj.show();
	}

}
