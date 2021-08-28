package _03_behavioural._06_memento;

public class MementoDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        Memento m1 = account.deposit(50); // 150
        Memento m2 = account.deposit(25); // 175
        System.out.println(account);

        // restoration to m1
        account.restore(m1);
        System.out.println(account);

        // restoration to m2
        account.restore(m2);
        System.out.println(account);
    }
}
