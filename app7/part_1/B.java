class B 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		B b2 = new B();
		B b3 = b2;
		B b4 = b1;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}
