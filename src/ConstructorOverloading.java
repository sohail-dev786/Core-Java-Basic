public class ConstructorOverloading {

    public  ConstructorOverloading()
    {
        System.out.println("Default Constructor");
    }
    public  ConstructorOverloading(int i)
    {
        i=10;
        System.out.println("The Value of i is :"+i);
    }

    public  ConstructorOverloading(int i,int j)
    {
        System.out.println("Te Value of i and j is :"+i+" :"+j);
    }
    public  ConstructorOverloading(int i,int j,String answer)
    {

        System.out.println(answer);
    }

    public static void main(String[] args) {
        System.out.println("Constructor Overloading !!");
        ConstructorOverloading obj=new ConstructorOverloading();
        ConstructorOverloading obj1=new ConstructorOverloading(2);
        ConstructorOverloading obj2=new ConstructorOverloading(5,10);
        ConstructorOverloading obj3=new ConstructorOverloading(5,5,"Yup its Working");

    }
}
