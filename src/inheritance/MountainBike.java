package inheritance;

public class MountainBike extends Bike{

    public int seatHeight;

    // in this MountainBike constructor, it implements the arguments of Bike class here in the MountainBike Constructor
    public MountainBike(int seatHeight,int gear, int speed) {
        super(gear, speed); // calls the constructor of the super class
        this.seatHeight = seatHeight;
    }
    public void setSeatHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }
}
