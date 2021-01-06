package p2;

public class OtherPackage {
    OtherPackage(){
        p1.Protection p = new p1.Protection();
        System.out.println("Other Packages constructor");
        System.out.println("Normal Int only be fetched by base directory");
        System.out.println("Private can only be fetched by its base file");
        System.out.println("Protected Int only be fetched by base directory");
        System.out.println("Public = "+p.pub);
    }
    
}
