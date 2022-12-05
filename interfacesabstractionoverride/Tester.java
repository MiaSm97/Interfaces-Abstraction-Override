package override.interfacesabstractionoverride;

public class Tester {
    public static void main(String[] args) {
        Car car = new Car(4,4,5000.0);
        Boat boat = new Boat(500.0, 500);

        car.doVehicleSound();
        boat.doVehicleSound();
        boat.getBoatWeightAndSpeed();



    }


    }


    /*define a tester class where you:
        create a Car object and a Boat object
        invoke the two Vehicle methods for the newly created Car and Boat objects
        print in console the Boat weight and speed using the dedicated method*/
