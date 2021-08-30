package _03_behavioural._10_strategy._01_dynamic_strategy;

public class HtmlListStrategy implements ListStrategy {
    @Override
    public void start(StringBuilder sb) {
        sb.append("<ul>").append(System.lineSeparator());
    }

    @Override
    public void end(StringBuilder sb) {
        sb.append("</ul>").append(System.lineSeparator());
    }

    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append("  <li>")
                .append(item)
                .append("</li>")
                .append(System.lineSeparator());
    }
}
