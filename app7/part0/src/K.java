class K 
{
	void test1()
	{
		System.out.println("from test1");
	}
	void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		K k1 = new K();
		k1.test1();
		System.out.println("---------");
		k1.test2();
		System.out.println("---------");
		k1.test1();
		System.out.println("---------");
		k1.test2();
		System.out.println("---------");
		System.out.println("main end");
	}
}
