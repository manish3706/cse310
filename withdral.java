import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int bal=20000;
        
        String ac=sc.nextLine();
        String name=sc.nextLine();
        char gen=sc.next().charAt(0);
                
        int w;
        w=sc.nextInt();
        int s=bal - w;
                
        if(gen=='M' && w<=20000)
        {
            System.out.println("Hi Mr. "+ name +"!");
            System.out.println("Your Account Balance after withdrawl is "+ s +".");
        }
        
        else if(gen=='M' && w>20000)
        {
            System.out.println("Hi Mr. "+ name +"!");
            System.out.println("Insufficient Funds! You can not withdraw "+ w +".");
        }
        
        else if(gen=='F' && w<=20000)
        {
            System.out.println("Hi Ms. "+ name +"!");
            System.out.println("Your Account Balance after withdrawl is "+ s +".");
        }
        
        else if(gen=='F' && w>20000)
 {
            System.out.println("Hi Ms. "+ name +"!");
            System.out.println("Insufficient Funds! You can not withdraw "+ w +".");
        }
    }
}