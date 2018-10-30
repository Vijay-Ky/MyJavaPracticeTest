class T 
{
	int i;
	static void test1(T t1, T t2)
	{
		int x = t1.i;
		t1.i = t2.i;
		t2.i = x;
	}
	void test2(T t1)
	{
		int x = t1.i;
		t1.i = this.i;
		this.i = x;
	}
	public static void main(String[] args) 
	{
		T obj1 = new T(), obj2 = new T();
		obj1.i = 1;
		obj2.i = 2;
		test1(obj1, obj2);
     System.out.println(obj1.i + "," + obj2.i);
		obj1.test2(obj2);
	 System.out.println(obj1.i + "," + obj2.i);
	}
}
