package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        Graphic circle = new Circle();

        circle.draw();
        circle.resize();
    }
}
