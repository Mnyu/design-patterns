package _03_behavioural._06_memento;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public Memento deposit(int amount) {
        balance += amount;
        return new Memento(balance);
    }

    public void restore(Memento memento) {
        balance = memento.getBalance();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
