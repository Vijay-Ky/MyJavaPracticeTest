class L 
{
	int i;
	void test1()
	{
		i = 20;
	}
	public static void main(String[] args) 
	{
		L obj1 = new L();
		System.out.println("a:" + obj1.i);
		obj1.test1();
		System.out.println("b:" + obj1.i);
		L obj2 = new L();
		System.out.println("c:" + obj2.i);
		obj2.test1();
		System.out.println("d:" + obj2.i);
	}
}

