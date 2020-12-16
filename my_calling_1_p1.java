import java.util.*;
public class call {
    Scanner sc = new Scanner(System.in);
    String name = "";
    double age = 0;
    public void get_data()
    {
        name = sc.nextLine();
        age = sc.nextDouble();
    }
    public void put_data()
    {
        System.out.println("Name : "+name+"\nAge : "+age);
    }
}
