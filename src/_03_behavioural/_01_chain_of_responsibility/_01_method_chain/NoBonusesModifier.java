package _03_behavioural._01_chain_of_responsibility._01_method_chain;

public class NoBonusesModifier extends CreatureModifier {

    public NoBonusesModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("No bonuses/curses for  " + creature.getName() + " from now on");
    }
}
// This class shows how to actually disrupt the chain of responsibility and how to cancel it outright.
// We need to make all the modifiers inapplicable to this creature.
// DON'T CALL super.handle()