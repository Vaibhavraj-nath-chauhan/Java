public class class_inheritance {

    public static void main(String args[]){
        System.out.println("Working");
        C my_obj = new C(10,20,30,40,50,60);
        my_obj.show();
    }
    
}

class A{
    int i;
    A(int a){
        i = a;
    }
}

class B extends A{
    int j,k;
    B(int b,int c,int a){
        super(a);
        j = b;
        k = c;
    }
}

class C extends B{
    int l,m,n;
    C(int d,int e,int f,int b,int c,int a){
        super(b, c, a);
        l= d; 
        m= e;
        n= f;
    }

    void show(){
        System.out.println("Sum is :"+(i+j+k+l+m+n));
    }
}