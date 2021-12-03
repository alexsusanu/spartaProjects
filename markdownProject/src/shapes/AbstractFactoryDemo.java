package shapes;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactoryNotRounded = FactoryProducer.getFactory(false); //shape

        Shape shapeNotRounded1 = shapeFactoryNotRounded.getShape("rectangle");
        Shape shapeNotRounded2 = shapeFactoryNotRounded.getShape("square");
        shapeNotRounded1.draw();
        shapeNotRounded2.draw();

        AbstractFactory shapeFactoryRounded = FactoryProducer.getFactory(true); // rounded
        Shape shapeRounded1 = shapeFactoryRounded.getShape("rectangle");
        Shape shapeRounded2 = shapeFactoryRounded.getShape("square");
        shapeRounded1.draw();
        shapeRounded2.draw();

    }
}
