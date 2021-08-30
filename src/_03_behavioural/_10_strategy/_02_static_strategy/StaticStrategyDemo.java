package _03_behavioural._10_strategy._02_static_strategy;

import _03_behavioural._10_strategy._01_dynamic_strategy.HtmlListStrategy;
import _03_behavioural._10_strategy._01_dynamic_strategy.MarkdownListStrategy;

import java.util.Arrays;

public class StaticStrategyDemo {
    public static void main(String[] args) {
        TextProcessor<MarkdownListStrategy> tp = new TextProcessor<>(MarkdownListStrategy::new);
        tp.appendList(Arrays.asList("Test1", "Test2", "Test3", "Test4"));
        System.out.println(tp);

        TextProcessor<HtmlListStrategy> tp2 = new TextProcessor<>(HtmlListStrategy::new);
        tp2.appendList(Arrays.asList("Fail1", "Fail2", "Fail3", "Fail4"));
        System.out.println(tp2);
    }
}
