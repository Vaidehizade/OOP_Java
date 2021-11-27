package mypackage1;

class Base9
{
	final void show()
	{
		System.out.println("base");
	}
}
class Derive9s extends Base9
{
	void show()
	{
		super.show();
		System.out.println("derive");
	}
	
}
public class Func_overriding {

	public static void main(String[] args) {
		Derive9s obj = new Derive9s();
        
	}

}
