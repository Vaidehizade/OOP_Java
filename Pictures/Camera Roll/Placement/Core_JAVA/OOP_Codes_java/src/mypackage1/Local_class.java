package mypackage1;

// local class is local to that function only it is accessible only inside that function

//and that class is not accessible from another function
class Ship
{	
	int x, y;
	Ship(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	void show()
	{
		class Local
		{
			String s;
			Local()
			{
				s = "Vaidehi";
			}
			void show()
			{
				System.out.println(s+ " Sureeee");
			}
		}
		Local l = new Local();
		l.show();
		System.out.println(x+ " "+y);
	}
	
}

public class Local_class {

	public static void main(String[] args) {
		Ship s = new Ship(10,20);
        s.show();  
	}

}
