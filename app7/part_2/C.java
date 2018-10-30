class C 
{
	int i = test();
	int test()
	{
		System.out.println("from test:" + i);
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C c1 = new C();
		System.out.println(c1.i);
		System.out.println("main end");
	}
}
