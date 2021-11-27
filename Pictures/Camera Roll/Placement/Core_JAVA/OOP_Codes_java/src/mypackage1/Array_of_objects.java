package mypackage1;


class Pro8
{
	int x=10,y=20;
	void show()
	{
		System.out.println("x = "+x+" y = "+y);
	}
}

public class Array_of_objects
{
	public static void main(String[] args)
	{
        Pro8 obj[] = new Pro8[3];  //array_of_objects
        for(int i=0; i<3; i++)
        {
        	obj[i] = new Pro8();
        	obj[i].show();
        }
	}

}
