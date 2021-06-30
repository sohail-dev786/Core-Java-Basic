class Parent{
    public void show(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    public void show(){
        super.show();
        System.out.println("Child");
    }
}


public class MethodOverridingDemo {

    public static void main(String[] args) {
        System.out.println("Method Overriding Working");

        Child obj=new Child();
        obj.show();
    }
}
