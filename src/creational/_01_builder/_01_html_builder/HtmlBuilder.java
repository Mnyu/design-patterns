package creational._01_builder._01_html_builder;

public class HtmlBuilder {
    private String rootName;
    private HtmlElement root;

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        this.root = new HtmlElement(rootName);
    }

    public void addChild(String childName, String childText) {
        HtmlElement child = new HtmlElement(childName, childText);
        root.addChild(child);
    }

    public HtmlBuilder appendChild(String childName, String childText) {
        HtmlElement child = new HtmlElement(childName, childText);
        root.addChild(child);
        return this;
    }


    public void clear() {
        root = new HtmlElement(rootName);
    }

    // BUILDER in this case will create an object of type string and return that
    @Override
    public String toString() {
        return root.toString();
    }
}
