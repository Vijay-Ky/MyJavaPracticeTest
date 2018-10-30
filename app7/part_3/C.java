class C 
{
	C()
	{
		this(2, 6);
		System.out.println("C()");
	}
	C(int i)
	{
		System.out.println("C(int)");
	}
	C(int i, int j)
	{
		System.out.println("C(int, int)");
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("--------");
		C c2 = new C(20, 40);
		System.out.println("--------");
		C c3 = new C(100);
		System.out.println("--------");
	}
}
