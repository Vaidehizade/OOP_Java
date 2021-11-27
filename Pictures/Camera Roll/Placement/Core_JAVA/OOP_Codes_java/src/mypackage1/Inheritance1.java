package mypackage1;

import java.util.Scanner;
//super keyword is used when names of functions in base and derive class re same
class Inherit1
{
	String name;
	long contact_no;
	
	Inherit1()
	{
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		contact_no = sc.nextLong();
	}
	void show()
	{
		System.out.println(name+ " "+ contact_no);
	}
	
}
class Drive1 extends Inherit1
{
	char gender;
	Drive1()
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		gender = s.charAt(0);
	}
	void show()
	{
		super.show();
		//show();
		System.out.println("gender: "+gender);
	}
	
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Drive1 d = new Drive1();
       d.show();
	}

}
