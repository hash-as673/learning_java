interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bike implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }


    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}

public class Interfacing {
    public static void main(String[] args) {

        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.print("Bike present state : ");
        bike.printStates();
    }
}
