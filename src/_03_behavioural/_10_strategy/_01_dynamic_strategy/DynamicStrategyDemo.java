package _03_behavioural._10_strategy._01_dynamic_strategy;

import java.util.Arrays;

public class DynamicStrategyDemo {
    public static void main(String[] args) {
        TextProcessor tp = new TextProcessor(OutputFormat.MARKDOWN);
        tp.appendList(Arrays.asList("Test1", "Test2", "Test3", "Test4"));
        System.out.println(tp);

        tp.clear();

        tp.setOutputFormat(OutputFormat.HTML);
        tp.appendList(Arrays.asList("Fail1", "Fail2", "Fail3", "Fail4"));
        System.out.println(tp);
    }
}
