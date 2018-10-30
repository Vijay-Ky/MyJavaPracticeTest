class N 
{
	int i;
	static void test1(N obj)
	{
		obj.i = 30;
	}
	public static void main(String[] args) 
	{
		N n1 = new N();
		n1.i = 1;
		System.out.println("a:" + n1.i);
		test1(n1);
		System.out.println("b:" + n1.i);
	}
}
