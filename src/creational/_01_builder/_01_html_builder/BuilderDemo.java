package creational._01_builder._01_html_builder;

public class BuilderDemo {
    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "hello");
        builder.addChild("li", "world");
        System.out.println(builder);

        // Fluent Interface- write long chains to build things
        StringBuilder sb = new StringBuilder().append("Hello").append("world");
        System.out.println(sb);

        // Our HtmlBuilder fluent interface
        HtmlBuilder fluentBuilder = new HtmlBuilder("ul");
        fluentBuilder.appendChild("li", "hello")
                .appendChild("li", "world");
        System.out.println(fluentBuilder);
    }
}
