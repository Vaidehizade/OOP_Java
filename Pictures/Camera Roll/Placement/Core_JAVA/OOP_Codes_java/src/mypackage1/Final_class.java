package mypackage1;

//we cannot inherit that class which is declared as final
//finalize() , ha gc chi TC wadhvto ...finalize is just like destructor
final class Base
{
	int x = 20;
	public void show()
	{
		System.out.println("x = "+x);
	}	
}
class Derive extends Base
{
	
}
public class Final_class
{
	public static void main(String[] args)
	{
		Derive d = new Derive();
        d.show();
	}

}
