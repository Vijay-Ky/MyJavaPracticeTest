class Y 
{
	{
		System.out.println("Y-IIB");
	}

	Y()
	{
		this(10);
		System.out.println("Y()");
	}
	Y(int i)
	{
		System.out.println("Y(int)");
	}

	public static void main(String[] args) 
	{
		Y y1 = new Y();
		System.out.println("done");
		Y y2 = new Y(23);
	}
}
