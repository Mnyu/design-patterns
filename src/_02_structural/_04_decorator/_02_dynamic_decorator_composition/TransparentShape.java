package _02_structural._04_decorator._02_dynamic_decorator_composition;

public class TransparentShape implements Shape {
    private Shape shape;
    private int transparency ;

    public TransparentShape(Shape shape, int transparency) {
        this.shape = shape;
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " has transparency " + transparency + "%";
    }
}
