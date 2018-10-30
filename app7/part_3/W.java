class U
{
	int i;
}
class V
{
	int j;
	U obj;
}
class W 
{
	public static void main(String[] args) 
	{
		U u1 = new U();
		u1.i = 10;
		V v1 = new V();
		v1.j = 20;
		v1.obj = u1;
		System.out.println(v1.j);
		System.out.println(v1.obj.i);
	}
}
