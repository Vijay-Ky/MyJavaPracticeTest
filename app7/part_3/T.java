class Person
{
	String name;
	int age;
	double weight;

	Person(String name, 
		   int age, 
		   double weight)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	void printInfo()
	{
		System.out.print(name + ", ");
		System.out.print(age + ", ");
		System.out.println(weight);
	}
}
class T 
{
	public static void main(String[] args) 
	{
	Person p1 = new Person("Vijay", 25, 55.90);
	Person p2 = new Person("Kiran", 35, 65.90);
	Person p3 = new Person("Ramu", 27, 56.90);
	p1.printInfo();
	p2.printInfo();
	p3.printInfo();
	}
}
