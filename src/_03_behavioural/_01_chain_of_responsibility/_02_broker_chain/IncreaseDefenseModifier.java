package _03_behavioural._01_chain_of_responsibility._02_broker_chain;

public class IncreaseDefenseModifier extends CreatureModifier {

    private final int token;

    public IncreaseDefenseModifier(Game game, Creature creature) {
        super(game, creature);
        token = game.queries.subscribe(q -> {
            if (q.getCreatureName().equals(creature.getName()) && q.getArgument() == Query.Argument.DEFENSE) {
                q.setResult(q.getResult() + 3);
            }
        });
    }
}
