package mypackage1;


class Outer2
{
	
	int y;
	Inner2 in= new Inner2();
	Outer2()
	{
		y = 50;
		in.show();
	}
	void show()
	{
		System.out.println(y);
	}
	class Inner2
	{
		Outer2 out;
		int x;
		Inner2()
		{
			x = 20;
			System.out.println("Fault!");
		}
		void show()
		{
			System.out.println(x);
			System.out.println(out.y);
		}
	}
	
}
public class Outer_inner_class3 {

	public static void main(String[] args) {
		Outer2 o = new Outer2();
		o.show();
	}

}
