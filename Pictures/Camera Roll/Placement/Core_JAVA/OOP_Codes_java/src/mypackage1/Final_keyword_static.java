package mypackage1;


class Pro2
{
	static final int x;  // static final ko per object basis pe memory nhi milti so error
	Pro2(int a)
	{
		x = a;
	}
	static void show()
	{
		System.out.println("x = "+x);
	}
}
public class Final_keyword_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Pro2 obj = new Pro2(10);
     Pro2 obj2 = new Pro2(20);
	}

}
