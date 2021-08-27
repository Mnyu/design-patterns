package structural._04_decorator._03_static_decorator_composition;

import java.util.function.Supplier;

public class ColoredShape<T extends Shape> implements Shape {
    private Shape shape;
    private String color;

    public ColoredShape(Supplier<? extends T> constructor, String color) {
        this.shape = constructor.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " has color " + color;
    }
}
