class E1 
{
	int i;
	void test()
	{
		System.out.println(this.i);
		i = 110;
	}
	public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println(e1.i);
		e1.test();
		System.out.println(e1.i);
		E e2 = new E();
		e2.test();
		System.out.println(e1.i);
		System.out.println(e2.i);
	}
}
