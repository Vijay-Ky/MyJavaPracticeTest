class E 
{
	static int i = 20;
}
class F extends E
{
	static int j = 40;

	public static void main(String[] args) 
	{
		System.out.println(F.i);
		System.out.println(F.j);
	}
}
