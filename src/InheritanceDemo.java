class Calculator{

    public int add(int i,int j){
        return  i+j;
    }

}
class CalculatorAdv extends  Calculator{
    public  int sub(int i,int j){
        return  i-j;
    }
}
class  CalculatorVeryAdv extends  CalculatorAdv{
    public  int multi(int i,int j){
        return  i*j;
    }
}
public class InheritanceDemo {

    public static void main(String[] args) {
        System.out.println("Inheritance Demo Working");

        CalculatorVeryAdv obj=new CalculatorVeryAdv();
        int result=obj.add(2,3);
        int result1=obj.sub(5,5);
        int result2=obj.multi(2,10);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);



    }
}
