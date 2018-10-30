class I 
{
	I()
	{
		System.out.println("I()");
	}

	{
		System.out.println("I-IIB");
	}

	public static void main(String[] args) 
	{
		I obj1 = new I();
		System.out.println("-------");
		I obj2 = new I();
		System.out.println("-------");
	}
}
