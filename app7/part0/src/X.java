class X 
{
	int i;
	public static void main(String[] args) 
	{
		X x1 = new X();
		X x2 = new X();
		x1.i = 10;
		x2.i = 20;
		System.out.println(x1.i);
		System.out.println(x2.i);
	}
}
