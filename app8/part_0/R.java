class R
{
	R()
	{
		System.out.println("R()");
	}
	R(int i)
	{
		System.out.println("R(int)");
	}
}
class S extends R 
{
	S()
	{
		System.out.println("S()");
	}
	S(int i)
	{
		System.out.println("S(int)");
	}

	public static void main(String[] args) 
	{
		S s1 = new S();
		System.out.println("-----------");
		S s2 = new S(90);
	}
}
