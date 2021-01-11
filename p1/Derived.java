package p1;

public class Derived extends Protection{
    Derived(){
        System.out.println("Derived constructor");
        System.out.println("n = "+n);
        System.out.println("Private can only be fetched by its base file");
        System.out.println("Protected = "+pro);
        System.out.println("Public = "+pub);
    }
}
