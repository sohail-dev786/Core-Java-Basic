class A{
    public  A(){
        System.out.println("A");
    }
    public A(int a){
        System.out.println("Parent Parameter Constructor");
    }
}
class B extends  A{
    public  B(){
        super();
        System.out.println("B");
    }
    public B(int b){
        super(b);
        System.out.println("Child Parameter Constructor");
    }
}


public class SuperDemo {

    public static void main(String[] args) {
        System.out.println("Super Demo is Working");

        B obj=new B(5);
    }
}
