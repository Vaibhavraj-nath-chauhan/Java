public class equal_checking {
    public static void main(String args[]){
        System.out.println("Checking Data is equail or not");
        check c1 = new check(21,10);
        check c2 = new check(21,10);
        System.err.println("c1 == c2 : "+c1.equals(c2));
    }
}

class check{
    int a,b;
    check(){
        System.out.println("No Data");
    }
    check(int c,int d){
        a = c;
        b = d;
    }
    boolean equals(check c2){
        if(c2.a == a && c2.b ==b) return true;
        else return false;
        
    }

}
