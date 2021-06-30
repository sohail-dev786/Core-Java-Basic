public class LoopsApp {
    public static void main(String[] args) {
        System.out.println("Loops App Working");

        System.out.println("While Loop");
        int i=1;
        while(i<=10){
            System.out.println("Hello World "+":"+i);
            i++;
        }

        System.out.println();
        System.out.println("Do-While Loop");
        int j=11;
        do{
            System.out.println("Hello World "+":"+j);
            j++;
        }while (j<=20);


        System.out.println();
        System.out.println("For-Loop");
        for(int k=21;k<=30;k++)
        {
            System.out.println("Hello World "+":"+k);
        }


        System.out.println();
        System.out.println("Continue Statement");
        for(int a=31;a<=40;a++){
            if(a==35)
            {
                continue;
            }
            System.out.println("Hello World "+":"+a);
        }

        System.out.println();
        System.out.println("Break Statement");
        for(int b=41;b<=50;b++){
            if(b==45)
            {
                break;
            }
            System.out.println("Hello World "+":"+b);
        }
    }
}
