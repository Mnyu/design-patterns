package _03_behavioural._01_chain_of_responsibility._02_broker_chain;

public class BrokerChainDemo {
    public static void main(String[] args) {
        Game game = new Game(); // Event Broker
        Creature goblin = new Creature(game, "Goblin", 2, 2);
        System.out.println(goblin);

        IncreaseDefenseModifier icm = new IncreaseDefenseModifier(game, goblin);
        // As oon as we construct this object, the modifier has been automatically applied whenever because
        // whenever we query for getAttack or getDefense, we are going to get that modifier taking part because it is
        // subscribed to the events inside the Event Broker.

        try (DoubleAttackModifier dam = new DoubleAttackModifier(game, goblin)) {
            System.out.println(goblin);
        }
        System.out.println(goblin);
    }
}
// To overcome limitation mentioned in MethodChainDemo
// Patterns used :
// 1. Chain of Responsibility
// 2. Observer
// 3. Mediator
// 4. Memento (to some degree)
