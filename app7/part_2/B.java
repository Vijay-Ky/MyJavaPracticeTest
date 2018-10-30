class B 
{
	int i = test();
	static int test()
	{
		System.out.println("from test:");
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin ");
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println("main end ");
	}
}
