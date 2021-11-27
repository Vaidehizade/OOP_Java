package mypackage1;


class Num
{
	//non static final class variables gets memory on per object basis
	final int x;
	Num(int a)
	{
		x = a;
	}
	void show()
	{
		System.out.println("x = "+x);
	}
}

public class Final_keyword_2 {

	public static void main(String[] args) {
		
       Num obj = new Num(10);
       Num obj1 = new Num(20);
       System.out.println(obj.x);
       System.out.println(obj1.x);
       obj.show();
       obj1.show();
	}

}
