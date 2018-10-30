class L 
{
	L()
	{
		System.out.println("L()");
	}

	{
		System.out.println("L-IIB1");
	}

	L(int i)
	{
		System.out.println("L(int)");
	}

	{
		System.out.println("L-IIB2");
	}

	public static void main(String[] args) 
	{
		L obj1 = new L();
		System.out.println("--------");
		L obj2 = new L(20);
		System.out.println("--------");
	}
}
