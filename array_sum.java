import java.util.*;                                   //import all files (Scanner Required)
public class array_sum {
    public static void main(String args[])           //creating a main class to execute code
    {
        Scanner sc = new Scanner(System.in);         //creating a object of scanner class
        System.out.println("Enter Array Size");      //asking for user to input arry value
        int val = sc.nextInt();                      //taking user value
        int[] my_arr = new int[val];                 //creating an array of user defind value

        for(int i =0;i<val+val;i++)                  //creating a for loop which will store even values in array 
        {                                                  
            if(i%2==0)                               //checking even condition
            {
            my_arr[i/2] =i;                          //inserting value in array
            
            }  
        }
        int sum=0;                                  
        for(int i =0;i<my_arr.length;i++)           //running loop till length of array
        {
            sum+=my_arr[i];                         //adding errev element
        }
        System.out.println("Sum of element in array: "+sum+"\nAverage of elements in array: "+sum/my_arr.length);   //printing
    }  
}
