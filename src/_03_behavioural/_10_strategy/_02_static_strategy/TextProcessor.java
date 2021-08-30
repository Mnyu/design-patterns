package _03_behavioural._10_strategy._02_static_strategy;

import _03_behavioural._10_strategy._01_dynamic_strategy.ListStrategy;

import java.util.List;
import java.util.function.Supplier;

public class TextProcessor<LS extends ListStrategy> {
    private StringBuilder sb = new StringBuilder();
    private LS listStrategy;

    public TextProcessor(Supplier< ? extends LS> constrctor) {
        listStrategy = constrctor.get();
    }

    public void appendList(List<String> items) {
        listStrategy.start(sb);
        for (String item : items) {
            listStrategy.addListItem(sb, item);
        }
        listStrategy.end(sb);
    }

    public void clear() {
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
