package interfaces;

interface Bike {

    // in interfaces one can only declare methods, not define them
    // also variables must be defined as constants
    public static final int speed = 60;
    void applyBrake(int decrement);


    void speedUp(int increment);
}
