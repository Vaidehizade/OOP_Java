package mypackage1;


class Pro6
{
	int x, y;
	Pro6(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	Pro6(Pro6 T)
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(T.x);
		System.out.println(T.y);
	}
	
}
public class Constructor_with_reference_passing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Pro6 n = new Pro6(10,20);
     Pro6 n1 = new Pro6(n);
	}

}
