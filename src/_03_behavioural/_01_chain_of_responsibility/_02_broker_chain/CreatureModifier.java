package _03_behavioural._01_chain_of_responsibility._02_broker_chain;

public class CreatureModifier {
    protected Game game;
    protected Creature creature;

    public CreatureModifier(Game game, Creature creature) {
        this.game = game;
        this.creature = creature;
    }
}
