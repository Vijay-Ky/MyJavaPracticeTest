class U 
{
	static int count;
	U()
	{
		count ++;
		System.out.println("U()");
	}
	U(int i)
	{
		count ++;
		System.out.println("U(int)");
	}
	public static void main(String[] args) 
	{
		U u1 = new U();
		System.out.println("-----");
		U u2 = new U(10);
		System.out.println("-----");
		U u3 = new U(20);
		System.out.println(count);
	}
}
