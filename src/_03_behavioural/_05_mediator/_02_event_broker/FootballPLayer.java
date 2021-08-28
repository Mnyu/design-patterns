package _03_behavioural._05_mediator._02_event_broker;

public class FootballPLayer {
    private String name;
    private int goalsScored = 0;
    private EventBroker eventBroker;

    public FootballPLayer(String name, EventBroker eventBroker) {
        this.name = name;
        this.eventBroker = eventBroker;
    }

    public void score() {
        eventBroker.publish(++goalsScored);
    }
}
