class K 
{
	static int x;
	void test()
	{
		x = 10;
	}
	public static void main(String[] args) 
	{
		K k1 = new K();
		k1.test();
		System.out.println(x);
	}
}
