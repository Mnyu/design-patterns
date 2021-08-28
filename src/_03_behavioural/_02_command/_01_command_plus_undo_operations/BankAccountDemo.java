package _03_behavioural._02_command._01_command_plus_undo_operations;

import com.google.common.collect.Lists;
import com.sun.tools.javac.util.List;

public class BankAccountDemo {
    public static void main(String[] args) {
        final BankAccount account = new BankAccount();
        System.out.println(account);

        List<Command> commands = List.of(
                new BankAccountCommand(account, Action.DEPOSIT, 100),
                new BankAccountCommand(account, Action.WITHDRAW, 1000));

        for (Command c : commands) {
            c.call();
            System.out.println(account);
        }

        for (Command c : Lists.reverse(commands)) {
            c.undo();
            System.out.println(account);
        }
    }
}
