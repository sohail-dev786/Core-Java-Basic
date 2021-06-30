public class ObjectReferenceApp {
    public static void main(String[] args) {

        System.out.println("Object Reference Data Type !");

        Byte numberOfSeats=7;
        Short power=300;
        Integer price=700000;
        Long registrationNumber=24567823212L;
        Float fuelConsumption=15.5F;
        Double fuelConsumptionAverage=15.58329832938;

        Boolean isDamaged=true;
        Character energyCategory='G';

        String carName="TATA SAFARI 2021";

        System.out.println("CAR NAME :"+carName.toLowerCase());
        System.out.println("CAR NAME :"+carName.toUpperCase());

        System.out.println("-----------------");

        System.out.println("Price :"+price);
        System.out.println("Number of Seats :"+numberOfSeats);
        System.out.println("Registration Number :"+registrationNumber);
        System.out.println("Fuel Consumption :"+fuelConsumption);
        System.out.println("Fuel Consumption Average :"+fuelConsumptionAverage);

        System.out.println("-----------------");
        System.out.println("IS Vehicle Damage ?? :"+isDamaged);
        System.out.println("Vehicle Energy Category :"+energyCategory);


    }

}
