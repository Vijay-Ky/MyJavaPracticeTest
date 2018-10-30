class N 
{
	static int count;
	N()
	{
		count ++;
	}
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println(n1.count);
		N n2 = new N();
		System.out.println(n2.count);
		N n3 = new N();
		System.out.println(n3.count);
		N n4 = new N();
		System.out.println(n4.count);
		System.out.println(n1.count);
		System.out.println(n2.count);
		System.out.println(n3.count);
	}
}
