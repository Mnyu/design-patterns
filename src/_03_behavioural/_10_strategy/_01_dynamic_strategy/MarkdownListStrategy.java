package _03_behavioural._10_strategy._01_dynamic_strategy;

public class MarkdownListStrategy implements ListStrategy {

    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append(" * ").append(item).append(System.lineSeparator());
    }
}
