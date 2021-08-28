package _03_behavioural._02_command._01_command_plus_undo_operations;

public class BankAccountCommand implements Command {
    private BankAccount account;
    private Action action;
    private int amount;
    private boolean succeeded;

    public BankAccountCommand(BankAccount account, Action action, int amount) {
        this.account = account;
        this.action = action;
        this.amount = amount;
    }

    @Override
    public void call() {
        switch (action) {
            case DEPOSIT:
                succeeded = account.deposit(amount);
                break;
            case WITHDRAW:
                succeeded = account.withdraw(amount);
                break;
            default:
        }
    }

    @Override
    public void undo() {
        // This is fundamentally incorrect functionally, just for e.g. purpose
        if (!succeeded) {
            return;
        }
        switch (action) {
            case DEPOSIT:
                account.withdraw(amount);
                break;
            case WITHDRAW:
                account.deposit(amount);
                break;
            default:
        }
    }
}
