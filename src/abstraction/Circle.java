package abstraction;

// if you want to implement an abstract class, you need to use the keyword "extends"
public class Circle extends Graphic {

    // when you extend the abstract class then YOU HAVE TO implement the abstract methods

    @Override
    void draw() {
        System.out.println("Draw a circle");
    }

    @Override
    void resize() {
        System.out.println("Resize a circle");
    }
}
