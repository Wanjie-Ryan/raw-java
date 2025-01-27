package inheritance;

public class Bike {

    public int gear;
    public int speed;

    public Bike(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void setGear(int gear){
        this.gear = gear;
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getGear(){
        return gear;
    }
    public int getSpeed(){
        return speed;
    }

}
