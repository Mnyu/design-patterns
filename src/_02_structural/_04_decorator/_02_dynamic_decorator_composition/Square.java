package _02_structural._04_decorator._02_dynamic_decorator_composition;

public class Square implements Shape {
    private float side;

    public Square() {}

    public Square(float side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "A square with side " + side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }
}
