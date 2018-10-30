class E 
{
	int i;
	E()
	{
		System.out.println("E():" + i);
		i = 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		E e1 = new E();
		System.out.println(e1.i);
	}
}
