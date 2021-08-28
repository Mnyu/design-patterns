package _03_behavioural._05_mediator._02_event_broker;

public class FootballDemo {
    public static void main(String[] args) {
        EventBroker eventBroker = new EventBroker();
        FootballPLayer player1 = new FootballPLayer("Player1", eventBroker);
        FootballCoach coach = new FootballCoach(eventBroker);

        player1.score();
        player1.score();
        player1.score();

    }
}
