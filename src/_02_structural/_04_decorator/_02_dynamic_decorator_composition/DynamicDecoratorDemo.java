package _02_structural._04_decorator._02_dynamic_decorator_composition;

public class DynamicDecoratorDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.info());

        ColoredShape blueSquare = new ColoredShape(new Square(5), "blue");
        System.out.println(blueSquare.info());

        TransparentShape myCircle = new TransparentShape(new ColoredShape(new Circle(10), "red"), 50);
        // myCircle.resize(2) -- This method is not available - Delegate methods also can't be used because we do not know kind of shape at compile time.
        System.out.println(myCircle.info());
    }
}
// ColoredShape and TransparentShape are called Dynamic Decorators because we can always build new decorators at
// runtime, which is very convenient if that is what we need.

