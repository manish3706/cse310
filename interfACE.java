interface Add_sub
{
void add (double x, double y);
void sub (double x, double y);
}

interface Mul_div
{
void mul (double x, double y);
voiid div (double x, double y);
}
interface calculate extends Add_sub , Mul_div
{
defult void print (double res)
{
system.out,printIn(res);
}
}
class mycalculator implements calculate
{

class mainInterface
{
public static void main(string[] args)
}
mycalcu