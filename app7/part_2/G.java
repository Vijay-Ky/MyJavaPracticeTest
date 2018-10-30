class G 
{
	int i = test1();
	G()
	{
		System.out.println("G():" + i);
		i = 20;
	}
	int test1()
	{
		System.out.println("test1:" + i);
		return 30;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		G g1 = new G();
		System.out.println("main:" + g1.i);
		System.out.println("main end");
	}
}
