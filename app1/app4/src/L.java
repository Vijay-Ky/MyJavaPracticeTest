class L
{
	static int test()
	{
		int i=0;
		return i++;
	}
	public static void main(String[]args)
	{
		int i=0;
		System.out.println(test());
		System.out.println(i);
	}
}
