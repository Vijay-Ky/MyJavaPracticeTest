class K 
{
	K()
	{
		System.out.println("K()");
	}
	K(int i)
	{
		System.out.println("K(int)");
	}

	{
		System.out.println("K-IIB");
	}

	public static void main(String[] args) 
	{
		K k1 = new K();
		System.out.println("-------");
		K k2 = new K(30);
		System.out.println("-------");
	}
}
