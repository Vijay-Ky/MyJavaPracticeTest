class V 
{
	int i;
	public static void main(String[] args) 
	{
		V v1 = new V();
		V v2 = v1;
		v1.i = 10;
		System.out.println(v1.i);
		System.out.println(v2.i);
		System.out.println("-----");
		v2.i = 20;
		System.out.println(v1.i);
		System.out.println(v2.i);
		System.out.println("-----");
	}
}

