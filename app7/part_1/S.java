class S 
{
	int i;
	static void test(S s1)
	{
		s1.i = 10;
	}
	public static void main(String[] args) 
	{
		S obj = new S();
		obj.i = 5;
		System.out.println("a:" + obj.i);
		test(obj);
		System.out.println("b:" + obj.i);
	}
}
