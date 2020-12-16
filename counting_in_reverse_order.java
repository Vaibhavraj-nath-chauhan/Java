import java.util.*;
public class counting_in_reverse_order 
{
    static void function_le(int x)
    {
        if(x<=0)
        {
            System.exit(1);
        }
        System.out.print(x+" ");
        function_le(x-1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order to print -->");
        int val = sc.nextInt();
        function_le(val);
    }
    
}
