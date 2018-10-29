class Z10 
{
	static int i = test();
	static
	{
		System.out.println("Z10.SIB:" + i);
		i = 10;
	}
	public static int test()
	{
		System.out.println("Z10.test():" + i);
		return 69;
	}

	public static void main(String[] args) 
	{
		System.out.println("Z10.main begin:" + i);
		i = 33;
		System.out.println(test());
		System.out.println("Z10.main end" + i);
	}
}
