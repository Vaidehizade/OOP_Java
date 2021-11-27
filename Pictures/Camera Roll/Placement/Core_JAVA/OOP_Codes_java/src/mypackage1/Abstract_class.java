package mypackage1;


abstract class Numbers1
{
	abstract void show() ;
//	{
//		System.out.println("Abstract method");
//	}
}
abstract class Systems1 extends Numbers1
{
	//ya to derive class me method  override kro base class ki (define)
}
public class Abstract_class {

	public static void main(String[] args) {
		 //Systems1 obj = new Systems1(); // abstract class can't be instantiated
        // coz abstract methods do not have body so how can they execute that's why we can't create objects 
	}

}
