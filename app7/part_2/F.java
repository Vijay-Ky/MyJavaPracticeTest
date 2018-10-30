class F 
{
	int i;
	int j;
	F()
	{
		System.out.print("F():");
		System.out.print("i = " + i);
		System.out.println(", j = " + j);
		i = 10;
		j = 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("F-main begin");
		F f1 = new F();
		System.out.print("i = " + f1.i);
		System.out.println(", j = " + f1.j);
		System.out.println("F-main end");
	}
}
