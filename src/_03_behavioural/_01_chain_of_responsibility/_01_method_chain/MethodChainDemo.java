package _03_behavioural._01_chain_of_responsibility._01_method_chain;

public class MethodChainDemo {
    public static void main(String[] args) {
        Creature goblin = new Creature("Goblin", 2, 2);
        System.out.println(goblin);

        CreatureModifier root = new CreatureModifier(goblin);

        System.out.println("Let's double Goblin's attack");
        root.add(new DoubleAttackModifier(goblin));
        System.out.println("Let's increase Goblin's defense");
        root.add(new IncreaseDefenseModifier(goblin));

        root.add(new NoBonusesModifier(goblin));

        // The below modification would be blocked because of NoBonusesModifier.
        root.add(new DoubleAttackModifier(goblin));

        root.handle(); // Traverses the entire chain of responsibility.
        System.out.println(goblin);
    }
}

// LIMITATION HERE :
// We have to explicitly apply all the modifiers to a creature.
// Why is it not possible to simply track the presence of an object in the system and
// apply the modifier only while the modifier is actually there.
