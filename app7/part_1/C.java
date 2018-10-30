class C 
{
	void test()
	{
		System.out.println("test:" + this);
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("main:" + c1);
		c1.test();
		C c2 = new C();
		System.out.println("main:" + c1);
		c2.test();
	}
}
