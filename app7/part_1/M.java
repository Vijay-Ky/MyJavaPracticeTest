class M 
{
	int i;
	void test1()
	{
		System.out.println("a:" + i);
		test2();
		System.out.println("b:" + i);
	}
	void test2()
	{
		i = 30;
	}
	public static void main(String[] args) 
	{
		M m1 = new M();
		System.out.println("c:" + m1.i);
		m1.test1();
		System.out.println("d:" + m1.i);
		m1.i = 10;
		m1.test1();
		System.out.println("e:" + m1.i);
		m1.test2();
		System.out.println("f:" + m1.i);
	}
}
