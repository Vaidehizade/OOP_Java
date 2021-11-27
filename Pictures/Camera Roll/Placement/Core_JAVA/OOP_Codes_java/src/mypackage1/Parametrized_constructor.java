package mypackage1;
class Pro5
{
	static int x,y;
	Pro5()
	{
		Pro5 obj = new Pro5(10,20);
		obj.show();
	}
	private Pro5(int a, int b)
	{
		x = a;
		y = b;
	}
	void show()
	{
		System.out.println("x = "+x+" y = "+y);
	}
}

public class Parametrized_constructor {
	public static void main(String[] args) {
		new Pro5();
//      Pro5 obj = new Pro5(10,20);
//      Pro5 obj2 = new Pro5(5,10);
      // as x and y are static variables so only one copy of it is created for whole class
//      obj.show();
//      obj2.show();
	}
}
