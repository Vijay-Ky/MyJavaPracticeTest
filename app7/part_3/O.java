class O 
{
	O()
	{
		System.out.println("O()");
	}
	O(int i)
	{
		this();
		System.out.println("O(int)");
	}
	O(int i, int j)
	{
		this(i);
		System.out.println("O(int, int)");
	}

	{
		System.out.println("O-IIB1");
	}

	{
		System.out.println("O-IIB2");
	}

	public static void main(String[] args) 
	{
		O x1 = new O();
		System.out.println("--------");
		O x2 = new O(4, 6);
		System.out.println("--------");
		O x3 = new O(4);
		System.out.println("--------");
	}
}
