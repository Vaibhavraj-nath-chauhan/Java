public class overloading {
    public static void main(String args[]){
        
        overloaders ol = new overloaders();
        int i=10,j=20;
        double k=30,l = 40;
        ol.test();
        ol.test(i,j);
        ol.test(k);
        ol.test(k,l);
    }
    
}

class overloaders{

    void test()
    {
        System.out.println("No Parmeter");
    }
    /////////////////////////////////////////////////

    void test(int a)
    {
        System.out.println("Parameter is: "+a);
    }
    /////////////////////////////////////////////////

    void test(int a,int b)
    {
        System.out.println("Parmeter are: "+a+", "+b);
    }
    /////////////////////////////////////////////////

    void test(double a)
    {
        System.out.println("Parmeter(in double): "+a);
    }
    /////////////////////////////////////////////////

    void test(double a, double b)
    {
        System.out.println("Parmeter(in double): "+a+", "+b);  
    }
}
