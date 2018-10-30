class N 
{
	N(int i)
	{
		this();
		System.out.println("N(int)");
	}

	{
		System.out.println("N-IIB");
	}

	N()
	{
		System.out.println("N()");
	}

	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("-------");
		N n2 = new N(20);
		System.out.println("-------");
	}
}
