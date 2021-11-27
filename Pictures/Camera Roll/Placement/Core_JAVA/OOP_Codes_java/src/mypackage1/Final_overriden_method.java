package mypackage1;

import java.util.Scanner;
class Base2
{
	int x;
	final void show()
	{
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
	}
}
// we can't override the final method 
class Derived3 extends Base2
{
	
	void show()
	{
		System.out.println("x = "+x);
	}
}

public class Final_overriden_method {

	public static void main(String[] args) {
		
		Derived3 db = new Derived3();
        db.show();
	}

}
