class K 
{
	int i;
	void test1()
	{
		i = 10;
	}
	public static void main(String[] args) 
	{
		K k1 = new K();
		System.out.println("a:" + k1.i);
		k1.test1();
		System.out.println("b:" + k1.i);
	}
}
