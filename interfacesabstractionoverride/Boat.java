package override.interfacesabstractionoverride;

public class Boat extends AbstractVehicle{


    double maxKnotSpeed;
    int boatKilosWeight;
    @Override
    public void doVehicleSound() {

        System.out.println("Boat sound: Brrrrr");

    }

    public Boat(double maxSpeed, int weight){

        this.maxKnotSpeed = maxSpeed;
        this.boatKilosWeight = weight;
        //this.type = type;

    }

    public void getBoatWeightAndSpeed(){
        System.out.println("Total kilos weight: " + this.boatKilosWeight + ". Maximum knots speed: " + this.maxKnotSpeed);
    }


}

    /*define a subclass Boat of Vehicle that has:
        a double attribute maxKnotsSpeed
        an int attribute boatKilosWeight
        a mandatory override of the abstract method doVehicleSound() where you print the boat's sound
        a constructor method that:
        accepts 2 params (maxSpeed, weight)
        assign the correct values to type, maxKnotsSpeed and boatKilosWeight
        a method getBoatWeightAndSpeed that returns an informative String about the total kilos weight and the maximum knots speed
        define a tester class where you:
        create a Car object and a Boat object
        invoke the two Vehicle methods for the newly created Car and Boat objects
        print in console the Boat weight and speed using the dedicated method*/
