package Learn;        //creating a package

public class Package_1 {
    public static void main(String args[]){
        Balance mybclance[] = new Balance[3];
        mybclance[0]=new Balance("Vaibhav",100);
        mybclance[1]=new Balance("Rana",99.999);
        mybclance[2]=new Balance("Raj",540);
        for(int i=0;i<3;i++){
            mybclance[i].show();
        }
    }
}
class Balance{
    String name;
    double bal;
    Balance(String n,double b){
        name = n;
        bal = b;
    }
    void show(){
        if (bal>0){
            System.out.print("--->");
            System.out.println(name + " $"+bal);
        }
    }
}



