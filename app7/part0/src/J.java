class J 
{
	void test1()
	{
		System.out.println("test1");
	}
	public static void main(String[] args) 
	{
		J j1 = new J();
		System.out.println("main begin");
		j1.test1();
		System.out.println("-----");
		j1.test1();
		System.out.println("-----");
		System.out.println("main end");
	}
}
