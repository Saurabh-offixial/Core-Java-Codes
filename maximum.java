public class maximum{
	public static void main(String args[])
	{
		//two number
		int a = 10;
		int b = 20;
		if(a<b)
		{
			System.out.println("a is small");
		}
		else
		{
			System.out.println("b is big");
		}
		//three number
		int x = 10;
		int y = 20;
		int z = 30;
		if(x>y && x>z)
		{
			System.out.println("x is big");
		}
		else if(y>z && y>x)
		{
			System.out.println("y is big");
		}
		else if(z>x && z>y)
		{
			System.out.println("z is big");
		}	
			else
			{
				System.out.println("condition fulse");
			}
	}
}