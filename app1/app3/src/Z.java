class Z
{
	static int test1()
	{
		System.out.println("from test1");
		return 10;
	}
	static int test2()
	{
		System.out.println("from test2");
		return test1();
	}
	static int test3()
	{
		System.out.println("from test3");
		return test1()+test2();
	}
	public static void main(String[]args)
	{
		System.out.println(test1());
		System.out.println("--------");
		System.out.println(test2());
		System.out.println("--------");
		System.out.println(test3());
	}
}
