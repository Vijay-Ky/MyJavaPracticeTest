class J 
{
	J()
	{
		System.out.println("J()");
	}

	{
		System.out.println("J-IIB1");
	}

	public static void main(String[] args) 
	{
		J j1 = new J();
		System.out.println("------");
		J j2 = new J();
		System.out.println("------");
	}

	{
		System.out.println("J-IIB2");
	}

}
