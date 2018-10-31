class I 
{
	int p;
	static int q;
	void test3()
	{
		System.out.println("I.test3()");
	}
	static void test4()
	{
		System.out.println("I.test4()");
	}
}
class J extends I
{
	public static void main(String[] args) 
	{
		J obj = new J();
		System.out.println(obj.p);
		System.out.println(I.q);
		System.out.println(obj.p);
		System.out.println(I.q);
		obj.test3();
		obj.test4();
		obj.test3();
		obj.test4();
	}
}
