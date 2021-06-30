
class Cal{

//    Creating a Instance Variable

    int num1;
    int num2;
    int result;
    public Cal(int num1,int num2)
    {
    this.num1=num1;
    this.num2=num2;
    System.out.println(this.result=num1+num2);
    }
}
public class ThisDemo {
    public static void main(String[] args) {
        System.out.println("This Keyword Demo is Working");
        Cal obj=new Cal(5,5);
        System.out.println(obj.num1);
        System.out.println(obj.num2);

    }
}
