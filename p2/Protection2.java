package p2;

public class Protection2 extends p1.Protection{
    Protection2(){
        System.out.println("Derived other Packages constructor");
        System.out.println("Normal Int only be fetched by base directory");
        System.out.println("Private can only be fetched by its base file");
        System.out.println("Protected Int only be fetched by base directory");
        System.out.println("Public = "+pub);
    }
}
