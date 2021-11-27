package mypackage1;
class Pro1
{
	static int x, y;
//	Pro1()
//	{
//		x=  20;
//		y = 10;
//		System.out.println("Constructor executed");
//	}
	static
	{
		System.out.println("Static block executed");
		show();
	}
	{
		//anonymous block executed on per object basis
		//at first anonymous execute hoga and then constructor execute hoga
		System.out.println("Anonymous block executed");
	}
	public static void show()
	{
		x=  20;
		y = 10;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	
}
public class Static_block {

	static
	{
		System.out.println("Static block is executed in main first");
	}
	public static void main(String[] args) 
	{
//       Pro1 obj = new Pro1();
//       Pro1 obj2 = new Pro1();
//       obj.show();
       System.out.println("main ends");
	}

}
