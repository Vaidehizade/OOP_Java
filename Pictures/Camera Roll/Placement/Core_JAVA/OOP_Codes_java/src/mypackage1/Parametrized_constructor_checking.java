package mypackage1;

// and ha super parameter passing sathich hototy so other functions madhe nahi lihita yenar
class Parents
{
	int x, y;
    Parents()
    {
    	System.out.println("base class constructor....");
    }
    Parents(int a)
    {
    	x = a;
    	System.out.println("Parents a = "+x);
    }
    
}
class Childs extends Parents
{
	int x, y;
	Childs()
	{
		System.out.println("child class constructor....");
	}
	 Childs(int a, int b)
	    {
		    super(10);
	    	x = a;
	    	y = b;
	    	System.out.println("Childs a = "+x+ " b = "+y);
	    }
	
}
class Cousins extends Childs
{
	int x, y;
	Cousins()
	{
		System.out.println("cousin class constructor....");
	}
	 Cousins(int a, int b)
	    {
		    super(10,20); // to print child class constructor and we can't write this statement in middle or end otherwise it generate error.
	    	x = a;
	    	y = b;
	    	System.out.println("Cousins a = "+x+ " b = "+y);
	    }
	
}
public class Parametrized_constructor_checking 
{
	public static void main(String[] args)
	{
	  Cousins c = new Cousins(10,20);
	}

}
