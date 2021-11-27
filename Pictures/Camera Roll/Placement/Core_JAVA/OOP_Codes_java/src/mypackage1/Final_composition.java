package mypackage1;

class Pro7
{
	String name;
	int age;
	
	Pro7()
	{
		name = "Vaidehi";
		age  = 19;
	}
}
class Derive7 extends Pro7
{
	final Pro7 obj = new Pro7();
	void show()
	{
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
}
public class Final_composition {

	public static void main(String[] args) {
		
      Derive7 b1 = new Derive7();
      b1.show();
	}

}
