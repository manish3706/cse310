//create a class outer with the data member int data=10 and member function is int getdata() which returns the value of data veriable . 
create main method class 

class outer
{
int data=10;
int getdata()
{
return data;
public static void main(String[] args)
{
outer obj=new outer ();
if (obj.data<20)
{
class inner 
{
void print()
{
system.out.println("local Innere class";
system.out.println("data:"+obj.getdata();
	}
  }
inner obj1=new Inner()
obj1.print();
	}
   }
}