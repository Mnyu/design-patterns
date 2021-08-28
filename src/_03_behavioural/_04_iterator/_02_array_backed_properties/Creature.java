package _03_behavioural._04_iterator._02_array_backed_properties;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Creature implements Iterable<Integer> {

    private int[] stats = new int[3];

    public int getStrength() {
        return stats[0];
    }

    public void setStrength(int strength) {
        stats[0] = strength;
    }

    public int sum() {
        return IntStream.of(stats).sum();
    }

    public int max() {
        return IntStream.of(stats).max().getAsInt();
    }

    public double average() {
        return IntStream.of(stats).average().getAsDouble();
    }

    @Override
    public Iterator<Integer> iterator() {
        return IntStream.of(stats).iterator();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        for (int x : stats) {
            action.accept(x);
        }
    }
}
