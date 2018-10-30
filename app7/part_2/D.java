class D 
{
	int i = test1();
	int j = test1();
	int test1()
	{
		System.out.print("from test1:"); 
		System.out.print("i = " + i); 
		System.out.println("j = " + j); 
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		D d1 = new D();
		System.out.println("----------");
		System.out.print(d1.i);
		System.out.println("," + d1.j);
		System.out.println("main end");
	}
}
