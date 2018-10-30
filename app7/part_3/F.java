class F 
{
	F()
	{
		this(10);
		System.out.println("F()");
	}	
	F(int i)
	{
		this();
		System.out.println("F(int)");
	}
}
