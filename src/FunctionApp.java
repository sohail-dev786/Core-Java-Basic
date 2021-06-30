public class FunctionApp {

    public static void main(String[] args) {
        System.out.println("Function App Working");
        welcomeMessage();
        counterDisplay(10);
        getEnergyEfficiency('B');
        System.out.println(getEnergyEfficiencyUsingString('A'));
        studentDetails(101,"Sohail Shaikh",400);

    }

    static  void welcomeMessage()
    {
        System.out.println("Welcome Message");
    }

    static void  counterDisplay(int count)
    {
        for(int i=0;i<=count;i++)
        {
            System.out.println("Counter Value :"+i);
        }

    }



    static void getEnergyEfficiency(char category)
    {
        switch (category)
        {
            case 'A':
            case 'a':
                System.out.println("Very Low Energy Consumption");
                break;
            case 'B':
            case 'b':
                System.out.println("Low Energy Consumption");
                break;
            case 'C':
            case 'c':
                System.out.println("Normal Energy Consumption");
                break;
            case 'D':
            case 'd':
                System.out.println("Above Normal Energy Consumption");
                break;
            case 'E':
            case 'e':
                System.out.println("High Energy Consumption");
                break;
            case 'F':
            case 'f':
                System.out.println("Very High Energy Consumption");
                break;
            case 'G':
            case 'g':
                System.out.println("Extremely High Energy Consumption");
                break;
            default:
                System.out.println("Not Defined Category");

        }

    }



    static String getEnergyEfficiencyUsingString(char category1)
    {
        switch (category1)
        {
            case 'A':
            case 'a':
                return "Very Low Energy Consumption";

            case 'B':
            case 'b':
                return "Low Energy Consumption";

            case 'C':
            case 'c':
                return "Normal Energy Consumption";

            case 'D':
            case 'd':
                return "Above Normal Energy Consumption";

            case 'E':
            case 'e':
               return "High Energy Consumption";

            case 'F':
            case 'f':
                return "Very High Energy Consumption";

            case 'G':
            case 'g':
                return  "Extremely High Energy Consumption";

            default:
                return "Not Defined Category";

        }

    }

    static void studentDetails(int id,String name,int marks){
        System.out.println("Student id :"+id);
        System.out.println("Student Name :"+name);
        System.out.println("Student Total Marks :"+marks);
    }

}
