class Z 
{
	int i;
	public static void main(String[] args) 
	{
		Z z1 = new Z();
		Z z2 = z1;
		Z z3 = new Z();
		Z z4 = z3;
		z1.i = 10;
		z4.i = 20;
		System.out.println(z1.i);
		System.out.println(z2.i);
		System.out.println(z3.i);
		System.out.println(z4.i);
	}
}
