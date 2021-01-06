package p1;

public class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("Same Package Constructor");
        System.out.println("n = "+p.n);
        System.out.println("Private can only be fetched by its base file");
        System.out.println("Protected = "+p.pro);
        System.out.println("Public = "+p.pub);
    }
}
