package structural._04_decorator._02_dynamic_decorator_composition;

public class Circle implements Shape {
    private float radius;

    public Circle() {}

    public Circle(float radius) {
        this.radius = radius;
    }

    public void resize(float factor) {
        radius *= factor;
    }

    @Override
    public String info() {
        return "A circle of radius " + radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
