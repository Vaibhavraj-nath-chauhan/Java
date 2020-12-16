public class class_use {
    public static void main(String args[])
    {
        volume v1 = new volume();
        double vol = v1.checking();
        System.out.println("Volume is "+vol);

        volume v2 = new volume(12,12,12);
        vol = v2.checking();
        System.out.println("Volume is "+vol);
    }
}

class volume{
    double length;
    double width;
    double height;
    volume(){
        width = 10;
        length = 10;
        height = 10;
    }

    volume(double w,double l,double h){
        width = w;
        length = l;
        height = h;
    }


    double checking(){
        return length * width * height;
    }
}






