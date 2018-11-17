class W
{
	static void test()
	{
		System.out.println("from test");
	}
	public static void main(String[]args)
	{
		int i=10+test();
		System.out.println(i);
	}
}
