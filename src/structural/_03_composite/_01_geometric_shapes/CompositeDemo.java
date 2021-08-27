package structural._03_composite._01_geometric_shapes;

public class CompositeDemo {
    public static void main(String[] args) {
        GraphicObject drawing = new GraphicObject();
        drawing.setName("MyDrawing");
        drawing.addChildren(new Square("Red"));
        drawing.addChildren(new Square("Blue"));
        drawing.addChildren(new Circle("Yellow"));

        GraphicObject group = new GraphicObject();
        group.addChildren(new Circle("Black"));
        group.addChildren(new Square("White"));

        drawing.addChildren(group);
        System.out.println(drawing);
    }
}
