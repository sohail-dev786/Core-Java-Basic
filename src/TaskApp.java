public class TaskApp {

    public static void main(String[] args) {
        System.out.println("Task App Working !");

        String actorName="Shahrukh Khan";
        int yearOfBorn=1975;
        int age=2021-yearOfBorn;

        String[] movies={
            "Dilwale","RAEES","OM SHANTI OM","PATHAN","MY Name is khan",
                "CHENNAI EXPRESS"
        };
        float[] rating={
                4.0F,4.5F,5.0F,5.5F,
                6.0F,6.5F,7.0F,7.5F,8.0F
                ,8.5F,9.0F,9.5F,10.0F
        };

        System.out.println("Actor Name"+actorName);
        System.out.println("Born "+yearOfBorn+" ( "+age+" Years Old)");

        System.out.println("Movies");

        for(String list:movies)
        {
                System.out.println(list);
        }




    }
}
