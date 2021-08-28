package _03_behavioural._01_chain_of_responsibility._01_method_chain;

public class IncreaseDefenseModifier extends CreatureModifier {

    public IncreaseDefenseModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Increasing " + creature.getName() + "'s defense");
        creature.setDefense(creature.getDefense()  + 3);
        super.handle();
        // super.handle() has to be called because the base class handle() is designed for the
        // traversal of the entire chain of responsibility.
    }
}
