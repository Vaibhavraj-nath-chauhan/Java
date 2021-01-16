import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                for(int j=0;j<15;j++){
                    if(s1.length() == 15){
                        break;
                    }
                    else{
                        s1 += " ";
                    }
                }
                if(x == 0){
                    System.out.println(s1+"00"+x);
                }
                else if(x < 100){
                    System.out.println(s1+"0"+x);
                }
                else{
                System.out.println(s1+x);
                }
            }
            System.out.println("================================");

    }
}