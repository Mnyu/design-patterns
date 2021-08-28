package _03_behavioural._01_chain_of_responsibility._02_broker_chain;

public class Creature {
    private Game game;
    private String name;
    private int baseAttack;
    private int baseDefense;

    public Creature(Game game, String name, int baseAttack, int baseDefense) {
        this.game = game;
        this.name = name;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
    }

    public int getAttack() {
        Query query = new Query(name, Query.Argument.ATTACK, baseAttack);
        game.queries.fire(query);
        return query.getResult();
    }

    public int getDefence() {
        Query query = new Query(name, Query.Argument.DEFENSE, baseDefense);
        game.queries.fire(query);
        return query.getResult();
    }

    @Override
    public String toString() {
        return "Creature{" +
                ", name='" + name + '\'' +
                ", Attack=" + getAttack() +
                ", Defense=" + getDefence() +
                '}';
    }

    public Game getGame() {
        return game;
    }

    public String getName() {
        return name;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public int getBaseDefense() {
        return baseDefense;
    }
}
