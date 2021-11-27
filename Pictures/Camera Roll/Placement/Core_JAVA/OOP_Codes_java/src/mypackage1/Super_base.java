package mypackage1;


class Baseg
{
	Baseg()
	{
		System.out.println("Base class Constructor!");
	}
	Baseg(int a, int b)
	{
//		super(14,29);
		System.out.println("Base class Parametrized Constructor!"+ a+ " "+b);
	}
}
class Deriveg extends Baseg
{
	static int a = 80;
	Deriveg()
	{
		System.out.println("Derive class Constructor!");
	}
	Deriveg(int a, int b)
	{
		super(a,b);
		System.out.println("Derive class Parametrized Constructor!"+ a+" " +b);
	}
	
}
public class Super_base {

	public static void main(String[] args) {
		Deriveg d = new Deriveg(10,20);
       
	}

}
