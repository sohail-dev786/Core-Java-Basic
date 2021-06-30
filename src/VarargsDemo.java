class  Calc{

    public int add(int ... n)
    {

        int sum=0;
        for(int add:n)
        {;
            sum=sum+add;
        }
        return  sum;
    }
}

public class VarargsDemo {

    public static void main(String[] args) {
        System.out.println("Var Args Demo Is Working");
        Calc obj=new Calc();
        System.out.println(obj.add(2,4,4,10));
    }
}
