package mypackage1;


class Book
{
	static String name = "Vaidehi";
	final int y;
	static
	{
		System.out.println("Welcome to static block");
	}
	{
		//anonymous block
		System.out.println("Welcome to anonymous block");
	}
	Book()
	{
		y = 30;
	}
	protected void show()
	{
		System.out.println(name+ " "+ y);
	}
}

class Page extends Book
{
	private float price;
	Page()
	{
		price = (float)67.5;
	}
	public void show()
	{
		super.show();
		System.out.println(price);
	}
	
}
//final keyword wale variables also ovverride hotat

public class Single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Page p = new Page();
       p.show();
	}

}
