package mypackage1;


// we can't apply access specifier to local class
class Ship2
{
	static int x;
	Ship2()
	{
		x = 1;
		System.out.println(x);
	}
	static void show()
	{
	   class Local1
	   {
		  int x;
		  Local1()
		  {
			  x = 20;
		  }
		  void show()
		  {
			  System.out.println(x);
		  }
	   }
	   Local1 obj = new Local1();
	   obj.show();
	}
}
public class Local_class_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Ship2 d = new Ship2();
       Ship2.show();
	}

}
