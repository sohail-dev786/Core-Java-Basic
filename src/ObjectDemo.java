
class Calci{
    int num1;
    int num2;
    int result;

    public  void add(){
        result=num1+num2;
    }
    public  void sub(){
        result=num1-num2;
    }
    public  void mult(){
        result=num1*num2;
    }
    public  void div(){
        result=num1/num2;
    }

}
public class ObjectDemo {


    public static void main(String[] args) {
        System.out.println("Object Class Working !");

        Calci obj=new Calci();
        obj.num1=5;
        obj.num2=5;


        obj.add();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);
        obj.mult();
        System.out.println(obj.result);
        obj.div();
        System.out.println(obj.result);

    }
}
