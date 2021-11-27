package mypackage1;



class Number
{
	int x;
	static int y;
	static
	{
		System.out.println("In static block");
	}
	{
		x = 20;
		y = 30;
		System.out.println("X = "+x + " Y = "+y);
		System.out.println("In anonymous block");
	}
	static void show()
	{
		System.out.println("in main function");
	}
	
}
public class Anonymous_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Number obj = new Number();
        obj.show();
        System.out.println("main ends");
	}

}
