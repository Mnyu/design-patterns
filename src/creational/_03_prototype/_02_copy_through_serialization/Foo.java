package creational._03_prototype._02_copy_through_serialization;

import java.io.Serializable;

public class Foo implements Serializable {
    private int stuff;
    private String whatever;

    public Foo(int stuff, String whatever) {
        this.stuff = stuff;
        this.whatever = whatever;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "stuff=" + stuff +
                ", whatever='" + whatever + '\'' +
                '}';
    }

    public int getStuff() {
        return stuff;
    }

    public void setStuff(int stuff) {
        this.stuff = stuff;
    }

    public String getWhatever() {
        return whatever;
    }

    public void setWhatever(String whatever) {
        this.whatever = whatever;
    }
}
