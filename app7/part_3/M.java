class M 
{
	{
		System.out.println("M-IIB");
	}

	M(int i)
	{
		System.out.println("M(int)");
	}

	M()
	{
		System.out.println("M()");
	}

	M(double i)
	{
		System.out.println("M(double)");
	}
	public static void main(String[] args) 
	{
		M m1 = new M();
		System.out.println("-------");
		M m2 = new M(20);
		System.out.println("-------");
		M m3 = new M(2.0);
		System.out.println("-------");
	}
}
