import java.util.*;
public class student
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //namce input
        System.out.print("Enter Your name--> ");
        String Name = sc.nextLine();

        //rollnumber input
        System.out.print("Enter Your Roll number--> ");
        int roll_number = sc.nextInt();
        
        //marks input 
        System.out.print("Enter maths marks--> ");
        double maths = sc.nextDouble();

        System.out.print("Enter Science marks--> ");
        double science = sc.nextDouble();

        //printing all data out
        System.out.println("\nName: "+Name+"\nRoll Number: "+roll_number+"\nMaths Marks: "+maths+"\nScience Marks: "+science);

    }

    
}
