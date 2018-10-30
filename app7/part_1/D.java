class D 
{
	int i;
	void test()
	{
		System.out.println(this.i);
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.i = 10;
		d1.test();
	}
}

