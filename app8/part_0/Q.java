class P 
{
	P(int i)
	{
		System.out.println("P(int)");
	}
}
class Q extends P
{
	Q()
	{
		super(10);
		System.out.println("Q()");
	}
	Q(int i)
	{
		super(10);
		System.out.println("Q(int)");
	}
	
	public static void main(String[] args)
	{
		Q q1 = new Q();
		System.out.println("---------");
		Q q2 = new Q(90);
	}
}
