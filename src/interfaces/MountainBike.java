package interfaces;

public class MountainBike implements Bike{

    private int seatHeight;
    private int gear;
    private int speed;

    public MountainBike(int seatHeight, int gear, int speed){
        this.seatHeight = seatHeight;
        this.gear = gear;
        this.speed = speed;
    }
    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;

    }
}
