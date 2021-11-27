package mypackage1;

import java.util.*;
class Base4
{
	String name;
	int roll;
	Base4()
	{
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		roll = sc.nextInt();
		System.out.println("base class!");
	}
	void show()
	{
		System.out.println("name: "+name);
		System.out.println("roll no: "+roll);
	}
	
}

class Drive4 extends Base4
{
	long contact_no;
	String blood_grp;
	Drive4()
	{

		Scanner sc = new Scanner(System.in);
		contact_no = sc.nextLong();
		sc.nextLine();
		blood_grp = sc.next();
		System.out.println("middle class!");
	}
	void show()
	{
		super.show();
		System.out.println("contact_no: "+contact_no);
		System.out.println("blood group: "+blood_grp);
	}
}

class high4 extends Drive4
{
	
	char gender;
	int age;
	high4()
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch = s.charAt(0);
		age = sc.nextInt();
		System.out.println("derived class!");
	}
	void show()
	{
		super.show();
		System.out.println("gender: "+gender);
		System.out.println("age: "+age);
	}
	
	
}

public class Multilevel_inheritance
{
    public static void main(String[] args)
    {
		high4 obj = new high4();
		obj.show();
	}

}
