package mypackage1;


//finalize defined under protected always
class Parent
{
    Parent()
    {
    	System.out.println("base class constructor....");
    }
    protected void finalize()
    {
    	System.out.println("base class destructor");
    }
}
class Child extends Parent
{
	Child()
	{
		System.out.println("child class constructor....");
	}
	 protected void finalize()
	 {
	    	System.out.println("child class destructor");
	 }
	
}
class Cousin extends Child
{
	Cousin()
	{
		System.out.println("cousin class constructor....");
	}
	protected void finalize()
	{
	    	System.out.println("cousin class destructor");
	}
	
}

public class Constructors_sequence_checking {

	public static void main(String[] args) {
		Cousin c = new Cousin();
		c.finalize();
//		c = null;
//		Child cp = new Child();
//		cp.finalize();
//		
//		Parent p = new Parent();
//		p.finalize();
        System.gc();
	}

}
