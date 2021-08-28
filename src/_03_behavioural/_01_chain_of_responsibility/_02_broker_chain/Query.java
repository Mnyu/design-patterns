package _03_behavioural._01_chain_of_responsibility._02_broker_chain;

public class Query {

    enum Argument {
        ATTACK, DEFENSE
    }

    private String creatureName;
    private Argument argument;
    private int result;

    public Query(String creatureName, Argument argument, int result) {
        this.creatureName = creatureName;
        this.argument = argument;
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public String getCreatureName() {
        return creatureName;
    }

    public Argument getArgument() {
        return argument;
    }

    public void setCreatureName(String creatureName) {
        this.creatureName = creatureName;
    }

    public void setArgument(Argument argument) {
        this.argument = argument;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
