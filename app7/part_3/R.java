class R 
{
	int i;
	double j;
	R(int i, double j)
	{
		this.i = i;
		this.j = j;
	}
	public static void main(String[] args) 
	{
		R r1 = new R(10, 5.8);
		System.out.println(r1.i);
		System.out.println(r1.j);
	}
}
