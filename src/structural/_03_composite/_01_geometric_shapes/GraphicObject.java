package structural._03_composite._01_geometric_shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GraphicObject {

    protected String name = "Group";
    private String color;
    private List<GraphicObject> children = new ArrayList<>();

    public GraphicObject() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        print(sb, 0);
        return sb.toString();
    }

    private void print(StringBuilder stringBuilder, int depth) {
        stringBuilder.append(String.join("", Collections.nCopies(depth, "*")))
                .append(depth > 0 ? " " : "")
                .append((color == null || color.isEmpty()) ? "" : color + " ")
                .append(getName())
                .append(System.lineSeparator());
        for (GraphicObject child : children)
            child.print(stringBuilder, depth + 1);
    }

    public void addChildren(GraphicObject obj) {
        children.add(obj);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// This Graphic object can act in 2 ways :

// 1. SCALAR : Somebody inherits from graphic object and make a circle or square and that's an individual single object.

// 2. GROUPING : It can also represent a grouping in where we have a bunch of children

// e.g. Powerpoint grouping