class  OuterClass{

    int a;
    public void show(){
        System.out.println("OuterClass Method");
    }
    class Inner{

        void display(){
            System.out.println("Inner Class Method");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        System.out.println("Inner Class Working");
        OuterClass obj=new OuterClass();
        obj.show();

//        TO CALL A INNER CLASS WE NEED TO FIRST CREATE A OBJECT OF OUTER CLASS AND THEN TAKE A REFERENCE OF OUTER CLASS
//        AND CALL A INNER CLASS.

        OuterClass.Inner obj1=obj.new Inner();
        obj1.display();


    }

}
