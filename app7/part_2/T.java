class T 
{
	T(int i, double j)
	{
		System.out.println("T(int, double)");
	}
	T(double i, int j)
	{
		System.out.println("T(double, int)");
	}
	public static void main(String[] args) 
	{
		T t1 = new T(2.4, 5);
		System.out.println("-------");
		T t2 = new T(10, 6.5);
	}
}
