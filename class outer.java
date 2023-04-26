class outer
{
	static int o_x=10;
	int y=20;
	private static int z=30;
{
	void disply()
	{
	system.out.println(x);
	outer obj= new outer();
	system.out.println(x);
	outer obj= new outer(z);
}
		}
	}
class StaticNestedDemo
{
	Public static void main(string[] args)
{
	outer.inner obj1= newouter.inner();
	obj1.display();
	outer obj= new outer();
	system.out.println(obj.y);
	}
}
