import java.util.Scanner;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()>1)
        {
        String s1=s.toLowerCase();
        String s2=s1.replace(' ','$');
        System.out.println(s2);
        }
    }
}