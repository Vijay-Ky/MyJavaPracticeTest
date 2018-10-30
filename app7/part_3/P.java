class P 
{
	P()
	{
		System.out.println("P()");
	}
	P(int i)
	{
		this();
		System.out.println("P(int)");
	}

	static
	{
		System.out.println("P-SIB1");
	}

	{
		System.out.println("P-IIB1");
	}

	P(int i, int j)
	{
		this(j);
		System.out.println("P(int, int)");
	}

	{
		System.out.println("P-IIB2");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		P p1 = new P(90);
		System.out.println("--------");
		P p2 = new P(50, 60);
		System.out.println("--------");
		P p3 = new P();
		System.out.println("--------");
		System.out.println("main end");
	}
	static
	{
		System.out.println("P-SIB2");
	}
}
