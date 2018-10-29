class L 
{
	int i;
	void test1()
	{
		System.out.println("from test1");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		L obj = new L();
		obj.test1();
		System.out.println(obj.i);
		System.out.println("main end");
	}
}
