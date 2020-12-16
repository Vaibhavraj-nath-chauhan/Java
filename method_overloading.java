//in this function we will create function overloading 

public class method_overloading  //main class
{
    static void check(char a)
    {
        System.out.println("char: "+a);
    }
    static void check(char a,int b)
    {
        System.out.println("Char: "+a+",int:"+b);
    }
    static void check(int b)
    {
        System.out.println("int:"+b);
    }
    public static void main(String args[])  //main function
    {
        check('a');
        check('a',10);
        check(10);


    }
    
}
