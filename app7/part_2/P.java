class P 
{
	P()
	{
		System.out.println("P()");
	}

	P(int i)
	{
		System.out.println("P(int)");
	}

	public static void main(String[] args) 
	{
		P p1 = new P();
		System.out.println("-----");
		P p2 = new P(20);
		System.out.println("-----");
		P p3 = new P();
		System.out.println("-----");
		P p4 = new P(20);
		System.out.println("-----");
	}
}
