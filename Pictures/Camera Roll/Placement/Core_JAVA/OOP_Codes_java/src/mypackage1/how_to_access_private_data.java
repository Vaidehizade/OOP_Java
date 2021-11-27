package mypackage1;

//how to access private members
class Base8
{
	private int bx = 30; 
	Base8()
	{
		System.out.println("base class!");
	}
	void print()
	{
		System.out.println(bx);
	}
	
}
class Derive9 extends Base8
{
	Derive9()
	{
		System.out.println("Derive class!");
	}
	void prints()
	{
		print();
	}
}

public class how_to_access_private_data {

	public static void main(String[] args) {
		Derive9 obj = new Derive9();
        obj.prints();
	}

}
