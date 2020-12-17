public class area_with_refrence {
    public static void main(String args[]){
        //defining figure class
        Figure fig = new Figure(10,10);
        //defining rectangle class
        Rectangle r = new Rectangle(10, 10);
        //defining triangle class
        Triangle t = new Triangle(10, 10);


        //creating refrence
        Figure figure;
        //assiging figure class
        figure = fig;
        System.out.println("Area is -->"+figure.area()+"\n");
        //assiging rectangle class
        figure = r;
        System.out.println("Area is -->"+figure.area()+"\n");
        //assiging triangle class
        figure = t;
        System.out.println("Area is -->"+figure.area()+"\n");
    }
}

class Figure{
    double dim1;
    double dim2;
    Figure(double a,double b){
        dim1 = a;
        dim2 = b;
    }
    double area(){
        System.out.println("Area of figure is undifined");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a,double b){
        super(a, b);
    }
    double area(){
        System.out.println("Inside Area of Rectangle");
        return dim1*dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("Inside Area OF Triangle");
        return ((dim1*dim2)/2);
    }
}
