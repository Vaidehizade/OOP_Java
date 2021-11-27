package mypackage1;


abstract class Red
{
	int x;
	static int y;
	Red()
	{
		System.out.println("constructor executed"); //3
	}
	static 
	{
		System.out.println("static block executed"); //1
	}
	{
		System.out.println("anonymous block executed"); //2
	}
	void show()
	{
		System.out.println("showed function executed");
	}
	final void display()
	{
		System.out.println("final method is displayed!");
	}
	abstract void put();
}

class Blue extends Red
{
	protected void put()
	{
		super.show();
		super.display();
		System.out.println("abstract put function");
	}
}
public class Can_we_define_other_methods_in_abstract_class {

	public static void main(String[] args) {
		Blue b = new Blue();
        b.put();
	}

}
