public class box_overloading {
    public static void main(String args[]){
        box my_box_1 = new box();
        box my_box_2 = new box(10,20,30);
        box my_box_3 = new box(10);
        System.out.println("Checking.......");
        double vol;

        //Let Se What is happning no parameter
        vol = my_box_1.volume(); 
        System.out.println("Volume of no paramter: "+vol);

        //Let see what happen when we pass 3 arguments
        vol = my_box_2.volume(); 
        System.out.println("Volume of three paramter: "+vol);

        //Let see what happen when we pass 1 arguments
        vol = my_box_3.volume(); 
        System.out.println("Volume of one paramter: "+vol);
    }
}

class box{
    
    double height,width,length;
    box(){
        height = -1;
        width = -1;
        length = -1;
    }
    box(double h,double w,double l){
        height = h;
        width = w;
        length = l;
    }
    box(double l){
        height = width =length = l;
    }
    
    double volume(){
        return height*width*length;
    }
}
