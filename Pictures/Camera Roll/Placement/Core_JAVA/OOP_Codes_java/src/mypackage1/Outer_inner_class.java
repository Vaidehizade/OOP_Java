package mypackage1;


class Outer
{
	int x;
	Outer()
	{
		System.out.println("Welcome to outer!");
		x = 10;
	}
	void display()
	{
		System.out.println(x);
	}
	class Inner
	{
		int y;
		Inner()
		{
			System.out.println("Welcome to inner!");
			y=20;
		}
		void show()
		{
			System.out.println(y);
		}
	}
}

public class Outer_inner_class {

	public static void main(String[] args) {
		
       Outer obj = new Outer();
       Outer.Inner ref = obj.new Inner();
       obj.display();
       ref.show();
	}

}
