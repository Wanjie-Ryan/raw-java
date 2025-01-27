package inheritance;

public class InheritanceDemo {

    public static void main(String[] args) {
        MountainBike bike = new MountainBike(20,10,3);
        System.out.println("Gear is " + bike.gear);
        System.out.println("Seat height is " +bike.seatHeight);
        System.out.println("Bike speed is " +bike.speed);
        bike.applyBrake(2);
        System.out.println("Bike speed after applying brakes is " +bike.speed);
    }
}
