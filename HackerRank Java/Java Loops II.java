import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int o=0;o<n;o++){
                a +=  Math.pow(2,o)*b;
                System.out.print(a+" ");
            }
            System.out.print("\n");
        }
        in.close();
        
    }
}