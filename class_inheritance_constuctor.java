public class class_inheritance_constuctor {
    public static void main(String args[]){
        System.out.println("Calling Class C which inherit Class B and Class B is inherit by class A");
        C call = new C();               //calling classs C
    }
}

class A{                                               //body of class A
    A(){
        System.out.println("This is class A");        //finrst to print
    }
}

class B extends A{                                 //inherit from class A
    B(){
        System.out.println("This is class B");
    }
}

class C extends B{                                 //inherit from B
    C(){
        System.out.println("This is class C");
    }
}