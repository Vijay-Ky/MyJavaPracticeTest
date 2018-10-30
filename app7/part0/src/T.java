class T 
{
	int i;
	static void test()
	{
		obj.i = 10;
	}
	public static void main(String[] args) 
	{
		T obj = new T();
		test();
		System.out.println(obj.i);
	}
}
