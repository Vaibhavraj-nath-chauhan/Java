public class refrence_use {
   public static void main(String args[]){
       System.out.println("Working");
       A a = new A();
       B b = new B();
       C c = new C();
       A r;
       r = a;        //refrecne to a
       r.callme(); 
       r = b;        //refrecne to b
       r.callme();
       r = c;         //refrence to c
       r.callme();
   } 
}

class A{
    void callme(){
        System.out.println("Inside A's version of callme");
    }
}

class B extends A{
    void callme(){
        System.out.println("Inside B's version of callme");
    }
}

class C extends B{
    void callme(){
        System.out.println("Inside C's version of callme");
    }
}

