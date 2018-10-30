class H 
{
	int x = test1();

	H()
	{
		System.out.println("H():" + x);
		x = 20;
	}

	H()
	{
		System.out.println("H():" + x);
		x = 40;
	}

	int test1()
	{
		System.out.println("test1:" + x);
		return 10;
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		H h1 =new H();
		System.out.println("main end");
	}
}
