public class MethodOverloadingDemo {

//    Method Overloading-Same name but Different Parameter

    public void add(int i,int j){
        System.out.println(i+j);
    }

    public void add(int i,int j,int k)
    {
        System.out.println(i+j+k);
    }
    public void add(double i,double j)
    {
        System.out.println(i+j);
    }

    public static void main(String[] args) {
        System.out.println("Method Overloading Working !!");

        MethodOverloadingDemo obj=new MethodOverloadingDemo();
        obj.add(5,5);
        obj.add(5,5,5);
        obj.add(5.5,5.5);

    }
}
