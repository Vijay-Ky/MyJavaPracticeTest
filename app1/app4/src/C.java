class C
{
	static void test(int i)
	{
		System.out.println("from test:"+i);
	}
	public static void main(String[]args)
	{
		test(100);
		int k=200;
		test(k);
		test(k+300);
		int m;
		test(m);
		System.out.println("done");
	}
}
