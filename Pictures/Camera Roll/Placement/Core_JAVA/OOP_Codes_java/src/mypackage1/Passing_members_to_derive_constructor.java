package mypackage1;


class Basec 
{
	int x = 88;
	Basec(int a)
	{
		x = a;
		System.out.println("base class constructor...."+ x);
	}
}
class Derivec extends Basec
{
	// derive class ke members ko hum as a parameter use nhi kr skte super me coz base class aadhi execute hoto
	int a;
	Derivec()
	{
		super(a); // asa nahi kru shkt coz  base class aadhi execute hoto so 
		System.out.println("derive class constructor");
	}
	
}
public class Passing_members_to_derive_constructor {

	public static void main(String[] args) {
		Derivec b = new Derivec();//

	}

}
