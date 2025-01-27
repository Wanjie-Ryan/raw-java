package abstraction;

// an abstract class does not have an implementation, constructor
public abstract class Graphic {
    int x,y;

    void moveTo(int newX, int newY){
        System.out.println("Move to x: " + newX + " y: " + newY);
    }

    // abstract methods, just plain with no implementation
    abstract void draw();
    abstract void resize();
}
