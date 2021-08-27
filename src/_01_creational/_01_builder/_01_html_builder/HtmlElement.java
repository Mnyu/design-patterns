package _01_creational._01_builder._01_html_builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HtmlElement {

    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    private String name;
    private String text;
    private List<HtmlElement> elements = new ArrayList<>();

    public HtmlElement() {}

    public HtmlElement(String name) {
        this.name = name;
    }

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    private String toStringImpl(int indentLevel) {
        StringBuilder sb = new StringBuilder();
        String i = String.join("", Collections.nCopies(indentLevel * indentSize, " "));
        sb.append(String.format("%s<%s>%s", i, name, newLine));
        if (text != null && !text.isEmpty()) {
            sb.append(String.join("", Collections.nCopies(indentSize * (indentLevel + 1), " ")))
                    .append(text)
                    .append(newLine);
        }

        for (HtmlElement e : elements)
            sb.append(e.toStringImpl(indentLevel + 1));

        sb.append(String.format("%s</%s>%s", i, name, newLine));
        return sb.toString();
    }

    public void addChild(HtmlElement element) {
        elements.add(element);
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }
}
