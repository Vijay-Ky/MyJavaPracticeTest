class L 
{
	static int count;
	L()
	{
		count ++;
	}
	public static void main(String[] args) 
	{
		L obj1 = new L();
		L obj2 = new L();
		L obj3 = new L();
		L obj4 = new L();
		System.out.println(count);
	}
}
