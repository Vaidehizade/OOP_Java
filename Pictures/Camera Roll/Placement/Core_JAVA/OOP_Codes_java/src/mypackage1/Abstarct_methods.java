package mypackage1;

// Abstract methods can't have body
//if class is abstract then its abstract method should be defined in the derived class
// abstract methods are declare in the abstract class only
abstract class Numbers
{
	abstract void show() ;
//	{
//		System.out.println("Abstract method");
//	}
}
class Systems extends Numbers
{
	void show()
	{
		System.out.println("Abstract method");
	}
}
public class Abstarct_methods {

	public static void main(String[] args) {
		
       Systems obj = new Systems();
	}

}
