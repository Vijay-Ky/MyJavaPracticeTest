class Z 
{
	{
		System.out.println("Z-IIB");
	}

	Z()
	{
		System.out.println("Y()");
		this(10);
	}
	Z(int i)
	{
		System.out.println("Z(int)");
	}

	public static void main(String[] args) 
	{
		Z z1 = new Z();
		System.out.println("done");
		Z z2 = new Z(23);
	}
}
