public class StaticDemo {

    int empid;
    int salary;
    static String ceo;

    void show()
    {
        System.out.println("emp id : "+empid);
        System.out.println("emp salary : "+salary);
        System.out.println("emp ceo : "+ceo);
    }

    public static void main(String[] args) {
        System.out.println("Static Demo Working !!");

        StaticDemo sohail=new StaticDemo();
        sohail.empid=101;
        sohail.salary=20000;
        sohail.ceo="Sohail Sir";

        StaticDemo viral=new StaticDemo();
        viral.empid=102;
        viral.salary=30000;
        viral.ceo="Sohail Sir";

        //  now here both employee working on a same company
        //  but we have change a value of one employee ceo name,but this value is change only for 1 employee
        // to resolve this issue ,we have to set the variable as a static.
        // so that can only be only for once class object at the time of class loading
        sohail.ceo="Naitik Joshi";
        StaticDemo.ceo="Viral Surti";

        sohail.show();
        viral.show();


    }
}
