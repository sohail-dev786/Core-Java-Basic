import java.util.Scanner;

public class ControlFlowApp {

    public static void main(String[] args) {
//        System.out.println("Control Flow Statement !!");

        System.out.println();
        System.out.println("IF Statement");
        int eggPrice=10;
        if(eggPrice>6){
            System.out.println("Don't Buy Egg !! Price is too high");
        }

        System.out.println();
        System.out.println("IF-ELSE Statement");
        boolean isCarDamaged=true;
        if(isCarDamaged){
            System.out.println("Car is Damaged");
        }
        else{
            System.out.println("Accident Free Car");
        }


        System.out.println();
        System.out.println("IF-ELSE-ELSE IF Statement");
//        int myMarks=60;

//        Taking Input From the user

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Marks :");
        int myMarks=sc.nextInt();
        if(myMarks<35){
            System.out.println("You Are Fails You Score is :"+myMarks);
        }
        else if(myMarks>=36 && myMarks<=50){
            System.out.println("You Pass With C Grade :"+myMarks);
        }
        else if(myMarks>=51 && myMarks<=75){
            System.out.println("You Pass With B Grade :"+myMarks);
        }
        else{
            System.out.println("You Pass With A Grade :"+myMarks);
        }

        System.out.println("Enter Your Phone Color");
        String myPhoneColor=sc.next();
        switch (myPhoneColor){
            case "red":
                        System.out.println("Your Phone Color Is Red");
                        break;
            case "blue":
                        System.out.println("Your Phone Color Is Blue");
                        break;
            case "black":
                        System.out.println("Your Phone Color Is Black");
                        break;
            default:
                System.out.println("Your Phone Color is Not Available");

        }


        System.out.println("Problem MCQ");
        System.out.println();
        System.out.println("Father of Light Bulb");
        System.out.println("Select Option ");
        System.out.println("A- NIKOLA TESLA");
        System.out.println("B- MARIE CURIE");
        System.out.println("C- THOMAS EDISON");
        System.out.println("D- ROBERT OPPENHEIMER");

       // char ans='C';

        char choice=sc.next().charAt(0);
        switch (choice){
            case 'A':
                     System.out.println("A- NIKOLA TESLA IS NOT A CORRECT ANSWER !! WRONG");
                     break;
            case 'B':
                     System.out.println("B- MARIE CURIE IS NOT A CORRECT ANSWER !! WRONG");
                     break;
            case 'C':
                     System.out.println("C- THOMAS EDISON  IS  A CORRECT ANSWER !! YUP YOU SELECT A RIGHT ONCE");
                     break;
            case 'D':
                     System.out.println("D- ROBERT OPPENHEIMER IS NOT A CORRECT ANSWER !! WRONG");
                     break;
            default:
                System.out.println("Wrong Choice");
        }


    }
}
