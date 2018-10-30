class P 
{
	int i;
	void test1()
	{
		i = 1;
	}
	static void test2(P obj)
	{
		System.out.println("a:" + obj.i);
		obj.test1();
		System.out.println("b:" + obj.i);
	}
	void test3()
	{
		System.out.println("c:" + this.i);
		test1();
		System.out.println("d:" + i);
	}
	public static void main(String[] args) 
	{
		P p1 = new P();
		p1.test1();
		System.out.println("e:" + p1.i);
		p1.i = 2;
		test2(p1);
		System.out.println("f:" + p1.i);
		p1.i = 3;
		p1.test3();
		System.out.println("g:" + p1.i);
	}
}
