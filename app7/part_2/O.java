class O 
{
	int i;
	O()
	{
		i++;
	}
	public static void main(String[] args) 
	{
		O o1 = new O();
		O o2 = new O();
		O o3 = new O();
		O o4 = new O();
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o3.i);
		System.out.println(o4.i);
	}
}
