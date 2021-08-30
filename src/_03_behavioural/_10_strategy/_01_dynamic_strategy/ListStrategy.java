package _03_behavioural._10_strategy._01_dynamic_strategy;

public interface ListStrategy {

    default void start(StringBuilder sb) {};

    default void end(StringBuilder sb) {};

    void addListItem(StringBuilder sb, String item);
}
