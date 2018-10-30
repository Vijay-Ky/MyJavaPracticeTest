class Q1 
{
	int i;
	void test()
	{
		Q q1 = new Q();
		q1.i = i;
		System.out.println("test-a:" + q1.i);
		System.out.println("test-b:" + i);
	}
	public static void main(String[] args) 
	{
		Q obj = new Q();
		obj.i = 20;
		obj.test();
	}
}
