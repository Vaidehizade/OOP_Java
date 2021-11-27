package mypackage1;

//super keyword always refers to base class
//super is a non static variable it can't refers to static function
class Bases 
{
	static int x;
	
	static void show()
	{
		System.out.println("superrr: "+x);
	}
}

class Derivess extends Bases
{
	static int y = 20;
	static void show()
	{
		System.out.println("derivesss: "+y);
		super.show(); // we can write this statement at beginning , end or middle
	}
}
public class Super_kEyword {

	public static void main(String[] args) {
		Derivess obj = new Derivess();
		Derivess.show();

	}

}
