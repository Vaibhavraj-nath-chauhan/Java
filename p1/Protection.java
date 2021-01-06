package p1;
public class Protection {
    int n=1;
    private int pri = 2;
    protected int pro =3;
    public int pub = 4;

    public Protection(){
        System.out.println("Base Constructor");
        System.out.println("n = "+n);
        System.out.println("Private = "+pri);
        System.out.println("Protected  = "+pro);
        System.out.println("Public = "+pub);
    }
    public static void main(String main[]){
    
    }

}
