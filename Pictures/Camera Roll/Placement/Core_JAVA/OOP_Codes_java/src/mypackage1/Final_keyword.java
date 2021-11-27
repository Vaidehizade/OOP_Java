package mypackage1;

class Number1
{
//	final int x = 20;
	final int x;
	Number1()
	{
		x = 20;
	}
	void show()
	{
//		x = 20;  ithe assigned nahi kru shkt 
		System.out.println("x = "+x);
	}
}
public class Final_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number1 obj = new Number1();
        obj.show();
	}

}
