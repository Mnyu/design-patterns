package _03_behavioural._02_command._01_command_plus_undo_operations;

public class BankAccount {
    private int balance;
    private int overDraftLimit = -500;

    public boolean deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", Balance = " + balance);
        return true;
    }

    public boolean withdraw(int amount) {
        if (balance - amount >= overDraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ", Balance = " + balance);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
