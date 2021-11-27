package mypackage1;


class Basic
{
	int x;
	Basic(int a)
	{
		x = a;
		System.out.println("Basic constructor "+x);
	}
	
	
}
class Advance extends Basic
{
	static int b; // static la class file load zalyawrch memory milun jaate before object creation
	Advance( int x)
	{
		super(x); 
		System.out.println("derive constructor "+x);
	}
	
	
}
public class Static_super
{

	public static void main(String[] args)
	{
       Advance a = new Advance(10);
	}

}
