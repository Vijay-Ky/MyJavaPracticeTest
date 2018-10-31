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

	public static void main(String[] args) 
	{
		T t1 = new T();
		System.out.println("----------");
		U u1 = new U();
	}
}
