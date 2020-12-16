public class returning_object {
    public static void main(String args[]){
        complex comp1 = new complex();
        complex comp2 = new complex(10,20);
        complex comp3 = new complex(20,40);
        complex comp5 = comp1.sum(comp2,comp3);
        //complex comp1 printing
        System.out.println("Comp1: "+comp1.real+"+"+comp1.img+"i");
        //complex comp2 printing
        System.out.println("Comp1: "+comp2.real+"+"+comp2.img+"i");
        //complex comp3 printing
        System.out.println("Comp1: "+comp3.real+"+"+comp3.img+"i");
        //complex comp4 printing
        System.out.println("Comp1: "+comp5.real+"+"+comp5.img+"i");

    }
}
class complex{
    int real,img;
    complex(){
        real = img = -1;
    }
    complex(int a,int b){
        real = a;
        img = b;
    }
    complex sum(complex i, complex j){
        complex c = new complex();
        c.real = i.real + j.real;
        c.img = i.img + j.img;
        return c;
    }
}
