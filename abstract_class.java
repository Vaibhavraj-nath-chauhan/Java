public class abstract_class {
    public static void main(String args[]){
        Rectangle r = new Rectangle(10, 10);
        Triangle t = new Triangle(10, 10);

        //marking refrence
        Figure fig;
        //rectangle area-->
        fig = r;
        System.out.println("Area is:"+fig.area()+"\n");
        //Triangle area -->
        fig = t;
        System.out.println("Area is:"+fig.area()+"\n");
    }   
}

//figure class
abstract class Figure{
    double dim1,dim2;
    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    //area now here is abstract method
    abstract double area();
}

//rectangle class
class Rectangle extends Figure{
    Rectangle(double a,double b){
        super(a, b);
    }
    //overriding area class
    double area(){
        System.out.println("Inside Rectangle class");
        return dim1*dim2;
    }
}

//triangle class
class Triangle extends Figure{
    Triangle(double a,double b){
        super(a, b);
    }
    //overriding area class
    double area(){
        System.out.println("Inside Triangle class");
        return (dim1*dim2)/2;
    }
}