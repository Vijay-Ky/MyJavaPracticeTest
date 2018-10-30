class E 
{
	int i;
	void test()
	{
		System.out.println(this.i);
		this.i = 110;
	}
	public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println(e1.i);
		e1.test();
		System.out.println(e1.i);
	}
}
