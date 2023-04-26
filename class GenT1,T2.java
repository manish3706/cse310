class Gen<T1,T2>
{
	T1 num1;
	T1 num2;
	Gen()
	{
	}
	Gen(T1 x, T2 y)
	{
		num1=x;
		num2=y;
	{
	T print1()
	{
	return num1;
	}
}
class GenericClassdemo
{
	public static void (String[] args)
	{
		Gen<Integer> obj1=new Gen<Integer>(20);
		System.out.println(obj1.print1());
		System.out.println(obj1.print1());
		
		Gen<string> obj2=new Gen<String>("java");
		System.out.println(obj2.print1());
		System.out.println(obj2.print1());
	}
}

// WAP to create a generic class that finds the largest of two variables.