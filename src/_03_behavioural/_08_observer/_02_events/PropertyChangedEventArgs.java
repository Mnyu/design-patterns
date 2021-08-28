package _03_behavioural._08_observer._02_events;

public class PropertyChangedEventArgs {
    private Object source;
    private String propName;

    public PropertyChangedEventArgs(Object source, String propName) {
        this.source = source;
        this.propName = propName;
    }

    public String getPropName() {
        return propName;
    }
}
