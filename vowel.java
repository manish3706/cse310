import java.util.Scanner;
class vowel
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char ch;
System.out.println("Enter the character: ");
ch=sc.next().charAt(0);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
System.out.println("The char is vowel");
else
System.out.println("The char is consonant");
}
}