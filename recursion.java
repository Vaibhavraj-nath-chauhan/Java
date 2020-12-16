import java.util.*;
public class recursion {
    static int factorical(int k) {
        if (k >1 ) {
            return k*factorical(k-1);
        }
        else{
            return 1;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of which you want to find factorical:-->");
        int k = sc.nextInt();
        int n = factorical(k);
        System.out.println("Factorical of "+k+" is-->"+n);
    }
}
