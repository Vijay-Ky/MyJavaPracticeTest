class V
{
	V()
	{
		System.out.println("V()");
	}

	{
		System.out.println("V-IIB");
	}
}
class W extends V 
{
	W()
	{
		System.out.println("W()");
	}

	{
		System.out.println("W-IIB");
	}
}
class X extends W 
{
	X()
	{
		System.out.println("X()");
	}

	{
		System.out.println("X-IIB");
	}

	public static void main(String[] args) 
	{
		V v1 = new V();
		System.out.println("----------");
		W w1 = new W();
		System.out.println("----------");
		X x1 = new X();
	}
}
