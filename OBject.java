import java.util.Scanner;
class OBject{
    Object returnObject(){
        return this.obj;
    }
    Object obj=null;
    OBject(Object ob){
        this.obj=ob;
    }
    public static void main(String a[]){
        OBject o1=new OBject(new Scanner(System.in));
        System.out.println(o1.returnObject());
    }
}