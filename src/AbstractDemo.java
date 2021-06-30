abstract  class Human{

    public abstract  void eat();
    public  void show()
    {
        System.out.println("Concrete Method");
    }
}

class Eat extends  Human{

    @Override
    public void eat() {
        System.out.println("Eating");
    }
}


public class AbstractDemo {
    public static void main(String[] args) {
        System.out.println("Abstract Demo Working");

        Eat obj=new Eat();
        obj.show();
        obj.eat();

    }
}
