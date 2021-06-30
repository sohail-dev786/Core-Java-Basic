public class OperatorApp {
    public static void main(String[] args){

        String carName="Tata Safari";
        int  carPrice=200000;
        int moneyInTheBAnk=500000;
        boolean isDamaged=true;
        int noOfTyre=4;

        System.out.println("Car Price :"+carPrice);
        int increaseCarPrice=carPrice+300000;
        System.out.println("Increase Car Price :"+increaseCarPrice);

        int decreasecarPrice=increaseCarPrice-100000;
        System.out.println("Increase Car Price :"+decreasecarPrice);

        int twoCarPrice=carPrice*2;
        System.out.println("TWO CAR PRICE :"+twoCarPrice);

        System.out.println("current Tyre "+noOfTyre);

        int upgradeTyre=noOfTyre++;
        System.out.println("Upgrade Car Tyre now :"+noOfTyre);
        upgradeTyre=noOfTyre--;
        System.out.println("Decrease by one:"+noOfTyre);


        carPrice+=100000;
        System.out.println("Increase Price :"+carPrice);
        carPrice-=100000;
        System.out.println("Decrease Price :"+carPrice);
        carPrice*=5;
        System.out.println("Multiply Price :"+carPrice);
        carPrice/=200000;
        System.out.println("Divide Price :"+carPrice);
        carPrice%=100000;
        System.out.println("Remainder Price :"+carPrice);

        System.out.println("Car Name :"+carName.toUpperCase());


        String damageText=isDamaged?"Car is Damaged":"CAr is Not Damaged";
        String damageText1=!isDamaged?"Car is Damaged":"CAr is Not Damaged";

        System.out.println(damageText);
        System.out.println(damageText1);

    }
}
