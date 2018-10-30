class W 
{
	double j;
	public static void main(String[] args) 
	{
		W obj1 = new W();
		System.out.println(obj1.j);
		W obj2 = obj1;
		obj2.j = 5.0;
		System.out.println(obj1.j);
		System.out.println(obj2.j);
		W obj3 = obj2;
		obj2.j = 6.0;
		System.out.println(obj3.j);
		System.out.println(obj2.j);
		System.out.println(obj1.j);

	}
}

