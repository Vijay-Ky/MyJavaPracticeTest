class B1
{
	B1()
	{
		System.out.println("B()");
	}
	B1(int i)
	{
		this();
		System.out.println("B(int)");
	}
	public static void main(String[] args) 
	{
		B1 b1 = new B1();
		System.out.println("-----");
		B1 b2 = new B1(22);
	}
}
