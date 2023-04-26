import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        if(x>=0 && x<=100 && y>=0 && y<=100)
        {
            System.out.println(+ x*4+y*6);
        }
        else if(x<0 || y<0)
        {
            System.out.println(0);
        }
    }
}