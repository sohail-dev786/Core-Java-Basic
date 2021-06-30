
 class Person{

//    if i  declare variable as a final that means that will be constant for
//    entire application no one can make changes on that particular variable


//    When we declare a class as a final that means children class cannot be
//    that class which is declare as a final

//    When we declare a Methad as a final that means we cannot override that method .

    final int roll_no=101;

     public final void display(){
        System.out.println("Roll No :"+roll_no);
//        roll_no=102; THIS IS NOT ALLOWED
    }
}
class Children  extends  Person{

//    public  void display(){  // it will give error
//        System.out.println("Children");
//    }
}
public class FinalKeywordDemo {
    public static void main(String[] args) {
        System.out.println("Final Keyword Working");
    }
}
