class T
{
	T()
	{
		System.out.println("T()");
	}

	{
		System.out.println("T-IIB");
	}
}
class U extends T 
{
	U()
	{
		System.out.println("U()");
	}

	{
		System.out.println("U-IIB");
	}
	public static void main(String[] args) 
	{
		T t1 = new T();
		System.out.println("----------");
		U u1 = new U();
	}
}