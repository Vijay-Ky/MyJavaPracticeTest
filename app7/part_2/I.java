class I 
{
	static int x = test1();
	int y = test2();

	static int test1()
	{
		System.out.println("from test1:" + x);
		return 10;
	}

	int test2()
	{
		System.out.println("from test2:" + y);
		return 20;
	}

	I()
	{
		System.out.println("I():" + y);
		y = 100;
	}

	static
	{
		System.out.println("SIB:" + x);
		x = 200;
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main:" + x);
		I obj = new I();
		System.out.println("main:" + obj.y);
		System.out.println("main end");
	}
}
