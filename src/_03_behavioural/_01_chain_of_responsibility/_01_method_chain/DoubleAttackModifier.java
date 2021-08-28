package _03_behavioural._01_chain_of_responsibility._01_method_chain;

public class DoubleAttackModifier extends CreatureModifier {

    public DoubleAttackModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Doubling " + creature.getName() + "'s attack");
        creature.setAttack(creature.getAttack() * 2);
        super.handle();
        // super.handle() has to be called because the base class handle() is designed for the
        // traversal of the entire chain of responsibility.
    }
}
