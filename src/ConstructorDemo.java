public class ConstructorDemo {

    ConstructorDemo(){
        System.out.println("Hello ");
    }
    ConstructorDemo(int k){
        System.out.println("World");
    }

    public static void main(String[] args) {
        System.out.println("Constructor Working !!");

        ConstructorDemo obj1=new ConstructorDemo();
        ConstructorDemo obj=new ConstructorDemo(6);
    }
}
