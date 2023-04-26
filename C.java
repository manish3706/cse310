class A
{
int age;
public void show()
{
System.out.println("A class fn");
}
class B
{
public void config()
{
System.out.println("B class fn");
}}}
class C
{
public static void main(String[] args)
{
A obj=new A();
obj.show();
A.B obj1= obj.new B();
obj1.config();
}}