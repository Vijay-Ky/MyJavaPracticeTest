class Y 
{
	int i;	
	public static void main(String[] args) 
	{
		Y y1 = new Y();
		System.out.println(y1.i);
		Y y2 = new Y();
		System.out.println(y2.i);
		Y y3 = new Y();
		System.out.println(y3.i);
		y1.i = 2;
		y2.i = 3;
		y3.i = 4;
		System.out.println(y1.i);
		System.out.println(y2.i);
		System.out.println(y3.i);

	}
}

