package structural._04_decorator._03_static_decorator_composition;

import java.util.function.Supplier;

public class TransparentShape<T extends Shape> implements Shape {
    private Shape shape;
    private int transparency ;

    public TransparentShape(Supplier<? extends T> constructor, int transparency) {
        this.shape = constructor.get();
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " has transparency " + transparency + "%";
    }
}
