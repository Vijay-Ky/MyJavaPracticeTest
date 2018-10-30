class B
{
	int i;
}
class C
{
	int j;
	B b1;
	C(int j, B b1)
	{
		this.j = j;
		this.b1 = b1;
	}
	void printInfo()
	{
		System.out.print(j + ", ");
		System.out.println(b1.i);
	}
}
class D 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.i = 10;
		C c1 = new C(20, b1);
		B b2 = new B();
		b2.i = 40;
		C c2 = new C(30, b2);
		c1.printInfo();
		c2.printInfo();
	}
}
