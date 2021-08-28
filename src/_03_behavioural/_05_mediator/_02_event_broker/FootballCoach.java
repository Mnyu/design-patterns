package _03_behavioural._05_mediator._02_event_broker;

public class FootballCoach {
    public FootballCoach(EventBroker eventBroker) {
        eventBroker.subscribe(i -> {
            System.out.println("Hey, you scored " + i + " goals!!!" );
        });
    }
}
