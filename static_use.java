public class static_use{
    static int a = 3;
    static int b;

    static void printing(int x){
        System.out.println("Value of X is:-->"+x);
        System.out.println("Value of static int 1 is (a):-->"+a);
        System.out.println("Value of static int 2 is (b = a*4):-->"+b);
    }
    static{
        System.out.println("Static Function is inilized-->");
        b = a*4;
    }
    public static void main(String args[]){
        int x = 30;
        printing(x);
    }
}