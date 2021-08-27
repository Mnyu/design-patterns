package _02_structural._04_decorator._03_static_decorator_composition;

public class StaticDecoratorDemo {
    public static void main(String[] args) {
        ColoredShape<Square> blueSquare = new ColoredShape<>(() -> new Square(20), "blue");
        System.out.println(blueSquare.info());

        TransparentShape<ColoredShape<Circle>> myCircle = new TransparentShape<>(() -> new ColoredShape<>(() -> new Circle(10),
                "red"), 50);
        //myCircle.resize(2) --- unavailable here also
        System.out.println(myCircle.info());
    }
}
// Sometimes decorators are known before runtime and what if we bake all of them into a single type.
// This is an illustration of how we can actually kind of determine the types at compile time as opposed to runtime.
// Unfortunately, this does not fix the problem of the unavailability of the underlying API.
// This limits the use of decorators in Java.
