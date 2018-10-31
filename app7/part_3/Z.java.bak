class X
{
	int i;
	int j;
}
class Y
{
	int m;
	int n;
	X x1;
	X x2;
}
class Z 
{
	public static void main(String[] args) 
	{
		X obj1 = new X();
		obj1.i = 10;
		obj1.j = 11;
		Y y1 = new Y();
		y1.m = 12;
		y1.n = 13;
		y1.x1 = obj1;
		y1.x2 = new X();
		System.out.println(y1.x2);
		y1.x2.i = 14;
		y1.x2.j = 15;
		System.out.println(y1.m);
		System.out.println(y1.n);
		System.out.println(y1.x1.i);
		System.out.println(y1.x1.j);
		System.out.println(y1.x2.i);
		System.out.println(y1.x2.j);
	}
}
