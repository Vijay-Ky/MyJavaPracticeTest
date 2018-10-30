class P 
{
	int i;
	static int j = test1();
	static int test1()
	{
		P obj = new P();
		System.out.println(obj.i);
		return 10;
	}
	public static void main(String args[])
	{
		System.out.println("done");
	}
}
