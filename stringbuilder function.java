Import java.io.*;
	
	class Stringbuildermain
{
	public static void main(string args[])
	{
		Stringbuilder s1=new Stringbuilder("java programming");
		System.out.printLn(s1.capacity());
		s1=append("language");
		System.out.printLn(s1.capacity());
		s1=insert(1,"oriented");
		System.out.printLn(s1.capacity());
		s1=replace(1,3,".");
		System.out.printLn(s1.capacity());
		s1=delete(1,"oriented");
		System.out.printLn(s1.capacity());
		
